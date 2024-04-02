/**
 * 
 */
package com.app.videoTutorial.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.videoTutorial.model.SampleCrud;

/**
 * author: Naimul Hassan
 * date: 4/1/2024
 */
/**
 * this is the dao for sample_crud table
 * this is an interface that inherit JpaRepository<dto, data type of primary key> is responsible to create connection with db automatic
 * this interface will act like template for all APIs
 */
public interface SampleCrudDao extends JpaRepository<SampleCrud, Integer> {

}
