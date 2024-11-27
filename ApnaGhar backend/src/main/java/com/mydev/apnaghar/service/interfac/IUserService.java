package com.mydev.apnaghar.service.interfac;

import com.mydev.apnaghar.dto.LoginRequest;
import com.mydev.apnaghar.dto.Response;
import com.mydev.apnaghar.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}