package com.mmall.service;
/*
 * create by qwy91 on 2018/10/25
 **/

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import net.sf.jsqlparser.schema.Server;

public interface IUserService {
    ServerResponse<User> login(String username, String password);
}
