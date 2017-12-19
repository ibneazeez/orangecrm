package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_custom_export database table.
 * 
 */
@Entity
@Table(name="hs_hr_custom_export")
@NamedQuery(name="HsHrCustomExport.findAll", query="SELECT h FROM HsHrCustomExport h")
public class HsHrCustomExport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="export_id")
	private int exportId;

	@Lob
	private String fields;

	@Lob
	private String headings;

	private String name;

	public HsHrCustomExport() {
	}

	public int getExportId() {
		return this.exportId;
	}

	public void setExportId(int exportId) {
		this.exportId = exportId;
	}

	public String getFields() {
		return this.fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public String getHeadings() {
		return this.headings;
	}

	public void setHeadings(String headings) {
		this.headings = headings;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}