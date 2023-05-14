package com.paynbuy.product.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ApplicationTests {

//	@Container
//	static MongoDBContainer mongoDBContainer =  new MongoDBContainer();
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add(name: "spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}

	@Test
	void contextLoads() {

	}

}
