package com.sousa.mardoqueu.demopagination.service;

import com.sousa.mardoqueu.demopagination.model.Student;
import com.sousa.mardoqueu.demopagination.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepository repository;


    @Override
    public List<Student> findPaginated(int pageNo, int pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Student> pageResult = repository.findAll(paging);
        return pageResult.toList();
    }
}
