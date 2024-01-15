package com.kbkang.service;

import reactor.core.publisher.Mono;

public interface ExternalApiService {
    Mono<String> fetchDataFromExternalApi();

    Mono<String> fetchDataByGet();

    Mono<String> fetchDataByPost();
}
