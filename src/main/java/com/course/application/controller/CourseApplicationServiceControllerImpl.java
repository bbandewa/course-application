package com.course.application.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.course.application.pojo.University;
import com.course.application.service.CourseApplicationServiceServiceImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


@RestController
@RequestMapping("/courseapplication")
public class CourseApplicationServiceControllerImpl implements CourseApplicationServiceController {

	private static final Logger LOGGER = Logger.getLogger(CourseApplicationServiceControllerImpl.class);
	
	@Autowired
	CourseApplicationServiceServiceImpl courseApplicationServiceServiceImpl;
	
	@Override
	@RequestMapping(value="/getUniversity",method=RequestMethod.GET)
	public ResponseEntity<List<University>> getUniversity() {
		
		List<University> universities = null;
		
		try {
			universities = courseApplicationServiceServiceImpl.getUniversity();
		} catch (JsonParseException e) {
			LOGGER.error(e.getStackTrace());
			return new ResponseEntity<List<University>>(universities, HttpStatus.NO_CONTENT);
		} catch (JsonMappingException e) {
			LOGGER.error(e.getStackTrace());
			return new ResponseEntity<List<University>>(universities, HttpStatus.NO_CONTENT);
		} catch (IOException e) {
			LOGGER.error(e.getStackTrace());
			return new ResponseEntity<List<University>>(universities, HttpStatus.NO_CONTENT);
		}
		
		
		return new ResponseEntity<List<University>>(universities, HttpStatus.OK);
	}

}
