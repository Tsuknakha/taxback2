package com.taxback2.test.integration;

import com.taxback2.Taxback2Application;
import com.taxback2.backend.persistence.domain.backend.Role;
import com.taxback2.backend.persistence.domain.backend.User;
import com.taxback2.backend.persistence.domain.backend.UserRole;
import com.taxback2.backend.service.UserService;
import com.taxback2.enums.PlansEnum;
import com.taxback2.enums.RolesEnum;
import com.taxback2.utils.UserUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by Administrator on 6/14/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Taxback2Application.class)
public class UserServiceIntegrationTest {

    @Autowired
    private UserService userService;

    @Test
    public void testCreateNewUser() throws Exception {

        Set<UserRole> userRoles = new HashSet<>();
        User basicUser = UserUtils.createBasicUser();
        userRoles.add(new UserRole(basicUser, new Role(RolesEnum.BASIC)));

        User user = userService.createUser(basicUser, PlansEnum.BASIC, userRoles);
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getId());

    }
}

