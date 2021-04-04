package com.pgsb.repositories.user;

import java.util.Optional;

import com.pgsb.core.user.FollowRelation;
import com.pgsb.core.user.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    // User save(User user); 이미 CrudRepository에 정의되어 있으므로, 다시 선언할 필요 없다

    Optional<User> findById(String id);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
