package com.example.springbootapi.api.controller

import com.example.springbootapi.api.model.User
import com.example.springbootapi.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class UserController {
    private lateinit var userService: UserService

    @Autowired
    fun UserController(userService: UserService){
        println("@Autowired annotated, In UserController constructor  ${userService}")
        this.userService = userService
    }
    @GetMapping("/user")
    fun getUser(@RequestParam id: Int): User?{
        println("@GetMapping annotated, In UserController.getUser() function ")
        var user = userService.getUser(id)
        if(user.isPresent){
            return user.get()
        }
        return null
    }
}