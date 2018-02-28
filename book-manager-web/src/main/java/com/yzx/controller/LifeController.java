package com.yzx.controller;

import com.yzx.service.LifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/1/29 0029.
 */
@Controller
@RequestMapping(value = "life")
public class LifeController {
    @Autowired
    private LifeService lifeService;

    @RequestMapping(value = "index")
    @ResponseBody
    public String index() {
        return lifeService.getMessage();
    }
}
