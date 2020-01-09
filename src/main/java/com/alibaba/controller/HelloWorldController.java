package com.alibaba.controller;

import com.alibaba.common.APIResponse;
import com.alibaba.common.util.SimpleUtil;
import com.alibaba.pojo.User;
import com.google.common.collect.ImmutableList;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Validated
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    private static final ImmutableList initUser =
                    ImmutableList.of(new User(SimpleUtil.uuid(),"李一",new Date(),"ly12356"),
                                     new User(SimpleUtil.uuid(),"赵二",new Date(),"zr12356"),
                                     new User(SimpleUtil.uuid(),"张三",new Date(),"zs12356"));

    @GetMapping("/defaultUser")
    public APIResponse defaultUser(String name,@NotNull String username,@Min(0)@Max(1) int sex,@RequestParam(defaultValue = "18") int age){
        User user = new User(SimpleUtil.uuid(),StringUtils.hasText(name) ? name : "张格",new Date(),username);
        user.setOptime(new Date());
        return APIResponse.instance(user);
    }

    @PostMapping("userList")
    public APIResponse userList(@NotNull String name,@NotNull Integer age){
        return APIResponse.instance(initUser);
    }

}
