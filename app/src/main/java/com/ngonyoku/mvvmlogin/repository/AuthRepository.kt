package com.ngonyoku.mvvmlogin.repository

import com.ngonyoku.mvvmlogin.network.AuthAPI

class AuthRepository(
    private val api: AuthAPI
) : BaseRepository() {
    suspend fun login(email: String, password: String) = safeAPICall {
        api.login(email, password)
    }
}