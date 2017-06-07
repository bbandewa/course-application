package com.course.application.dao;

import java.io.IOException;
import java.util.List;

import com.course.application.pojo.University;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface CourseApplicationServiceDAO {

	public List<University> getUniversity() throws JsonParseException, JsonMappingException, IOException;
}
