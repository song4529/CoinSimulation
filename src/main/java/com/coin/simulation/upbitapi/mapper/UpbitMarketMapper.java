package com.coin.simulation.upbitapi.mapper;

import com.coin.simulation.upbitapi.dto.UpbitMarketDTO;
import com.coin.simulation.upbitapi.entity.UpbitMarket;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UpbitMarketMapper {
    UpbitMarketMapper INSTANCE = Mappers.getMapper(UpbitMarketMapper.class);

    @Mapping(source = "market", target = "market")
    @Mapping(source = "koreanName", target = "marketName")
    UpbitMarket map(UpbitMarketDTO marketDTO);
}