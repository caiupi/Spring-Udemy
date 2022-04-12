package com.in28minutes.learning.jpa.jpain10steps;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.Entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	@Autowired
	private UserDAOService userDaoService;

	private static final org.jboss.logging.Logger log =  LoggerFactory.logger(UserDaoServiceCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		long insert = userDaoService.inser(user);
		log.info("New user is created :"+insert);
	}

}
