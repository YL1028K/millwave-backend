package com.millwave.controller;

import com.millwave.common.api.CommonResult;
import com.millwave.common.service.RedisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/devices")
public class DeviceController {

    @Resource
    private RedisService redisService;

    @GetMapping()
    @ResponseBody
    public CommonResult getDeviceList(){

        return CommonResult.success(new Object());
    }


    @GetMapping("/{deviceId}")
    @ResponseBody
    public CommonResult getDeviceDetail(){
        return CommonResult.success(new Object());
    }

    @PostMapping("/{deviceId}")
    @ResponseBody
    public CommonResult updateDevice(){
        return CommonResult.success(new Object());
    }

    @DeleteMapping("/{deviceId}")
    @ResponseBody
    public CommonResult deleteDevice(){
        return CommonResult.success(new Object());
    }

    @PostMapping("/bind")
    @ResponseBody
    public CommonResult bindDeviceToSpace(){
        return CommonResult.success(new Object());
    }
}
