package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application
{

    @RequestMapping("/")
    public String home()
    {
        return "Hello Docker World";
    }
    
    @RequestMapping("/env")
    public String env()
    {
        return "String1" + ":" + "String2";
    }
    
    @RequestMapping("/springcloud")
    public String springcloud()
    {
        return "String3" + ":" + "String4";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

}
