package sia.tacocloud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//by using @Controller with @GetMapping it is expecting a view for template
//using @Controller with @ResponseBody will instead return "home" string
//CAN DELETE NOW THAT WEB CONFIG CLASS HANDLES VIEW
@Controller("homeController")
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
