package com.mediscreen.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class History {
	
	@Id
	private String id;
	private String notes;
	private Date dateCreation;
	private Date dateUpdate;
	private String idPatient;

}
