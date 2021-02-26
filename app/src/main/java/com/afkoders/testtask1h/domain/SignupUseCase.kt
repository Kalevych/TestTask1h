package com.afkoders.testtask1h.domain

import androidx.lifecycle.MutableLiveData
import com.afkoders.testtask1h.domain.models.EmptyUser
import com.afkoders.testtask1h.domain.models.User
import com.afkoders.testtask1h.repository.SignupRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Created by Kalevych Oleksandr on 26.02.2021.
 */

class SignupUseCase {

    private val signupRepository = SignupRepository()

    val currentUser: MutableLiveData<User> = MutableLiveData<User>(EmptyUser)

    suspend fun signupUser(user: User) {
        withContext(Dispatchers.IO) {

            signupRepository.putUser(user)

           // could be

            //   val userFromNetwork = SignupServiceImpl.signupServiceImpl.signupUser()

            //   database.usersDao.deleteAndInsertAll(userFromNetwork.results.asDatabaseModel())

            currentUser.postValue(
                signupRepository.getUser()
            )
        }
    }
}