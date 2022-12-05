package com.example.items

class AuthloginRepository {
    var loginUser: User? = null

  fun login (email: String, pass: String) {
      val user = getUserFromRemoteServer(email, pass)
      loginUser = user
  }

    private fun getUserFromRemoteServer(email: String, pass: String): User? {
        return if (email == "adinol@adinol.ru" && pass == "123456"){
            User(pass, email, "ADINOL")
        }
        else {
            null
        }


    }

}