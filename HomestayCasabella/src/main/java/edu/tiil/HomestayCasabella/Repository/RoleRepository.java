package edu.tiil.HomestayCasabella.Repository;

import org.springframework.data.repository.CrudRepository;

import edu.tiil.HomestayCasabella.Model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}