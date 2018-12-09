package top.snailclimb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.snailclimb.bean.User;
import top.snailclimb.db1.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/query")
    public User testQuery() {
        User user = new User(){
            {
//                setId(100);
                setAge(100);
                setMoney(10000);
                setName("daijiguo");
            }
        };
        userService.insertUser(user);
        return userService.selectUserByName("Daisy");
    }


}

