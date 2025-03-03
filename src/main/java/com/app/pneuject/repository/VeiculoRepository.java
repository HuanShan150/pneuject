package com.app.pneuject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pneuject.model.Veiculo;
import com.app.pneuject.model.VeiculoPneu;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> { 

    @Query("SELECT vp FROM VeiculoPneu vp WHERE vp.veiculo.id = :veiculoId")
    List<VeiculoPneu> findByVeiculoId(@Param("veiculoId") Long veiculoId);
}
