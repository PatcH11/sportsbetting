package ru.argus.sportsbetting.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.argus.sportsbetting.data.dto.create.UserCreateDto;
import ru.argus.sportsbetting.data.dto.get.UserGetDto;
import ru.argus.sportsbetting.data.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserGetDto toGetDto(User user);

    List<UserGetDto> toGetDto(Iterable<User> users);

    @Mapping(target = "id", ignore = true)
    User fromCreateDto(UserCreateDto userCreateDto);
}
