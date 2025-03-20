package br.edu.fema.forumfema_2025.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String Hello(String texto) {
        return "Hello World!<br>Pedro Luiz de Barros Junior";
    }
}