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

import com.botlie.employeeAssimilation.entity.ThirdNav;
import com.botlie.employeeAssimilation.service.ThirdNavService;



@RestController
@RequestMapping("thirdNave")
@CrossOrigin("*")
public class ThirdNavController {

	@Autowired
	private ThirdNavService thirdNavService;

	@PostMapping("/post")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ThirdNav addNave(@RequestBody ThirdNav thirdNav) {
		ThirdNav addData = this.thirdNavService.addData(thirdNav);
		return addData;
	}

	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<ThirdNav> getNav() {

		List<ThirdNav> data = this.thirdNavService.getData();

		return data;

	}
}
