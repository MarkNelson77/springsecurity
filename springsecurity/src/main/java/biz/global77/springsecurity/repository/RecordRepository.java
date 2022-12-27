package biz.global77.springsecurity.repository;

import biz.global77.springsecurity.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
