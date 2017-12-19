package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_available_group_field database table.
 * 
 */
@Embeddable
public class OhrmAvailableGroupFieldPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="report_group_id")
	private String reportGroupId;

	@Column(name="group_field_id", insertable=false, updatable=false)
	private String groupFieldId;

	public OhrmAvailableGroupFieldPK() {
	}
	public String getReportGroupId() {
		return this.reportGroupId;
	}
	public void setReportGroupId(String reportGroupId) {
		this.reportGroupId = reportGroupId;
	}
	public String getGroupFieldId() {
		return this.groupFieldId;
	}
	public void setGroupFieldId(String groupFieldId) {
		this.groupFieldId = groupFieldId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmAvailableGroupFieldPK)) {
			return false;
		}
		OhrmAvailableGroupFieldPK castOther = (OhrmAvailableGroupFieldPK)other;
		return 
			this.reportGroupId.equals(castOther.reportGroupId)
			&& this.groupFieldId.equals(castOther.groupFieldId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.reportGroupId.hashCode();
		hash = hash * prime + this.groupFieldId.hashCode();
		
		return hash;
	}
}