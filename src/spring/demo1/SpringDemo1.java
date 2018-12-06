package spring.demo1;

/**
 * @program: LeetCode
 * @description: Spring入门
 * @author: Lxm
 * @create: 2018-10-17 16:16
 **/
public class SpringDemo1 {
    //传统方式
    public void demo1(){
        UserService userService = new UserServiceImpl();
        userService.save();
    }

}