package com.sousa.mardoqueu.demopagination.repository;

import com.sousa.mardoqueu.demopagination.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
}
