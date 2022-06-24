package com.sachith.departmentservice.controller;

import com.sachith.departmentservice.entity.DepartmentEntity;
import com.sachith.departmentservice.service.DepartmentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/department")
@AllArgsConstructor
@Slf4j
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping("/")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity department){
        log.info("Department Controller - saveDepartment");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<DepartmentEntity> findDepartmentById(@PathVariable Long id){
        log.info("Department Controller - findDepartmentById");
        return departmentService.findDepartmentById(id);
    }

}
