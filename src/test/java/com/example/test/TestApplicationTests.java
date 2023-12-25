package com.example.test;

import com.example.test.dao.PersonDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestApplicationTests {

	@Autowired
	private PersonDAO personDAO;
	@Test
	void contextLoads() {
		personDAO.printListPeople(personDAO.inAgeRange(25, 30));
	}

}
