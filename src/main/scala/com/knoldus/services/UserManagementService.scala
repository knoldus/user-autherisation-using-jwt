package com.knoldus.services

import com.knoldus.contract.{CreateUserRequest, LoginRequest}


class UserManagementService {

  def userLogin(loginRequest: LoginRequest): String ={
    "Login Successful"
  }

  def createUser(createUserRequest: CreateUserRequest):  String = "User Created"

  def protectedContent: String  = "This method is secured"

}



