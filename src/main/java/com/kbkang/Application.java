package com.kbkang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//
//		// WebClient를 사용하여 REST API 호출
////		WebClient webClient = WebClient.create("https://jsonplaceholder.typicode.com");
//		WebClient webClient = WebClient.create("https://dev2.coocon.co.kr:8443/sol/gateway/scrap_wapi_103.jsp");
//
//
//
//		webClient.post()
//				.uri("")
//				.contentType(MediaType.APPLICATION_FORM_URLENCODED)
//				.body(BodyInserters.fromValue("{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}"))
//				.retrieve()
//				.bodyToMono(String.class)
//				.subscribe(response -> {
//					System.out.println("POST Response:");
//					System.out.println(response);
//				});
//
//		String userId = "1";
////		webClient.get()
////				.uri("/users/{userId}", userId)
////				.retrieve()
////				.bodyToMono(String.class)
////				.subscribe(response -> {
////					System.out.println("API Response:");
////					System.out.println(response);
////				});
	}
}
