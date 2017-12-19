package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_selected_composite_display_field database table.
 * 
 */
@Embeddable
public class OhrmSelectedCompositeDisplayFieldPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String id;

	@Column(name="composite_display_field_id", insertable=false, updatable=false)
	private String compositeDisplayFieldId;

	@Column(name="report_id", insertable=false, updatable=false)
	private String reportId;

	public OhrmSelectedCompositeDisplayFieldPK() {
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompositeDisplayFieldId() {
		return this.compositeDisplayFieldId;
	}
	public void setCompositeDisplayFieldId(String compositeDisplayFieldId) {
		this.compositeDisplayFieldId = compositeDisplayFieldId;
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
		if (!(other instanceof OhrmSelectedCompositeDisplayFieldPK)) {
			return false;
		}
		OhrmSelectedCompositeDisplayFieldPK castOther = (OhrmSelectedCompositeDisplayFieldPK)other;
		return 
			this.id.equals(castOther.id)
			&& this.compositeDisplayFieldId.equals(castOther.compositeDisplayFieldId)
			&& this.reportId.equals(castOther.reportId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id.hashCode();
		hash = hash * prime + this.compositeDisplayFieldId.hashCode();
		hash = hash * prime + this.reportId.hashCode();
		
		return hash;
	}
}