package org.spring.springboot.controller;

import org.spring.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void test(){
        testService.testInsert();
        System.out.print("ok");
        return;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public void search(int type){
        if(type==1){
            testService.search();
        }else{
            testService.searchList();
        }
        System.out.print("ok");
        return;
    }
}
