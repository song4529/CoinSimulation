package com.coin.simulation.upbitapi.repository;

import com.coin.simulation.upbitapi.entity.UpbitMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpbitMarketRepository extends JpaRepository<UpbitMarket, String> {
}