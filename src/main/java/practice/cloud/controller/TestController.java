package practice.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {
        System.out.println("빌드 캐시 옵션 적용 후 빌드 속도 측정(2번째 시도)");
    }
}
