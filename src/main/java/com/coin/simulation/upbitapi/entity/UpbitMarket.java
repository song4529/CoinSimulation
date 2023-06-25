package com.coin.simulation.upbitapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class UpbitMarket {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String market;

    private String marketName;

    public void setMarket(String market) {
        this.market = market;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}