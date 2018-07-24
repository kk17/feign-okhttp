package io.github.kk17.feignokhttp_service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("io.github.kk17")
@EnableFeignClients
class FeignOkhttpApplication2 {

	static void main(String[] args) {
		SpringApplication.run FeignOkhttpApplication2, args
	}
}
