package cn.it.shiro_pro.sevice.impl;

import cn.it.shiro_pro.dao.UserMapperDao;
import cn.it.shiro_pro.domain.Permissions;
import cn.it.shiro_pro.domain.User;
import cn.it.shiro_pro.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName：UserServiceImpl
 * @Description:
 * @Author: liusw
 * @Date: 2020/11/21 12:02
 */
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapperDao userMapper;

    @Override
    public User queryUserByUsername(String username) {

        return userMapper.queryUserByUsername(username);
    }
    @Override
    public Permissions queryPermissionByUsername(String username) {
        return userMapper.queryPermissionByUsername(username);
    }
}
