package com.bbororo5.wednesdayStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;




@EnableJpaAuditing
@SpringBootApplication	/* 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성이 모두 자동으로 설정됨,
특히 이 줄부터 설정을 읽어나가기 때문에 이 클래스는 항상 설정코드의 최상단에 위치해야함. */

// 앞으로 만들 프로젝트의 메인 클래스
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //내장 WAS(Web Application Server) 실행

        /* 스프링 부트는 내장 WAS(웹 애플리케이션 서버)를 지원하며 이를 사용하면 톰캣과 같은 별도의 WAS를 사용하지 않아도 됩니다.
        내장 WAS는 웹 애플리케이션을 실행하기 위한 WAS가 애플리케이션 내부에 포함되어 있기 때문에, 별도의 WAS 설치와 설정이 필요하지 않습니다.
        스프링 부트로 만들어진 Jar파일로 실행하면 됨. 내장 WAS를 통해 언제 어디서나 같은 환경에서 스프링 부트 배포할 수 있음.*/
    }
}