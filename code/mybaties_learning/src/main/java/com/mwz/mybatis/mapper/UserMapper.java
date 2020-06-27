package com.mwz.mybatis.mapper;

import com.mwz.mybatis.dao.User;

public interface UserMapper {
    User selectUser(String id);
}
