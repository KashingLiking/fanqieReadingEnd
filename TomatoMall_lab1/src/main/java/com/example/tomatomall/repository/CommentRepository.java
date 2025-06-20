package com.example.tomatomall.repository;

import com.example.tomatomall.po.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    List<Comment> findByProductId(Integer productId);
    @Query("SELECT c FROM Comment c WHERE c.account.userid = :userId")
    List<Comment> findByAccountId(@Param("userId") Integer userId);
}