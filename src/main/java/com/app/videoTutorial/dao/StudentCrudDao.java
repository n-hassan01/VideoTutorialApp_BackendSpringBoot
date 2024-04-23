/**
 * 
 */
package com.app.videoTutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.videoTutorial.model.Students;

/**
 * author: Ahmed Raihan
 * date: 4/23/2024
 */
/**
 * this is the dao for student_crud table this is an interface that inherit
 * JpaRepository<dto, data type of primary key> is responsible to create
 * connection with db automatic this interface will act like template for all
 * APIs
 */
public interface StudentCrudDao extends JpaRepository<Students, Integer> {

	@Modifying
	@Query("update Students s set s.full_name = ?1, s.address = ?2, s.age = ?3, s.institute=?4, s.class_level=?5  where s.id = ?6")
	void updateInfoById(String full_name, String address, Integer age, String institute, String class_level, Integer id);

}
