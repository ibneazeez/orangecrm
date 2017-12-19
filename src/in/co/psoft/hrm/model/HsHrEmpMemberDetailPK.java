package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_member_detail database table.
 * 
 */
@Embeddable
public class HsHrEmpMemberDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="membship_code", insertable=false, updatable=false)
	private int membshipCode;

	public HsHrEmpMemberDetailPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public int getMembshipCode() {
		return this.membshipCode;
	}
	public void setMembshipCode(int membshipCode) {
		this.membshipCode = membshipCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpMemberDetailPK)) {
			return false;
		}
		HsHrEmpMemberDetailPK castOther = (HsHrEmpMemberDetailPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.membshipCode == castOther.membshipCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + this.membshipCode;
		
		return hash;
	}
}