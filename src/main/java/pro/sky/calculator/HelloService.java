package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class HelloService implements HelloServiceInterface {
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
    @RequestMapping(path = ("/hello"))
    public String answerHello(@RequestParam("name") String userName) {
        return "hello"+" "+ userName;
    }
}
