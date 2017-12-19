package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_children database table.
 * 
 */
@Embeddable
public class HsHrEmpChildrenPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="ec_seqno")
	private long ecSeqno;

	public HsHrEmpChildrenPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEcSeqno() {
		return this.ecSeqno;
	}
	public void setEcSeqno(long ecSeqno) {
		this.ecSeqno = ecSeqno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpChildrenPK)) {
			return false;
		}
		HsHrEmpChildrenPK castOther = (HsHrEmpChildrenPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.ecSeqno == castOther.ecSeqno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.ecSeqno ^ (this.ecSeqno >>> 32)));
		
		return hash;
	}
}