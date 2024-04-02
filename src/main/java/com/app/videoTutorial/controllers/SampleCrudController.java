/**
 * 
 */
package com.app.videoTutorial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.videoTutorial.dao.ResponseInfo;
import com.app.videoTutorial.model.SampleCrud;
import com.app.videoTutorial.services.SampleCrudService;

/**
 * author: Naimul Hassan
 * date: 4/1/2024
 */
/**
 * this is the entry point for the API to perform crud operation for sample_crud table
 * this controller will act like template for all APIs
 */

@RestController
@RequestMapping("sampleCrud")
public class SampleCrudController {
	
	@Autowired
	SampleCrudService sampleCrudService;

	@GetMapping("all")
	public ResponseInfo<List<SampleCrud>> getAllMethod() {
		System.out.println("eee");

		return sampleCrudService.getAllInfos();
	}

}
