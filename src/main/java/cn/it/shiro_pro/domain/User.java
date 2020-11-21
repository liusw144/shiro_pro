package cn.it.shiro_pro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName：User
 * @Description:用户domain
 * @Author: liusw
 * @Date: 2020/11/21 11:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    //用户对应的角色集合
    private Role role;

}
