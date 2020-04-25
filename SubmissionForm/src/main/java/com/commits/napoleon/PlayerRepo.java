package com.commits.napoleon;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface PlayerRepo extends JpaRepository<Players, Integer>{

}
