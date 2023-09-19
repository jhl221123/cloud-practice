package practice.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public void test() {
        System.out.println("actions/setup-java@v3: 캐시 옵션 사용 후 빌드 속도 측정(반복실행)");
    }
}
