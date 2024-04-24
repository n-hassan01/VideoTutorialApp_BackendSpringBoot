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
 * this is the dto for students table all the properties of this class should be
 * as same as the columns of the table this dto will act like template for all
 * APIs
 */

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String fullName;
	private Integer age;
	private String address;
	private String institute;
	private String classLevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getClassLevel() {
		return classLevel;
	}

	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}

}
