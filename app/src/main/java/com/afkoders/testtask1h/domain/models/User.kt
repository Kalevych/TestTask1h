package com.afkoders.testtask1h.domain.models

/**
 * Created by Kalevych Oleksandr on 18.02.2021.
 */

data class User(
    val id: String,
    val username: String,
    val mail: String,
)


//fun User.toDbModel() = UserDbModel(this.username, this.mail, this.id)


val EmptyUser = User("", "", "")
