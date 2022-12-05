package ru.argus.sportsbetting.service;

import ru.argus.sportsbetting.data.dto.create.UserCreateDto;
import ru.argus.sportsbetting.data.dto.get.UserGetDto;

public interface UserService {

    UserGetDto create(UserCreateDto userCreateDto);

    UserGetDto findByUsername(String username);
}
