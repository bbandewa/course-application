package com.course.application.dao;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.course.application.pojo.University;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class CourseApplicationServiceDAOImpl implements CourseApplicationServiceDAO {

	private static final Logger LOGGER = Logger.getLogger(CourseApplicationServiceDAOImpl.class);
	
	@Value("${university.json.url}")
	private String urlString;
	
	@Override
	public List<University> getUniversity() throws JsonParseException, JsonMappingException, IOException {
		
		URL url = new URL(urlString);
		
		ObjectMapper mapper = new ObjectMapper();
		List<University> universities = mapper.readValue(url, new TypeReference<List<University>>(){});
		
		LOGGER.info("Universities: "+universities.toString());
		return universities;
	}

}
