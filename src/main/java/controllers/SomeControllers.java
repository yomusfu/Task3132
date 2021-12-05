package controllers;

import liquibase.pro.packaged.G;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeControllers {

    @GetMapping("/hello")
    public String sayHello(){
        return "<h1> Hello/<h1>" +
                "<br>" + "<h2><i> I am Nuskhaev Erencen <i> and it's my Java Practice site</h2><br>" +
                "My vk - https://vk.com/yomusfu <br>" +
                "My GitHub - https://github.com/yomusfu" +
                "<h1> Thanks for visit</h1>";
    }
}
