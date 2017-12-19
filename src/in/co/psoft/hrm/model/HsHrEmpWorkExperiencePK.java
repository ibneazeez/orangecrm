package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_work_experience database table.
 * 
 */
@Embeddable
public class HsHrEmpWorkExperiencePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="eexp_seqno")
	private long eexpSeqno;

	public HsHrEmpWorkExperiencePK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEexpSeqno() {
		return this.eexpSeqno;
	}
	public void setEexpSeqno(long eexpSeqno) {
		this.eexpSeqno = eexpSeqno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpWorkExperiencePK)) {
			return false;
		}
		HsHrEmpWorkExperiencePK castOther = (HsHrEmpWorkExperiencePK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.eexpSeqno == castOther.eexpSeqno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.eexpSeqno ^ (this.eexpSeqno >>> 32)));
		
		return hash;
	}
}