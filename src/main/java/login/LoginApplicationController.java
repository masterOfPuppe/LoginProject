package login;

import io.swagger.models.Model;
import login.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LoginApplicationController {

    // To call this method go to http://localhost:8080/hello/{placeholder}
    @GetMapping("/")
    public String home(org.springframework.ui.Model model) {
        model.addAttribute("user", new User());
        return "login.html";
    }

}
