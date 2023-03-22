package com.botlie.employeeAssimilation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.SecondNav;
import com.botlie.employeeAssimilation.service.SecondNavService;



@RestController
@RequestMapping("secondNave")
@CrossOrigin("*")
public class SecondNavController {

	@Autowired
	private SecondNavService secondNavService;

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public SecondNav addNave(@RequestBody SecondNav secondNav) {
		SecondNav addData = this.secondNavService.addData(secondNav);
		return addData;
	}

	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<SecondNav> getNav() {

		List<SecondNav> data = this.secondNavService.getData();

		return data;

	}
}
