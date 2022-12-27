package biz.global77.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import biz.global77.springsecurity.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
