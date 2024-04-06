/**
 * 
 */
package com.app.videoTutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.videoTutorial.model.SampleCrud;

/**
 * author: Naimul Hassan
 * date: 4/1/2024
 */
/**
 * this is the dao for sample_crud table this is an interface that inherit
 * JpaRepository<dto, data type of primary key> is responsible to create
 * connection with db automatic this interface will act like template for all
 * APIs
 */
public interface SampleCrudDao extends JpaRepository<SampleCrud, Integer> {

	@Modifying
	@Query("update SampleCrud sc set sc.name = ?1, sc.profession = ?2, sc.age = ?3 where sc.id = ?4")
	void updateInfoById(String name, String profession, Integer age, Integer id);

}
