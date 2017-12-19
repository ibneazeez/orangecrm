package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_emergency_contacts database table.
 * 
 */
@Embeddable
public class HsHrEmpEmergencyContactPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="eec_seqno")
	private long eecSeqno;

	public HsHrEmpEmergencyContactPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEecSeqno() {
		return this.eecSeqno;
	}
	public void setEecSeqno(long eecSeqno) {
		this.eecSeqno = eecSeqno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpEmergencyContactPK)) {
			return false;
		}
		HsHrEmpEmergencyContactPK castOther = (HsHrEmpEmergencyContactPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.eecSeqno == castOther.eecSeqno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.eecSeqno ^ (this.eecSeqno >>> 32)));
		
		return hash;
	}
}