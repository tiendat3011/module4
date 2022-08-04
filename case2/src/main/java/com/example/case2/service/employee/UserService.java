package com.example.case2.service.employee;

import com.example.case2.model.employee.UserApp;

import java.util.List;

public interface UserService {
    UserApp create(UserApp userApp);

    void create (String userName, String password);

    List<UserApp> findAll();
}
