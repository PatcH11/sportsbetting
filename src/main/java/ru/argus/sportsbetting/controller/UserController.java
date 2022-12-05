package ru.argus.sportsbetting.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import ru.argus.sportsbetting.data.dto.create.UserCreateDto;
import ru.argus.sportsbetting.data.dto.get.UserGetDto;
import ru.argus.sportsbetting.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @MutationMapping
    public UserGetDto createUser(@Argument("userCreate") UserCreateDto user) {
        return userService.create(user);
    }

    @QueryMapping
    public UserGetDto findUserByUsername(@Argument String username) {
        return userService.findByUsername(username);
    }
}
