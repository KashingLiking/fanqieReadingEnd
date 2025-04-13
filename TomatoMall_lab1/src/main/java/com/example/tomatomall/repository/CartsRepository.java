package com.example.tomatomall.repository;

import com.example.tomatomall.po.Account;
import com.example.tomatomall.po.Carts;
import com.example.tomatomall.vo.CartItemVO;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CartsRepository extends JpaRepository<Carts, Integer> {

    // 支持String类型ID的查询
    @Query("SELECT p FROM Product p WHERE p.id = :id")
    Optional<Carts> findById(@Param("id") String id);

    // 关联查询
    @EntityGraph(attributePaths = {"specifications", "stockpile"})
    Optional<Carts> findWithAssociationsById(Integer id);

    List<Carts> findByAccount(Account account);
}