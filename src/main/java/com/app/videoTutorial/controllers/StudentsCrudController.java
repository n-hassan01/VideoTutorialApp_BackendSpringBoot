package com.app.videoTutorial.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.videoTutorial.model.ResponseInfo;
import com.app.videoTutorial.model.Students;
import com.app.videoTutorial.services.StudentCrudService;

@RestController
@RequestMapping("studentCrud")
public class StudentsCrudController {
	@Autowired
	StudentCrudService studentCrudService;

	@GetMapping("all")
	public ResponseInfo<List<Students>> getAllMethod() {
		return studentCrudService.getAllInfos();
	}

	@GetMapping("/{id}")
	public ResponseInfo<Optional<Students>> getMethod(@PathVariable Integer id) {
		return studentCrudService.getInfo(id);
	}

	@PostMapping("add")
	public ResponseInfo<String> postMethod(@RequestBody Students studentCrud) {
		return studentCrudService.saveInfo(studentCrud);
	}

	@DeleteMapping("delete/{id}")
	public ResponseInfo<String> deleteMethod(@PathVariable Integer id) {
		return studentCrudService.deleteInfo(id);
	}

	@DeleteMapping("delete/all")
	public ResponseInfo<String> deleteAllMethod() {
		return studentCrudService.deleteAllInfos();
	}

	@PutMapping("update")
	public ResponseInfo<String> updateMethod(@RequestBody Students studentCrud) {
		return studentCrudService.updateInfo(studentCrud);
	}
	
	

}
