package practice.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {
        System.out.println("동일한 Tag로 Docker 이미지를 생성하면 새로운 이미지가 하나 더 생길까?");
    }
}
