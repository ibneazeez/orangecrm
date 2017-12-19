package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_pay_grade_currency database table.
 * 
 */
@Embeddable
public class OhrmPayGradeCurrencyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="pay_grade_id", insertable=false, updatable=false)
	private int payGradeId;

	@Column(name="currency_id", insertable=false, updatable=false)
	private String currencyId;

	public OhrmPayGradeCurrencyPK() {
	}
	public int getPayGradeId() {
		return this.payGradeId;
	}
	public void setPayGradeId(int payGradeId) {
		this.payGradeId = payGradeId;
	}
	public String getCurrencyId() {
		return this.currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmPayGradeCurrencyPK)) {
			return false;
		}
		OhrmPayGradeCurrencyPK castOther = (OhrmPayGradeCurrencyPK)other;
		return 
			(this.payGradeId == castOther.payGradeId)
			&& this.currencyId.equals(castOther.currencyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.payGradeId;
		hash = hash * prime + this.currencyId.hashCode();
		
		return hash;
	}
}