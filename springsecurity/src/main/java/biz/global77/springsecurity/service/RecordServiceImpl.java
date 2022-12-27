package biz.global77.springsecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import biz.global77.springsecurity.model.Record;
import biz.global77.springsecurity.repository.RecordRepository;

public class RecordServiceImpl implements RecordService {
	
	@Autowired
	private RecordRepository recordRepository;

	@Override
	public List<Record> getAllRecords() {
		return recordRepository.findAll();
	}

	@Override
	public void saveRecord(Record record) {
		this.recordRepository.save(record);

	}

	@Override
	public Record getRecordById(long id) {
		Optional<Record> optional = recordRepository.findById(id);
		Record record = null;
		if (optional.isPresent()) {
			record = optional.get();
		} else {
			throw new RuntimeException(" Record not found for id :: " + id);
		}
		return record;

	}

	@Override
	public void deleteRecordById(long id) {
		this.recordRepository.deleteById(id);

	}

}
