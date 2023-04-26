package com.bbororo5.wednesdayStudy.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter  // 롬복 어노테이션 - 클래스 내의 모든 필드의 Getter 메소드를 자동생성
@NoArgsConstructor  // 롬복 어노테이션 - 기본 생성자 자동 추가, public Posts() {}와 같은 효과

@Entity  // JPA 어노테이션 - 테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id  // JPA 어노테이션 - 해당 테이블의 PK (기본키) 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // JPA 어노테이션 - PK의 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false)  // JPA 어노테이션 - 테이블의 칼럼
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder  // 롬복 어노테이션 - 해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content= content;
    }
}