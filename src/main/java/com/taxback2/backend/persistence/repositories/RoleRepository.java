package com.taxback2.backend.persistence.repositories;

import com.taxback2.backend.persistence.domain.backend.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 6/14/2017.
 */

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
