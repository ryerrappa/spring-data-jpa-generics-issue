package com.example.jparepodemo.dao;

import com.example.jparepodemo.entity.Stuff;

public interface StuffRepository extends ManyEntitiesToOneUserJpaRepository<Stuff, Long> {
}
