package com.sousa.mardoqueu.demopagination.service;

import com.sousa.mardoqueu.demopagination.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStudentService {
    List<Student> findPaginated(int pageNo, int pageSize);
}
