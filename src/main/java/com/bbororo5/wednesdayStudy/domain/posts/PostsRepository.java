package com.bbororo5.wednesdayStudy.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity 클래스, PK 타입>을 상속 - CRUD 메소드 자동 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {
}