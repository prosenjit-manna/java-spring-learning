package ibm.prosenjitmanna.springlearning.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public static String hello() {
        return "Hello World!";
    }
}
