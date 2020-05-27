package com.mediscreen.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class History {
	
	@Id
	private String id;
	private String notes;
	private Date dateCreation;
	private Date dateUpdate;
	private String idPatient;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation != null ? (Date) dateCreation.clone() : null;
	}
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation != null ? (Date) dateCreation.clone() : null;
	}
	/**
	 * @return the dateUpdate
	 */
	public Date getDateUpdate() {
		return dateUpdate != null ? (Date) dateUpdate.clone() : null;
	}
	/**
	 * @param dateUpdate the dateUpdate to set
	 */
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate != null ? (Date) dateUpdate.clone() : null;
	}
	/**
	 * @return the idPatient
	 */
	public String getIdPatient() {
		return idPatient;
	}
	/**
	 * @param idPatient the idPatient to set
	 */
	public void setIdPatient(String idPatient) {
		this.idPatient = idPatient;
	}
	
	public History() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param notes
	 * @param idPatient
	 */
	public History(String notes, String idPatient) {
		super();
		this.notes = notes;
		this.idPatient = idPatient;
	}
	
	@Override
	public String toString() {
		return "History [id=" + id + ", notes=" + notes + ", idPatient=" + idPatient + "]";
	}
	
	

	
}
