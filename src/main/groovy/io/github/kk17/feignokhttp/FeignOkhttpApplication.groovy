package io.github.kk17.feignokhttp

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignOkhttpApplication {

	static void main(String[] args) {
		SpringApplication.run FeignOkhttpApplication, args
	}
}
