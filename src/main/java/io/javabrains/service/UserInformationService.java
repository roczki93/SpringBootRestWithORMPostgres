package io.javabrains.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import io.javabrains.model.UserInformation;
import io.javabrains.repo.UserInformationRepository;
import org.springframework.data.domain.Page;

@Service
public class UserInformationService {
	
	@Autowired
	private UserInformationRepository userInformation;
	
	List<UserInformation> userInformations = new ArrayList<>(Arrays.asList(
			new UserInformation("Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework"),
			new UserInformation("Spring2 Framework", "Spring Frame2ork", "Spring Fr2amework", "Spring 2Framework", "Spring Framew2rk", "2Spring Framework", "Spring Framework", "Spring Framework")
			));
	
	public List<UserInformation> getAllUserInformation() {
		List<UserInformation> userInfo = new ArrayList<>();
		userInformation.findAll().
		forEach(userInfo::add);
		return userInfo;
	}
	public List<UserInformation> getTenUserInformation() {
		List<UserInformation> userInfo = new ArrayList<>();
		userInformation.findAll().
		forEach(userInfo::add);
		List<UserInformation> tmp= new ArrayList<>();
		for(int i=0; i<userInfo.size();i++)
		{
			tmp.add(userInfo.get(i));
			if(i==9) break;
		}
		return tmp;
	}
	

	public void process(UserInformation data){
		userInformation.save(data);
	};
	
	public UserInformation getUserInformation(Long id) {
		return userInformation.findOne(id);
	}
	
	public void updateUserInformation(long id, UserInformation data) {
		userInformation.save(data);
	}
	
	public void deleteUserInformation(long id) {
		userInformation.delete(id);
	}
//	List<UserInformation> userInformations = new ArrayList<>(Arrays.asList(
//			new UserInformation(1,"Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework"),
//			new UserInformation(1,"Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework"),
//			new UserInformation(1,"Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework","Spring Framework")			
//		));
	
//	public List<UserInformation> getAllUserInformations(){
//		List<UserInformation> userInformations = new ArrayList<>();
//		userInformation.findOne()
//		.forEach(userInformations::add);
//		return userInformations;
//	}
}
//package io.javabrains.service;
////package io.javabrains.springbootstarter.topic;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import io.javabrains.model.UserInformation;
//import io.javabrains.repo.UserInformationRepository;
//@Service
//public class UserInformationService {
//	@Autowired
//	private UserInformationRepository userInformationRepository;
//	List<UserInformation> topics = new ArrayList<>(Arrays.asList(
//			new UserInformation("spring2","Spring Framework","Spring Framework Description"),
//			new UserInformation("java2","Java Framework","Spring Framework Description"),
//			new UserInformation("other2","other   Framework","Spring Framework Description")				
//			));
//}
//
//
//
//
//
//
//@Service
//public class TopicService {
//	
//	@Autowired
//	private TopicRepository topicRepository;
//	
//	List<Topic> topics = new ArrayList<>(Arrays.asList(
//			new Topic("spring2","Spring Framework","Spring Framework Description"),
//			new Topic("java2","Java Framework","Spring Framework Description"),
//			new Topic("other2","other   Framework","Spring Framework Description")				
//			));
//	public List<Topic> getAllTopics(){
//		List<Topic> topics = new ArrayList<>();
//		topicRepository.findAll()
//		.forEach(topics::add);
//		return topics;
//	}
//	
//	public Topic getTopic(String id) {
//		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//		return topicRepository.findOne(id);
//	}
//
//	public void addTopic(Topic topic) {
//		//topics.add(topic);
//		topicRepository.save(topic);
//	}
//
//	public void updateTopic(String id, Topic topic) {
////		for(int i=0; i < topics.size(); i++) {
////			Topic t = topics.get(i);
////			if(t.getId().equals(id)) {
////				topics.set(i, topic);
////				return;
////			}
////		}
//		topicRepository.save(topic);
//	}
//
//	public void deleteTopic(String id) {
////		topics.removeIf(t -> t.getId().equals(id));
////		return;
//		topicRepository.delete(id);
//	}
//}
