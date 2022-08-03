package com.example.case2.repository.employee;

import com.example.case2.model.employee.Position;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface PositionRepository extends PagingAndSortingRepository<Position, Integer> {

    @Query(value = "select * from `position`", nativeQuery = true)
    List<Position> findAll();

}
