package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_selected_display_field database table.
 * 
 */
@Embeddable
public class OhrmSelectedDisplayFieldPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String id;

	@Column(name="display_field_id", insertable=false, updatable=false)
	private String displayFieldId;

	@Column(name="report_id", insertable=false, updatable=false)
	private String reportId;

	public OhrmSelectedDisplayFieldPK() {
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDisplayFieldId() {
		return this.displayFieldId;
	}
	public void setDisplayFieldId(String displayFieldId) {
		this.displayFieldId = displayFieldId;
	}
	public String getReportId() {
		return this.reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmSelectedDisplayFieldPK)) {
			return false;
		}
		OhrmSelectedDisplayFieldPK castOther = (OhrmSelectedDisplayFieldPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.displayFieldId.equals(castOther.displayFieldId)
			&& this.reportId.equals(castOther.reportId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.displayFieldId.hashCode();
		hash = hash * prime + this.reportId.hashCode();
		
		return hash;
	}
}