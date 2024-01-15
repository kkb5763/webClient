package com.kbkang.service.impl;

import com.kbkang.service.ExternalApiService;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ExternalApiServiceImpl implements ExternalApiService {

    private final WebClient webClient;

    public ExternalApiServiceImpl() {
        this.webClient = WebClient.create("https://jsonplaceholder.typicode.com");  // 실제 외부 API 주소로 변경
    }

    @Override
    public Mono<String> fetchDataFromExternalApi() {
        return webClient.get()
                .uri("/posts")
                .retrieve()
                .bodyToMono(String.class);
    }

    @Override
    public Mono<String> fetchDataByGet() {
        return webClient.get()
                .uri("/posts/1")
                .retrieve()
                .bodyToMono(String.class);
    }

    @Override
    public Mono<String> fetchDataByPost() {
        return null;
    }
}