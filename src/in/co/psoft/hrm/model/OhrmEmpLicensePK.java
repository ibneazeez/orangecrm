package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_emp_license database table.
 * 
 */
@Embeddable
public class OhrmEmpLicensePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="license_id", insertable=false, updatable=false)
	private int licenseId;

	public OhrmEmpLicensePK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public int getLicenseId() {
		return this.licenseId;
	}
	public void setLicenseId(int licenseId) {
		this.licenseId = licenseId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmEmpLicensePK)) {
			return false;
		}
		OhrmEmpLicensePK castOther = (OhrmEmpLicensePK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.licenseId == castOther.licenseId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + this.licenseId;
		
		return hash;
	}
}