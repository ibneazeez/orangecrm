package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the hs_hr_emp_language database table.
 * 
 */
@Embeddable
public class HsHrEmpLanguagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="emp_number", insertable=false, updatable=false)
	private int empNumber;

	@Column(name="lang_id", insertable=false, updatable=false)
	private int langId;

	private short fluency;

	public HsHrEmpLanguagePK() {
	}
	public int getEmpNumber() {
		return this.empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public int getLangId() {
		return this.langId;
	}
	public void setLangId(int langId) {
		this.langId = langId;
	}
	public short getFluency() {
		return this.fluency;
	}
	public void setFluency(short fluency) {
		this.fluency = fluency;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HsHrEmpLanguagePK)) {
			return false;
		}
		HsHrEmpLanguagePK castOther = (HsHrEmpLanguagePK)other;
		return 
			(this.empNumber == castOther.empNumber)
			&& (this.langId == castOther.langId)
			&& (this.fluency == castOther.fluency);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.empNumber;
		hash = hash * prime + this.langId;
		hash = hash * prime + ((int) this.fluency);
		
		return hash;
	}
}