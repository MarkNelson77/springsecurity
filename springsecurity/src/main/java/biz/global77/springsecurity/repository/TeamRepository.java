package biz.global77.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import biz.global77.springsecurity.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
