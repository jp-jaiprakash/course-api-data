package com.ibm.in.starter.topic;

import org.springframework.data.repository.CrudRepository;
//explain spring data JPA
public interface TopicRepository extends CrudRepository<Topic, String> {

	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTop(String id)
	
	
	
}
