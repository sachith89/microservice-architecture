package com.sachith.user.service;

import com.sachith.user.dto.UserDepartmentResponse;
import com.sachith.user.entiry.DepartmentEntity;
import com.sachith.user.entiry.UserEntity;
import com.sachith.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class UserService {

    private UserRepository repository;
    private RestTemplate restTemplate;

    public UserEntity saveUser(UserEntity user){
        log.info("User Service - saveUser");
        return repository.save(user);
    }


    public UserDepartmentResponse getUserWithDepartment(Long userId){
        log.info("User Service - getUserWithDepartment");
        UserDepartmentResponse response = new UserDepartmentResponse();
        Optional<UserEntity> user = repository.findById(userId);

        DepartmentEntity department = restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/department/" + user.get().getDepartmentId(),
                DepartmentEntity.class
        );

        response.setDepartment(department);
        response.setUser(user.get());

        return response;
    }
}
