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
 * this is the dao for students table this is an interface that inherit
 * JpaRepository<dto, data type of primary key> is responsible to create
 * connection with db automatic this interface will act like template for all
 * APIs
 */
public interface StudentsDao extends JpaRepository<Students, Integer> {

	@Modifying
	@Query("update Students s set s.fullName = ?1, s.address = ?2, s.age = ?3, s.institute=?4, s.classLevel=?5  where s.id = ?6")
	void updateInfoById(String fullName, String address, Integer age, String institute, String classLevel, Integer id);

}
