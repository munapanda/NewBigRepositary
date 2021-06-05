package com.example.demo.utils;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Course;

@Component
public class CourseeUtils {
	public void calcaulteynamic(Course crs) {
		Double fee=crs.getCfee();
		Double discount=fee*10.0/100;
		Double gst=fee*18.0/100;
		crs.setDiscount(discount);
		crs.setGst(gst);
		
	}
	
	
	

}
