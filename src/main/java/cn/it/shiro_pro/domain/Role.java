package cn.it.shiro_pro.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName：Role
 * @Description:角色domain
 * @Author: liusw
 * @Date: 2020/11/21 11:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private Integer id;
    private String roleName;

}
