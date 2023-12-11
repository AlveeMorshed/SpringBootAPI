package com.example.springbootapi.service

import com.example.springbootapi.api.model.User
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class UserService {

    private lateinit var userList: List<User>

    init {
        println("@Service annotated, In UserService INIT block")
        userList = ArrayList()
        var user1 = User(1, "Ida", 32, "ida@gmail.com")
        var user2 = User(2, "Alvee", 25, "alvee@gmail.com")
        var user3 = User(3, "Nur", 27, "nur@gmail.com")
        var user4 = User(4, "Chisty", 25, "chisty@gmail.com")
        var user5 = User(5, "Gazi", 28, "gazi@gmail.com")

        userList = listOf(user1,user2, user3, user4, user5)
    }

    fun getUser(id: Int): Optional<User> {
        println("In UserService.getUser() function")
        var optional = Optional.empty<User>()

        for (user in userList){
            if(id == user.id){
                optional = Optional.of(user)
                return optional
            }
        }
        return optional
    }



}