package com.einherjar.mango.admin.controller;

import com.einherjar.mango.admin.service.SysUserService;
import com.einherjar.mango.core.http.HttpResult;
import com.einherjar.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author :   einherjar
 * @file :   SysUserController.java
 * @create :   2019-09-11 21:13
 * @Description :
 */
@RestController
@RequestMapping("user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }

    @GetMapping("/findOne")
    public Object findOne() {
        return sysUserService.selectOne(1L);
    }

    @PostMapping("/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
