package com.knoldus.contract

import play.api.libs.json.{Json, Reads}

case class LoginRequest(
                         email: String,
                         password: String
                       )

object LoginRequest {
  implicit val loginRequestReads: Reads[LoginRequest] = Json.reads[LoginRequest]
}