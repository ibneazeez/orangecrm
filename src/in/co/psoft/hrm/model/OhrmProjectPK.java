package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_project database table.
 * 
 */
@Embeddable
public class OhrmProjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="project_id")
	private int projectId;

	@Column(name="customer_id")
	private int customerId;

	public OhrmProjectPK() {
	}
	public int getProjectId() {
		return this.projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public int getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmProjectPK)) {
			return false;
		}
		OhrmProjectPK castOther = (OhrmProjectPK)other;
		return 
			(this.projectId == castOther.projectId)
			&& (this.customerId == castOther.customerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectId;
		hash = hash * prime + this.customerId;
		
		return hash;
	}
}