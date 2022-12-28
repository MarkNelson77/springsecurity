package biz.global77.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import biz.global77.springsecurity.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
