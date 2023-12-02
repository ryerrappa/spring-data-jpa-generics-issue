package com.example.jparepodemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
import java.util.UUID;

@NoRepositoryBean
public interface RelatedToUserJpaRepository<T, ID> extends JpaRepository<T, ID> {

    Optional<T> findByIdAndUser_Id(ID entityId, UUID userId);

    Optional<T> findByIdAndUser_Username(ID entityId, String userName);

    long deleteByIdAndUser_Id(ID entityId, UUID userId);

    long deleteByIdAndUser_Username(ID entityId, String username);

    boolean existsByIdAndUser_Id(ID entityId, UUID userId);

    boolean existsByIdAndUser_Username(ID entityId, String username);

    boolean existsByUser_Id(UUID id);

    boolean existsByUser_Username(String username);

}
