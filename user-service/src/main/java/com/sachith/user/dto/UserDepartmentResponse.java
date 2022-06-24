package com.sachith.user.dto;

import com.sachith.user.entiry.DepartmentEntity;
import com.sachith.user.entiry.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartmentResponse {

    private UserEntity user;
    private DepartmentEntity department;
}
