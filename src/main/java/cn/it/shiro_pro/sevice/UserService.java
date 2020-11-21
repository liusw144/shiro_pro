package cn.it.shiro_pro.sevice;/**
 * @ClassName：UserService
 * @Description:
 * @Author: liusw
 * @Date: 2020/11/21 12:01
 */

import cn.it.shiro_pro.domain.Permissions;
import cn.it.shiro_pro.domain.User;

/**
 * @Interface:UserService
 * @Author liusw
 * @Date
 * @Description TODO
 **/
public interface UserService {

     User queryUserByUsername(String username);

     Permissions queryPermissionByUsername(String username);
}
