package com.springboot.service.impl;

import com.springboot.dao.CityRepository;
import com.springboot.model.City;
import com.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author FaceFeel
 * @Created 2018-04-17 13:38
 **/
@Service("cityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {

        return cityRepository.findAll();
    }
}
