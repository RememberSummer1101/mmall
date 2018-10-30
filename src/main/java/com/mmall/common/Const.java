package com.mmall.common;/*
 * create by qwy91 on 2018/10/25
 **/

import javax.management.relation.Role;

public class Const {
    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
