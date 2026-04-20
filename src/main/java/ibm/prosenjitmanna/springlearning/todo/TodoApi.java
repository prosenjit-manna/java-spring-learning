package ibm.prosenjitmanna.springlearning.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoApi {
   @GetMapping("/todo/list")
    public String getTodoList() {
        return "Todo list";
    }
}
