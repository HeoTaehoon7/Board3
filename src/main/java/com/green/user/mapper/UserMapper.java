package com.green.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.green.user.dto.UserDto;

@Mapper
public interface UserMapper {

	void insertUser(UserDto userDto);

}
