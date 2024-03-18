package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot hhhhhhh!";
    }

    @GetMapping("/user")
    public String index1() {
        return "Hello World from Spring Boot User!";
    }

    @GetMapping("/admin")
    public String index2() {
        return "Hello World from Spring Boot admin!";
    }
}
