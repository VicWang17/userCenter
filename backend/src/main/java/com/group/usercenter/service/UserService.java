package com.group.usercenter.service;

import com.group.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Vic Wang
* @description 针对表【user】的数据库操作Service
* @createDate 2024-01-19 22:21:03
*/
public interface UserService extends IService<User> {

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);
}
