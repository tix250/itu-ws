package com.javainuse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javainuse.entities.Signalement;

public interface MikaRepository extends JpaRepository<Signalement, Integer>{

}
