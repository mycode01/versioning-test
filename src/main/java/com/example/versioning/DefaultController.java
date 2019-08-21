package com.example.versioning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("x")
@ApiVersion("latest")
public class DefaultController {
    @RequestMapping("a")
    public String a(){
        System.out.println("a");
        return "a";
    }
    @RequestMapping("b")
    @ApiVersion("1")
    public String b1(){
        System.out.println("b1");
        return "b1";
    }
    @RequestMapping("b")
    @ApiVersion("2")
    public String b(){
        System.out.println("b");
        return "b";
    }
    @RequestMapping("c")
    @ApiVersion({"1","3"})
    public String c(){
        System.out.println("c");
        return "c";
    }

}
