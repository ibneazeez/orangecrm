package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_dependents database table.
 * 
 */
@Embeddable
public class HsHrEmpDependentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="ed_seqno")
	private long edSeqno;

	public HsHrEmpDependentPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEdSeqno() {
		return this.edSeqno;
	}
	public void setEdSeqno(long edSeqno) {
		this.edSeqno = edSeqno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpDependentPK)) {
			return false;
		}
		HsHrEmpDependentPK castOther = (HsHrEmpDependentPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.edSeqno == castOther.edSeqno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.edSeqno ^ (this.edSeqno >>> 32)));
		
		return hash;
	}
}