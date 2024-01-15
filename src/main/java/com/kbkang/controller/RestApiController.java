package com.kbkang.controller;


import com.kbkang.service.ExternalApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
// @CrossOrigin  // CORS 허용 
public class RestApiController {


	private ExternalApiService externalApiService;
	@PostMapping("/reqByGet")
	public String reqByGet(@RequestParam("") String token){
		externalApiService.fetchDataByGet();

		return " 접근 성공";
	}

	@PostMapping("/reqByPost")
	public String reqByPost(@RequestParam("") String token){
		externalApiService.fetchDataByPost();
		return " 접근 성공";
	}
}











