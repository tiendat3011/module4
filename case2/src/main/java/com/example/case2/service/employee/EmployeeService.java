package com.example.case2.service.employee;

import com.example.case2.model.employee.Employee;
import com.example.case2.model.employee.dto.EmployeeDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface EmployeeService {

   Page<Employee> findAll (Pageable pageable, String name);


   void save (Employee employee);

   void create (EmployeeDto employeeDto);

   List<Employee> findAll();

   void delete (int id);

   Employee findById(int id);

   void update(String employeeName,
               String employeeBirthday,
               String employeeIdCard,
               double employeeSalary,
               String employeePhone,
               String employeeEmail,
               String employeeAddress,
               int positionId,
               int educationDegreeId,
               int divisionId,
               String userName,
               int id);
}
