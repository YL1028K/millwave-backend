package com.millwave.controller;

import com.millwave.common.api.CommonResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/space")
public class SpaceController {

    @GetMapping("/list/{userId}")
    @ResponseBody
    public CommonResult getSpaceList(){
        return CommonResult.success(new Object());
    }

    @GetMapping("/{spaceId}")
    @ResponseBody
    public CommonResult getSpaceDetail(){
        return CommonResult.success(new Object());
    }

    @PutMapping("/{spaceId}")
    @ResponseBody
    public CommonResult updateSpace(){
        return CommonResult.success(new Object());
    }

    @DeleteMapping("/{spaceId}")
    @ResponseBody
    public CommonResult deleteSpace(){
        return CommonResult.success(new Object());
    }

}
