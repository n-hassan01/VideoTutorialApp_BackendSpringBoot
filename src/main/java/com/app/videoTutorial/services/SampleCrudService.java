/**
 * 
 */
package com.app.videoTutorial.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.app.videoTutorial.dao.ResponseInfo;
import com.app.videoTutorial.dao.SampleCrudDao;
import com.app.videoTutorial.model.SampleCrud;

/**
 * author: Naimul Hassan
 * date: 4/1/2024
 */
/**
 * this is the service class for the API to perform crud operation for
 * sample_crud table all the data processing according to request will be
 * performed in this class is responsible for return response this service class
 * will act like template for all APIs
 */

@Component
public class SampleCrudService {
	@Autowired
	SampleCrudDao sampleCrudDao;

	public ResponseInfo<List<SampleCrud>> getAllInfos() {
		ResponseInfo<List<SampleCrud>> responseInfo = new ResponseInfo<>();

		try {
			List<SampleCrud> response = sampleCrudDao.findAll();

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully fetched!");
			responseInfo.setData(response);

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(new ArrayList<>());

		return null;
	}
}
