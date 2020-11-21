package cn.it.shiro_pro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName：Permissions
 * @Description:权限domain
 * @Author: liusw
 * @Date: 2020/11/21 11:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Permissions {
    private Integer id;
    private String permissionName;
    private Role role;
}