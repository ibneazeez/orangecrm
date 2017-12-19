package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_history_of_ealier_pos database table.
 * 
 */
@Embeddable
public class HsHrEmpHistoryOfEalierPoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="emp_seqno")
	private long empSeqno;

	public HsHrEmpHistoryOfEalierPoPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEmpSeqno() {
		return this.empSeqno;
	}
	public void setEmpSeqno(long empSeqno) {
		this.empSeqno = empSeqno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpHistoryOfEalierPoPK)) {
			return false;
		}
		HsHrEmpHistoryOfEalierPoPK castOther = (HsHrEmpHistoryOfEalierPoPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.empSeqno == castOther.empSeqno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.empSeqno ^ (this.empSeqno >>> 32)));
		
		return hash;
	}
}