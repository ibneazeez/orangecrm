package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_custom_import database table.
 * 
 */
@Entity
@Table(name="hs_hr_custom_import")
@NamedQuery(name="HsHrCustomImport.findAll", query="SELECT h FROM HsHrCustomImport h")
public class HsHrCustomImport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="import_id")
	private int importId;

	@Lob
	private String fields;

	@Column(name="has_heading")
	private byte hasHeading;

	private String name;

	public HsHrCustomImport() {
	}

	public int getImportId() {
		return this.importId;
	}

	public void setImportId(int importId) {
		this.importId = importId;
	}

	public String getFields() {
		return this.fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public byte getHasHeading() {
		return this.hasHeading;
	}

	public void setHasHeading(byte hasHeading) {
		this.hasHeading = hasHeading;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}