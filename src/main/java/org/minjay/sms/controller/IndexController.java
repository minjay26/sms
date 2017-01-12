package org.minjay.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Luo Min on 2017/1/12.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String index(){

        return "index";
    }
}
