package com.millwave.controller;

import com.millwave.common.api.CommonResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    @ResponseBody
    public CommonResult register(String wxCode) {
        //todo open_id insert user_app
        return CommonResult.success(new Object());
    }

    @DeleteMapping
    @ResponseBody
    public CommonResult unregister(String wxCode) {
        //todo delete_flag = 1
        return CommonResult.success(new Object());
    }

}
