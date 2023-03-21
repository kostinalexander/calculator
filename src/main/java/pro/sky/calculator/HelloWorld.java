package pro.sky.calculator;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
    private final HelloServiceInterface helloService;
    public HelloWorld(HelloServiceInterface helloService){
        this.helloService = helloService;
    }
    @RequestMapping("/")
    //@GetMapping
    public String hello(){
        return helloService.hello();
    }
    @RequestMapping(path = ("/hello"))
   // @GetMapping()
    public String answerHello(@RequestParam("name") String userName) {
        return  helloService.answerHello(userName);
    }
}
