package com.example.week7.domain.post;

import com.example.week7.domain.member.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Pageable;


public interface PostRepository extends JpaRepository<Post, Long> {


    @EntityGraph(attributePaths = {"member"})
    Page<Post> findPostsByMember(Pageable pageable, Member member);
}
