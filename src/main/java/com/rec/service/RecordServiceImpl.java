package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.model.Record;

@Service
public class RecordServiceImpl  implements IRecordService{

	
	List<Record> list = List.of(
			
			new Record(1L,"tata motors.GMAIL.COM","tata motors",112L),
			new Record(2L,"Cognizant.GMAIL.COM","Cognizant",115L),
			new Record(3L,"infosys.GMAIL.COM","infosys",113L),
			new Record(4L,"accenture.GMAIL.COM","accenture",115L),
			new Record(5L,"integra.GMAIL.COM","integra",116L),
			new Record(6L,"benz.GMAIL.COM","benz",117L),
			new Record(7L,"iTC.GMAIL.COM","iTC",118L),
			new Record(8L,"cAPGEMINI.GMAIL.COM","cAPGEMINI",119L)
			);
			
	
	
	@Override
	public List<Record> getRecordsOfEmployee(Long eId) {
		
		return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
	}

	

}
