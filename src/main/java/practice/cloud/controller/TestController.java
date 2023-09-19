package practice.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {
        System.out.println("워크플로우 불필요한 파이프라인 제거 후 빌드 테스트(3번째 시도)");
    }
}
