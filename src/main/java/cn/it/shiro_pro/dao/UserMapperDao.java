package cn.it.shiro_pro.dao;

import cn.it.shiro_pro.domain.Permissions;
import cn.it.shiro_pro.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName：UserMapperDao
 * @Description:
 * @Author: liusw
 * @Date: 2020/11/21 11:31
 */
@Mapper
public interface UserMapperDao {
    User queryUserByUsername(@Param("username") String username);

    Permissions queryPermissionByUsername(@Param("username") String username);
}
