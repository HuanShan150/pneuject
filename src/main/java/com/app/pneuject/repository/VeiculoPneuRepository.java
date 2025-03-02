package com.app.pneuject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pneuject.model.VeiculoPneu;

@Repository
public interface VeiculoPneuRepository extends JpaRepository<VeiculoPneu, Long> { }
