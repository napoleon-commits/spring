package com.commits.napoleon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="players", path="players")
public interface PlayersRepo extends JpaRepository<Players, Integer>{

}
