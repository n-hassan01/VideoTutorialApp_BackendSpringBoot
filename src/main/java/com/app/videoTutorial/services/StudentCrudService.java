/**
 * 
 */
package com.app.videoTutorial.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import com.app.videoTutorial.dao.StudentCrudDao;
import com.app.videoTutorial.model.ResponseInfo;
import com.app.videoTutorial.model.Students;

/**
 * author: Ahmed Raihan Alif
 * date: 4/22/2024
 */
/**
 * this is the service class for the API to perform crud operation for
 * students table all the data processing according to request will be
 * performed in this class is responsible for return response this service class
 * will act like template for all APIs
 */

@Component
public class StudentCrudService {
	@Autowired
	StudentCrudDao studentCrudDao;

	public ResponseInfo<List<Students>> getAllInfos() {
		ResponseInfo<List<Students>> responseInfo = new ResponseInfo<>();

		try {
			List<Students> response = studentCrudDao.findAll();

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

	public ResponseInfo<Optional<Students>> getInfo(Integer id) {
		ResponseInfo<Optional<Students>> responseInfo = new ResponseInfo<>();

		try {
			Optional<Students> response = studentCrudDao.findById(id);

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully fetched!");
			responseInfo.setData(response);

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(Optional.empty());

		return null;
	}

	public ResponseInfo<String> saveInfo(Students studentCrud) {
		ResponseInfo<String> responseInfo = new ResponseInfo<>();

		try {
			studentCrudDao.save(studentCrud);

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully added!");
			responseInfo.setData(HttpStatus.OK.name());

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(HttpStatus.BAD_REQUEST.name());

		return null;
	}

	public ResponseInfo<String> deleteInfo(Integer id) {
		ResponseInfo<String> responseInfo = new ResponseInfo<>();

		try {
			studentCrudDao.deleteById(id);

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully deleted id: " + id);
			responseInfo.setData(HttpStatus.OK.name());

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(HttpStatus.BAD_REQUEST.name());

		return null;
	}

	public ResponseInfo<String> deleteAllInfos() {
		ResponseInfo<String> responseInfo = new ResponseInfo<>();

		try {
			studentCrudDao.deleteAll();

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully truncated");
			responseInfo.setData(HttpStatus.OK.name());

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(HttpStatus.BAD_REQUEST.name());

		return null;
	}

	/**
	 * using @Transactional annotation
	 * Spring will automatically start and manage a
	 * transaction for the duration of the method execution. This will resolve the
	 * TransactionRequiredException when executing modifying queries.
	 */
	@Transactional
	public ResponseInfo<String> updateInfo(Students studentCrud) {
		ResponseInfo<String> responseInfo = new ResponseInfo<>();

		try {
			studentCrudDao.updateInfoById(studentCrud.getFull_name(), studentCrud.getAddress(), studentCrud.getAge(),
					studentCrud.getInstitute(),studentCrud.getClass_level(),studentCrud.getId());

			responseInfo.setStatusCode(HttpStatus.OK.value());
			responseInfo.setMessage("Successfully updated");
			responseInfo.setData(HttpStatus.OK.name());

			return responseInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		responseInfo.setStatusCode(HttpStatus.BAD_REQUEST.value());
		responseInfo.setMessage("BAD REQUEST");
		responseInfo.setData(HttpStatus.BAD_REQUEST.name());

		return null;
	}
}
