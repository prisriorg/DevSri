package org.prisri.devsri.api

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

data class LoginRequest(val username: String, val password: String)
data class LoginResponse(val auth: Boolean, val token: String?)

interface ApiService {
    @Headers("Content-Type: application/json")
    @POST("login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}
