package com.springboot.service;

import com.springboot.model.City;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-04-17 13:37
 **/
public interface CityService {

    List<City> findAll();
}
