package com.bbororo5.wednesdayStudy.web;

import com.bbororo5.wednesdayStudy.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 롬복 사용 전
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // 롬복 사용 후
    @GetMapping("/hello/dto")
    /* RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
       name (@RequestParam("name")) 이란 이름으로 넘긴 파라미터를 메소드 파라미터 name(String name)에 저장 */
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}



