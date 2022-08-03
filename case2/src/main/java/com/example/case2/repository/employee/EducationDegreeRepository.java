package com.example.case2.repository.employee;

import com.example.case2.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface EducationDegreeRepository extends PagingAndSortingRepository<EducationDegree, Integer> {

    @Query(value = "select * from education_degree", nativeQuery = true)
    List<EducationDegree> findAll();
}
