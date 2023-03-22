package com.botlie.employeeAssimilation.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botlie.employeeAssimilation.entity.JsonEntity;
import com.botlie.employeeAssimilation.repository.JsonRepository;
import com.botlie.employeeAssimilation.service.JsonService;

@RequestMapping("image")
@RestController
@CrossOrigin("*")

public class JsonController {
	
	@Autowired
	private JsonService jsonService;

	@Autowired
	private JsonRepository jsonRepository;
	String dir="C:\\Users\\lenovo\\OneDrive\\Desktop\\Angular Projects\\dev_anas_4.0_admin\\emp-assimlation_com-admin\\src\\assets\\images";
	
//	DataEntity dataEntity1=new DataEntity();
	@PostMapping("/add")
	public String addFile(@ModelAttribute() JsonEntity jsonEntity) throws IOException {
		
//		dataEntity1=(DataEntity) dataEntity.getImage();
		
		Files.copy(jsonEntity.getImage().getInputStream(), Paths.get(dir + File.separator+jsonEntity.getImage().getOriginalFilename()),
				StandardCopyOption.REPLACE_EXISTING);
		
//		dataEntity.setName(dataEntity.getImage().getOriginalFilename());
		jsonEntity.setPhoto(jsonEntity.getImage().getOriginalFilename());
		jsonEntity.setType(jsonEntity.getType());
		jsonEntity.setUserName(jsonEntity.getUserName());
		jsonEntity.setPassword(jsonEntity.getPassword());
	     
		
		this.jsonRepository.save(jsonEntity);
		return "Image is added suucessfully";
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<JsonEntity>> readAll(){
		List<JsonEntity> list = (List<JsonEntity>)this.jsonService.getAll();
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/getSingle/{Id}")
	public Optional<JsonEntity> getSingle(@PathVariable Integer Id) {
		return this.jsonService.getSingle(Id);
	}
	
	@GetMapping("/getLastId")
	public ResponseEntity<JsonEntity> getStatus()
	{
		return new ResponseEntity<JsonEntity>(this.jsonService.getStatus(),HttpStatus.OK);
	}
	

}
