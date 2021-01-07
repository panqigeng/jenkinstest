package com.example.springbootjenkins.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

//aaaaaaaaaaaaaaa
//zzzzzzzzzzzzz
<<<<<<< HEAD
    //eeeeeeeeeeeeeeeeeeee
=======
    //lllllllllllllllllll
>>>>>>> 417e216257106bdae9619bc6e305b3309231ff4a
    @RequestMapping("/test")
    public String getHello() {
//        return "hello world jenkins!";
        return "jsp/index-dev2-ok1111111111111.jsp";
    }
}
