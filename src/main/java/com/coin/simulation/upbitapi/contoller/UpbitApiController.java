package com.coin.simulation.upbitapi.contoller;

import com.coin.simulation.upbitapi.Client.UpbitApiClient;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@RequestMapping("/api/upbit")
public class UpbitApiController {
    private final UpbitApiClient upbitApiClient;

    public UpbitApiController(UpbitApiClient upbitApiClient) {
        this.upbitApiClient = upbitApiClient;
    }

    @GetMapping("/market/all")
    public JsonNode getMarketInfo() throws IOException {
        String url = "https://api.upbit.com/v1/market/all";
        return upbitApiClient.getJsonInfo(url);
    }

    @GetMapping("/candles/minutes/{unit}")
    public JsonNode getCandleMinutesInfo(@PathVariable String unit, @RequestParam String market, @RequestParam String count) throws IOException {
        String url = "https://api.upbit.com/v1/candles/minutes/" + unit + "?market=" + market + "&count=" + count;
        return upbitApiClient.getJsonInfo(url);
    }

    @GetMapping("/candles/days")// 일 캔들
    public JsonNode getCandleDaysInfo(@RequestParam String market, @RequestParam String count) throws IOException {
        String url = "https://api.upbit.com/v1/candles/days?market=" + market + "&count=" + count;
        return upbitApiClient.getJsonInfo(url);
    }

    @GetMapping("/candles/weeks")// 주 캔들
    public JsonNode getCandleWeeksInfo(@RequestParam String market, @RequestParam String count) throws IOException {
        String url = "https://api.upbit.com/v1/candles/weeks?market=" + market + "&count=" + count;
        return upbitApiClient.getJsonInfo(url);
    }

    @GetMapping("/candles/months")// 월 캔들
    public JsonNode getCandleMonthsInfo(@RequestParam String market, @RequestParam String count) throws IOException {
        String url = "https://api.upbit.com/v1/candles/months?market=" + market + "&count=" + count;
        return upbitApiClient.getJsonInfo(url);
    }

    @GetMapping("/ticker")// 현재가 정보
    public JsonNode getTickerInfo(@RequestParam String markets) throws IOException {
        String url = "https://api.upbit.com/v1/ticker?markets=" + markets;
        return upbitApiClient.getJsonInfo(url);
    }
}