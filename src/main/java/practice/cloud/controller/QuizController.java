package practice.cloud.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {

    @GetMapping("/hello")
    public Hello helloWorld(){
        return new Hello("hello-world");
    }

    @Getter
    static class Hello {
        private final String result;

        Hello(String result) {
            this.result = result;
        }
    }
}