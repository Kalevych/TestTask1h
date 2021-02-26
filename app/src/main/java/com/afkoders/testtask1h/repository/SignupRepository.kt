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

    val currentUser: MutableLiveData<User> = MutableLiveData<User>(EmptyUser)

    suspend fun signupUser(user: User) {
        withContext(Dispatchers.IO) {

         //   val userFromNetwork = SignupServiceImpl.signupServiceImpl.signupUser()

         //   database.usersDao.deleteAndInsertAll(userFromNetwork.results.asDatabaseModel())

            currentUser.postValue(
               user
            )
        }
    }
}