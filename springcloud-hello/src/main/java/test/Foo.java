package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Foo {
    @RequestMapping("/foo")
    public String foo(){
        return "foo";
    }
}
