package com.coin.simulation;

import com.coin.simulation.upbitapi.UpbitApiRequestClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimulationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimulationApplication.class, args);

//		UpbitApiRequestClient apiRequestClient = new UpbitApiRequestClient();
//		apiRequestClient.marketRequest();
//		apiRequestClient.tickerRequest();
	}
}