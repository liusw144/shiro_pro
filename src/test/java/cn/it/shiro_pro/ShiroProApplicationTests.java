package cn.it.shiro_pro;

import cn.it.shiro_pro.dao.UserMapperDao;
import cn.it.shiro_pro.domain.Permissions;
import cn.it.shiro_pro.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShiroProApplicationTests {

    @Autowired
    private UserMapperDao userMapper;

    @Test
   public void contextLoads() {
        User admin = userMapper.queryUserByUsername("admin");
        System.out.println(admin.toString());
        Permissions permission = userMapper.queryPermissionByUsername("admin");
        System.out.println(permission.toString());
    }
}
