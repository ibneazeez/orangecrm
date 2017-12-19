package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_selected_group_field database table.
 * 
 */
@Embeddable
public class OhrmSelectedGroupFieldPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="group_field_id", insertable=false, updatable=false)
	private String groupFieldId;

	@Column(name="summary_display_field_id", insertable=false, updatable=false)
	private String summaryDisplayFieldId;

	@Column(name="report_id", insertable=false, updatable=false)
	private String reportId;

	public OhrmSelectedGroupFieldPK() {
	}
	public String getGroupFieldId() {
		return this.groupFieldId;
	}
	public void setGroupFieldId(String groupFieldId) {
		this.groupFieldId = groupFieldId;
	}
	public String getSummaryDisplayFieldId() {
		return this.summaryDisplayFieldId;
	}
	public void setSummaryDisplayFieldId(String summaryDisplayFieldId) {
		this.summaryDisplayFieldId = summaryDisplayFieldId;
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
		if (!(other instanceof OhrmSelectedGroupFieldPK)) {
			return false;
		}
		OhrmSelectedGroupFieldPK castOther = (OhrmSelectedGroupFieldPK)other;
		return 
			this.groupFieldId.equals(castOther.groupFieldId)
			&& this.summaryDisplayFieldId.equals(castOther.summaryDisplayFieldId)
			&& this.reportId.equals(castOther.reportId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.groupFieldId.hashCode();
		hash = hash * prime + this.summaryDisplayFieldId.hashCode();
		hash = hash * prime + this.reportId.hashCode();
		
		return hash;
	}
}