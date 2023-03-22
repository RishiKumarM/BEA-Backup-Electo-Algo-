package com.botlie.employeeAssimilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.FirstNav;
import com.botlie.employeeAssimilation.service.FirstNavService;

@RestController
@RequestMapping("firstNave")
@CrossOrigin("*")
public class FirstNavController {

	@Autowired
	private FirstNavService firstNavService;

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<FirstNav> addNave(@RequestBody FirstNav firstNav) {
		FirstNav addData = this.firstNavService.addData(firstNav);
		return new ResponseEntity<FirstNav>(addData, HttpStatus.ACCEPTED);
	}

	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<FirstNav> getNav() {

		List<FirstNav> data = this.firstNavService.getData();

		return data;

	}
}
