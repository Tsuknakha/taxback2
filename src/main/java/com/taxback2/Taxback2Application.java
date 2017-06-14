package com.taxback2;

import com.taxback2.backend.persistence.domain.backend.Role;
import com.taxback2.backend.persistence.domain.backend.User;
import com.taxback2.backend.persistence.domain.backend.UserRole;
import com.taxback2.backend.service.UserService;
import com.taxback2.enums.PlansEnum;
import com.taxback2.enums.RolesEnum;
import com.taxback2.utils.UserUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class Taxback2Application implements CommandLineRunner {

	/** The application logger */
	private static final Logger LOG = LoggerFactory.getLogger(Taxback2Application.class);

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(Taxback2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = UserUtils.createBasicUser();
		Set<UserRole> userRoles = new HashSet<>();
		userRoles.add(new UserRole(user, new Role(RolesEnum.PRO)));
		LOG.debug("Creating user with username {}", user.getUsername());
		userService.createUser(user, PlansEnum.PRO, userRoles);
		LOG.info("User {} created", user.getUsername());
	}
}