package com.app.service;

import com.app.dto.SignUpRequest;
import com.app.dto.UserResponseDTO;

//Nothing to do with spring security : it's job currently is user registration
public interface IUserService {
	UserResponseDTO registerUser(SignUpRequest request);
	
	UserResponseDTO inviteUser(SignUpRequest request);
}
