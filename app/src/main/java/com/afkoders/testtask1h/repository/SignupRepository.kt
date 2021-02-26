package com.afkoders.testtask1h.repository

import androidx.lifecycle.MutableLiveData
import com.afkoders.testtask1h.domain.models.EmptyUser
import com.afkoders.testtask1h.domain.models.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by Kalevych Oleksandr on 26.02.2021.
 */


class SignupRepository() {
    private var user: User? = null

    fun putUser(user: User){
        this.user = user
    }

    fun getUser() = user
}