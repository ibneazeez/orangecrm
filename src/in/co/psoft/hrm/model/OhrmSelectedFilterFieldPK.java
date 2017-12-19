package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_selected_filter_field database table.
 * 
 */
@Embeddable
public class OhrmSelectedFilterFieldPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="report_id", insertable=false, updatable=false)
	private String reportId;

	@Column(name="filter_field_id", insertable=false, updatable=false)
	private String filterFieldId;

	public OhrmSelectedFilterFieldPK() {
	}
	public String getReportId() {
		return this.reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getFilterFieldId() {
		return this.filterFieldId;
	}
	public void setFilterFieldId(String filterFieldId) {
		this.filterFieldId = filterFieldId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmSelectedFilterFieldPK)) {
			return false;
		}
		OhrmSelectedFilterFieldPK castOther = (OhrmSelectedFilterFieldPK)other;
		return 
			this.reportId.equals(castOther.reportId)
			&& this.filterFieldId.equals(castOther.filterFieldId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.reportId.hashCode();
		hash = hash * prime + this.filterFieldId.hashCode();
		
		return hash;
	}
}