/**
 * 
 */
package com.app.videoTutorial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * author: Ahmed Raihan
 * date: 4/23/2024
 */
/**
 * this is the dto for student_crud table all the properties of this class should
 * be as same as the columns of the table this dto will act like template for all APIs
 */

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String full_name;
	private Integer age;
	private String address;
	private String institute;
	private String class_level;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getClass_level() {
		return class_level;
	}
	public void setClass_level(String class_level) {
		this.class_level = class_level;
	}
	
	

	

}

