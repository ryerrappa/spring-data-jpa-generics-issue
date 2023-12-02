package com.example.jparepodemo.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface ManyEntitiesToOneUserJpaRepository<T, ID> extends RelatedToUserJpaRepository<T, ID> {

    Page<T> findByUser_Id(UUID id, Pageable pageable);

    Page<T> findByUser_Username(String username, Pageable pageable);

    long countByUser_Id(UUID id);

    long countByUser_Username(String username);
}
