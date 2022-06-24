package com.sachith.departmentservice.service;

import com.sachith.departmentservice.entity.DepartmentEntity;
import com.sachith.departmentservice.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentService {

    private DepartmentRepository repository;

    public DepartmentEntity saveDepartment(DepartmentEntity department) {
        log.info("Department Service - saveDepartment");
        return repository.save(department);
    }

    public Optional<DepartmentEntity> findDepartmentById(Long id) {
        log.info("Department Service - findDepartmentById");
        return repository.findById(id);
    }
}
