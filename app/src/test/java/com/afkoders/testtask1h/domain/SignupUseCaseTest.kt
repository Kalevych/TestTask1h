package com.afkoders.testtask1h.domain

import com.afkoders.testtask1h.domain.models.User
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

/**
 * Created by Kalevych Oleksandr on 26.02.2021.
 */


class SignupUseCaseTest {


    val signupUseCase = SignupUseCase()
    val fakeUser = User("fakeId", "Username", "Mail")

    @Test
    fun putUser() {

        runBlocking {
            signupUseCase.signupUser(fakeUser)

            Assert.assertEquals(
                signupUseCase.currentUser.value?.username.toString(),
                fakeUser.username
            )
        }
    }
}