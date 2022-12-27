package biz.global77.springsecurity.service;

import java.util.List;
import biz.global77.springsecurity.model.Record;

public interface RecordService {
	List<Record> getAllRecords();
	void saveRecord(Record record);
	Record getRecordById(long id);
	void deleteRecordById(long id);
}
