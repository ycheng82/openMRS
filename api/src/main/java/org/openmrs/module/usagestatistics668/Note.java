package org.openmrs.module.usagestatistics668;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

/**
 * The object that represents one row in our patientnotes table. This object is
 * used to get data out and to put data into the database via the
 * {@link NoteService} class. <br/>
 * <br/>
 * See the /metadata/Note.hbm.xml file for the mapping from this file to the
 * database table. <br/>
 * <br/>
 * 
 */
public class Note extends BaseOpenmrsData {

	private Integer id; // the primary key colum
	private Patient patient; // the patient this note was written for
	private String title; // the subject of this note
	private String text; // the content of this note

	/**
	 * Default constructore. Hibernate demands a no-argument constructor so that
	 * it can make this objects easily.
	 */
	public Note() {
	}

	/**
	 * The primary key for this Note. Auto generated by the database.
	 * 
	 * @see org.openmrs.OpenmrsObject#getId()
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * The primary key for this Note. If this is null, the database will
	 * generate the integer primary key because we marked the patientnotes.id
	 * column to auto_increment.
	 * <br/><br/>
	 * 
	 * @see org.openmrs.OpenmrsObject#setId(java.lang.Integer)
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * @param patient
	 *            the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}
