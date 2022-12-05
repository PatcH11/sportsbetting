package ru.argus.sportsbetting.service.impl;

import org.springframework.stereotype.Service;
import ru.argus.sportsbetting.data.dto.create.UserCreateDto;
import ru.argus.sportsbetting.data.dto.get.UserGetDto;
import ru.argus.sportsbetting.data.entity.User;
import ru.argus.sportsbetting.data.mapper.UserMapper;
import ru.argus.sportsbetting.data.repository.UserRepository;
import ru.argus.sportsbetting.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private UserRepository userRepository;

    public UserServiceImpl(UserMapper userMapper,
                           UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserGetDto create(UserCreateDto userCreateDto) {
        User user = userMapper.fromCreateDto(userCreateDto);

        return userMapper.toGetDto(userRepository.save(user));
    }

    @Override
    public UserGetDto findByUsername(String username) {
        Optional<User> optionalUser = userRepository.findByUsername(username);

        if (optionalUser.isPresent()) {
            return userMapper.toGetDto(optionalUser.get());
        } else {
            throw new RuntimeException("No user with this username was found.");
        }
    }
}
