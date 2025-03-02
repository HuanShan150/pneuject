package com.app.pneuject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pneuject.model.Pneu;

@Repository
public interface PneuRepository extends JpaRepository<Pneu, Long> { }
