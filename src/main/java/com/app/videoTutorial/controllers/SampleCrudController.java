/**
 * 
 */
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
import com.app.videoTutorial.model.SampleCrud;
import com.app.videoTutorial.services.SampleCrudService;

/**
 * author: Naimul Hassan
 * date: 4/1/2024
 */
/**
 * this is the entry point for the API to perform crud operation for sample_crud
 * table this controller will act like template for all APIs
 */

@RestController
@RequestMapping("sampleCrud")
public class SampleCrudController {

	@Autowired
	SampleCrudService sampleCrudService;

	@GetMapping("all")
	public ResponseInfo<List<SampleCrud>> getAllMethod() {
		return sampleCrudService.getAllInfos();
	}

	@GetMapping("/{id}")
	public ResponseInfo<Optional<SampleCrud>> getMethod(@PathVariable Integer id) {
		return sampleCrudService.getInfo(id);
	}

	@GetMapping("/byName/{name}")
	public ResponseInfo<List<SampleCrud>> getByNameMethod(@PathVariable String name) {
		return sampleCrudService.getInfoByName(name);
	}

	@PostMapping("add")
	public ResponseInfo<String> postMethod(@RequestBody SampleCrud sampleCrud) {
		return sampleCrudService.saveInfo(sampleCrud);
	}

	@DeleteMapping("delete/{id}")
	public ResponseInfo<String> deleteMethod(@PathVariable Integer id) {
		return sampleCrudService.deleteInfo(id);
	}

	@DeleteMapping("delete/all")
	public ResponseInfo<String> deleteAllMethod() {
		return sampleCrudService.deleteAllInfos();
	}

	@PutMapping("update")
	public ResponseInfo<String> updateMethod(@RequestBody SampleCrud sampleCrud) {
		return sampleCrudService.updateInfo(sampleCrud);
	}

}
