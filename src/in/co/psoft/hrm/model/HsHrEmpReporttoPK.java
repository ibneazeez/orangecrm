package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_reportto database table.
 * 
 */
@Embeddable
public class HsHrEmpReporttoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="erep_sup_emp_number", insertable=false, updatable=false)
	private int erepSupEmpNumber;

	@Column(name="erep_sub_emp_number", insertable=false, updatable=false)
	private int erepSubEmpNumber;

	@Column(name="erep_reporting_mode", insertable=false, updatable=false)
	private int erepReportingMode;

	public HsHrEmpReporttoPK() {
	}
	public int getErepSupEmpNumber() {
		return this.erepSupEmpNumber;
	}
	public void setErepSupEmpNumber(int erepSupEmpNumber) {
		this.erepSupEmpNumber = erepSupEmpNumber;
	}
	public int getErepSubEmpNumber() {
		return this.erepSubEmpNumber;
	}
	public void setErepSubEmpNumber(int erepSubEmpNumber) {
		this.erepSubEmpNumber = erepSubEmpNumber;
	}
	public int getErepReportingMode() {
		return this.erepReportingMode;
	}
	public void setErepReportingMode(int erepReportingMode) {
		this.erepReportingMode = erepReportingMode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpReporttoPK)) {
			return false;
		}
		HsHrEmpReporttoPK castOther = (HsHrEmpReporttoPK)other;
		return 
			(this.erepSupEmpNumber == castOther.erepSupEmpNumber)
			&& (this.erepSubEmpNumber == castOther.erepSubEmpNumber)
			&& (this.erepReportingMode == castOther.erepReportingMode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.erepSupEmpNumber;
		hash = hash * prime + this.erepSubEmpNumber;
		hash = hash * prime + this.erepReportingMode;
		
		return hash;
	}
}