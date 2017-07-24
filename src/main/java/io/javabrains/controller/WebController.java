package io.javabrains.controller;

import java.util.ArrayList;
import java.util.List;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.model.UserInformation;
import io.javabrains.repo.UserInformationRepository;
import io.javabrains.service.UserInformationService;
//import io.javabrains.service.UserInformationService;
//import io.javabrains.springbootstarter.topic.PathVariable;
//import io.javabrains.springbootstarter.topic.Topic;



@RestController
public class WebController {
	
	@Autowired
	UserInformationService repository;
 
	@RequestMapping("/api/v1/userinfo")
	public List<UserInformation> getTenUserInformation() {
		return repository.getTenUserInformation();
	}	
	@RequestMapping("/api/v1/userinfo/all")
	public List<UserInformation> getAllUserInformation() {
		return repository.getAllUserInformation();
	}	
	@RequestMapping("/api/v1/userinfo/{id}")
	public UserInformation getUserInformation(@PathVariable long id) {
		return repository.getUserInformation(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/api/v1/userinfo")
	public void addUserInformation(@RequestBody UserInformation data) {
		repository.process(data);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/api/v1/userinfo/{id}")
	public void updateTopic(@RequestBody UserInformation data, @PathVariable long id) {
		repository.updateUserInformation(id, data);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/api/v1/userinfo/{id}")
	public void deleteTopic(@PathVariable long id) {
		repository.deleteUserInformation(id);
	}
//	@RequestMapping("/save")
//	public String process(){
//			repository.save(new UserInformation("Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework", "Spring Framework"));
//			repository.save(new UserInformation("Spring2 Framework", "Spring Frame2ork", "Spring Fr2amework", "Spring 2Framework", "Spring Framew2rk", "2Spring Framework", "Spring Framework", "Spring Framework"));
//			return "Done";
//	};
//	public List<Topic> getAllTopics(){
//		List<Topic> topics = new ArrayList<>();
//		topicRepository.findAll()
//		.forEach(topics::add);
//		return topics;
//	}
//	@RequestMapping("/api/v1/userinfo")
//	public List<UserInformation> getAllUserInformation() {
//		List<UserInformation> userInfo = new ArrayList<>();
//		repository.findAll().
//		forEach(userInfo::add);
//		return userInfo;
//	}
	
//	@RequestMapping("/api/v1/userinfo/{id}")
//	public String findById(@PathVariable("id") long id) {
//		String result ="";
//		result = repository.findOne(id).toString();
//		return result;
//	}
//	@RequestMapping("/api/v1/userinfo")
////	public List<UserInformation> getAllUserInformations() {
//	public String getAllUserInformations(){
//		String result = "[";
//		for(UserInformation cust : userInformationService.findAll()){
//			result += "{" + cust.toString() + "}";
//		}
////		return userInformationService.getAllUserInformations();
//		return result +"]";
//	}
	
	//topicService;
	
//	@RequestMapping("/api/v1/userinfo")
//	public List<UserInformation> getAllUserInformations() {
//		return repository.findAll();
//	}
//	
//	@RequestMapping("/api/v1/userinfo/{id}")
//	public UserInformation getUserInformation(@PathVariable String id) {
//		return repository.getUserInformation(id);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST, value="/api/v1/userinfo")
//	public void addUserInformation(@RequestBody UserInformation userInformation) {
//		repository.addUserInformation(userInformation);
//	}
//	@RequestMapping(method=RequestMethod.PUT, value="/api/v1/userinfo/{id}")
//	public void updateUserInformation(@RequestBody UserInformation userInformation, @PathVariable String id) {
//		repository.updateUserInformation(id, userInformation);
//	}
//	@RequestMapping(method=RequestMethod.DELETE, value="/api/v1/userinfo/{id}")
//	public void deleteUserInformation(@PathVariable String id) {
//		repository.deleteUserInformation(id);
//	}
}