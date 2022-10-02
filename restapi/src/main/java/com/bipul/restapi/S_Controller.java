package com.bipul.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bipul.restapi.entity.userData;

@RestController
public class S_Controller {

@GetMapping("/bs")
public List<userData> getAllStudent(){
List<userData> studentList = new ArrayList<>();
userData s1 = new userData(1, "Bipul", "Sardar", "Odisha", 88);
userData s2 = new userData(2, "Radha", "Kumari", "Ayodha", 99);

studentList.add(s1);
studentList.add(s2);

return studentList;
}
}