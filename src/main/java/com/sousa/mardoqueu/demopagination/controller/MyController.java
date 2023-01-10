package com.sousa.mardoqueu.demopagination.controller;

import com.sousa.mardoqueu.demopagination.model.Student;
import com.sousa.mardoqueu.demopagination.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/student/{pageNo}/{pageSize}")
    private List<Student> getPaginated(@PathVariable int pageNo, @PathVariable int pageSize){
        return studentService.findPaginated(pageNo, pageSize);
    }
}
