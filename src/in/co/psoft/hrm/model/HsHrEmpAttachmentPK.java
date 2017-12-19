package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_attachment database table.
 * 
 */
@Embeddable
public class HsHrEmpAttachmentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="eattach_id")
	private int eattachId;

	public HsHrEmpAttachmentPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public int getEattachId() {
		return this.eattachId;
	}
	public void setEattachId(int eattachId) {
		this.eattachId = eattachId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpAttachmentPK)) {
			return false;
		}
		HsHrEmpAttachmentPK castOther = (HsHrEmpAttachmentPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.eattachId == castOther.eattachId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + this.eattachId;
		
		return hash;
	}
}