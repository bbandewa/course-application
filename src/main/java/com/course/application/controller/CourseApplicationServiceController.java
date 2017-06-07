package com.course.application.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.course.application.pojo.University;

public interface CourseApplicationServiceController {


	public ResponseEntity<List<University>> getUniversity();
	
}
