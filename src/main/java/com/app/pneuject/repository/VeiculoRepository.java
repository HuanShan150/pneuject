package com.app.pneuject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pneuject.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> { }
