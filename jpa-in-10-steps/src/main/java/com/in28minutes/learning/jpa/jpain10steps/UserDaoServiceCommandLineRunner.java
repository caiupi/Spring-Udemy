package com.in28minutes.learning.jpa.jpain10steps;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steps.Entity.User;
import com.in28minutes.learning.jpa.jpain10steps.service.UserDAOService;
import com.in28minutes.learning.jpa.jpain10steps.service.UsesrRepository;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	@Autowired
	private UsesrRepository userRepository;

	private static final org.jboss.logging.Logger log = LoggerFactory.logger(UserDaoServiceCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Jack", "Admin");
		userRepository.save(user);
		log.info("New user is created :" + user);
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User retrived :" + userWithIdOne);

		List<User> users = userRepository.findAll();
		log.info("All users :"+users);
		userRepository.deleteAll();
		log.info("delete all users :"+users);
	}

}
