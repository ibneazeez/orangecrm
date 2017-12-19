package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_passport database table.
 * 
 */
@Embeddable
public class HsHrEmpPassportPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="ep_seqno")
	private long epSeqno;

	public HsHrEmpPassportPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEpSeqno() {
		return this.epSeqno;
	}
	public void setEpSeqno(long epSeqno) {
		this.epSeqno = epSeqno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpPassportPK)) {
			return false;
		}
		HsHrEmpPassportPK castOther = (HsHrEmpPassportPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.epSeqno == castOther.epSeqno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.epSeqno ^ (this.epSeqno >>> 32)));
		
		return hash;
	}
}