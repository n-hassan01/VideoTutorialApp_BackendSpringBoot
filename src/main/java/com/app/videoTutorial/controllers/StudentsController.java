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
import com.app.videoTutorial.services.StudentsService;

@RestController
@RequestMapping("students")
public class StudentsController {
	@Autowired
	StudentsService studentsService;

	@GetMapping("all")
	public ResponseInfo<List<Students>> getAllMethod() {
		return studentsService.getAllInfos();
	}

	@GetMapping("/{id}")
	public ResponseInfo<Optional<Students>> getMethod(@PathVariable Integer id) {
		return studentsService.getInfo(id);
	}

	@PostMapping("add")
	public ResponseInfo<String> postMethod(@RequestBody Students studentCrud) {
		return studentsService.saveInfo(studentCrud);
	}

	@DeleteMapping("delete/{id}")
	public ResponseInfo<String> deleteMethod(@PathVariable Integer id) {
		return studentsService.deleteInfo(id);
	}

	@DeleteMapping("delete/all")
	public ResponseInfo<String> deleteAllMethod() {
		return studentsService.deleteAllInfos();
	}

	@PutMapping("update")
	public ResponseInfo<String> updateMethod(@RequestBody Students studentCrud) {
		return studentsService.updateInfo(studentCrud);
	}

}
