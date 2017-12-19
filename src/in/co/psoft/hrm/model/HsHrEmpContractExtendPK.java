package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_contract_extend database table.
 * 
 */
@Embeddable
public class HsHrEmpContractExtendPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="econ_extend_id")
	private long econExtendId;

	public HsHrEmpContractExtendPK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public long getEconExtendId() {
		return this.econExtendId;
	}
	public void setEconExtendId(long econExtendId) {
		this.econExtendId = econExtendId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpContractExtendPK)) {
			return false;
		}
		HsHrEmpContractExtendPK castOther = (HsHrEmpContractExtendPK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.econExtendId == castOther.econExtendId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + ((int) (this.econExtendId ^ (this.econExtendId >>> 32)));
		
		return hash;
	}
}