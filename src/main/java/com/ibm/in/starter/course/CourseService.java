package com.ibm.in.starter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//In spring business services are basically singletons
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
/*	
	List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring framework","Basics of spring"),
			new Topic("python","Django framework","Basics of python"),
			new Topic("android","Android framework","Basics of Android")
			
			));*/

	public List<Course> getAllCourses(String topicId){
		//return topics;
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		
		return courses;
	}
	
	public Course getCourse(String id){
//		courseRepository.findByName("");
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course)
	{
		//topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse( Course course) {

		courseRepository.save(course);
		
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
}
