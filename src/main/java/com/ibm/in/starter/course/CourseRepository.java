package com.ibm.in.starter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
//explain spring data JPA
public interface CourseRepository extends CrudRepository<Course, String> {

	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTop(String id)
	
	public List<Course> getCoursesByTopic(String topicId);
	
	public List<Course> findByName(String name);
	
	public List<Course> findByDescription(String description);
	
	public List<Course> findByTopicId(String topicId);
	
	
}
