package com.taxback2.backend.persistence.repositories;

import com.taxback2.backend.persistence.domain.backend.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 6/14/2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
