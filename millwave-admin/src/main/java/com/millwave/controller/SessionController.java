package com.millwave.controller;

import com.millwave.common.api.CommonResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {

    @GetMapping()
    @ResponseBody
    public CommonResult getSession(){
        //todo 1、根据wx_code获取open_id,
        // 2、若库中不存在该open_id,则返回401，app进行注册;
        // 3、生成session，存入redis，过期时间为一天；
        return CommonResult.success(new Object());
    }

    @GetMapping("/check")
    @ResponseBody
    public CommonResult checkSession(){
        //todo 查询缓存中session信息
        return CommonResult.success(new Object());
    }
}
