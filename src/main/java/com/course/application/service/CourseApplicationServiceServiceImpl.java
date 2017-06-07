package com.course.application.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.application.controller.CourseApplicationServiceControllerImpl;
import com.course.application.dao.CourseApplicationServiceDAOImpl;
import com.course.application.pojo.University;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


@Service
public class CourseApplicationServiceServiceImpl implements CourseApplicationServiceService {

	private static final Logger LOGGER = Logger.getLogger(CourseApplicationServiceServiceImpl.class);
	
	@Autowired
	CourseApplicationServiceDAOImpl courseApplicationServiceDAOImpl;
	
	@Override
	public List<University> getUniversity() throws JsonParseException, JsonMappingException, IOException {
		
		return courseApplicationServiceDAOImpl.getUniversity();
	}

}
