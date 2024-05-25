package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.entity.TouristContact;
import com.entity.TouristMaster;
import com.service.TouristService;

@SpringBootApplication
public class TouristManagementSystemApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(TouristManagementSystemApplication.class, args);
		
//		TouristMaster tourist = new TouristMaster();
//		tourist.setName("siva");
//		tourist.setAddress("Hyderabad");
//		tourist.setDate("30/09/2000");
//		tourist.setBookingAmount(1000);
//		TouristContact contact1 = new TouristContact();
//		TouristContact contact2 = new TouristContact();
//		contact1.setPhoneNumber("99299922");
//		contact2.setPhoneNumber("99339944");
//		tourist.addPhone(contact1);
//		tourist.addPhone(contact2);
		
		TouristService tService = applicationContext.getBean("service",TouristService.class);
		 Optional<TouristMaster> tourist = tService.display(1);
		 if(tourist.isPresent()) {
			 
			 System.out.println(tourist);
		 }
		 else {
			 System.out.println("notfound");
		 }
	}

}
