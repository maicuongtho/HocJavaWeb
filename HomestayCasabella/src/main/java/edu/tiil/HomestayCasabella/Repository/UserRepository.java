package edu.tiil.HomestayCasabella.Repository;

import org.springframework.data.repository.CrudRepository;

import edu.tiil.HomestayCasabella.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByEmail(String email);

}