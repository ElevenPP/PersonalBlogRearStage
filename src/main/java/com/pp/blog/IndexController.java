package com.pp.blog;


import com.pp.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String Index(){

//         int i = 9/0;
        String blog = null;
        if(blog == null){
            throw  new NotFoundException("博客不存在");
        }
        return "index";
    }
}