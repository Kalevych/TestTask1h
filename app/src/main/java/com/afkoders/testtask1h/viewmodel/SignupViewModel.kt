package com.afkoders.testtask1h.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.afkoders.testtask1h.domain.SignupUseCase
import com.afkoders.testtask1h.domain.models.User
import com.afkoders.testtask1h.repository.SignupRepository
import kotlinx.coroutines.launch

/**
 * Created by Kalevych Oleksandr on 26.02.2021.
 */


class SignupViewModel(application: Application) : AndroidViewModel(application) {

    private val signupUseCase = SignupUseCase()

  fun signupUser(username: String, mail: String) {
        viewModelScope.launch {
            signupUseCase.signupUser(User(getRandomUUID(), username, mail))
        }
    }

    private fun getRandomUUID(): String =
        "AMLKklsadaskldasl,kflsv"


    val currentUser = signupUseCase.currentUser


    class Factory(val app: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(SignupViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return SignupViewModel(app) as T
            }
            throw IllegalArgumentException("Unable to construct viewmodel")
        }
    }
}