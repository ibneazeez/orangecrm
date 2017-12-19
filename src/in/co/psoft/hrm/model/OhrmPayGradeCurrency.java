package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_pay_grade_currency database table.
 * 
 */
@Entity
@Table(name="ohrm_pay_grade_currency")
@NamedQuery(name="OhrmPayGradeCurrency.findAll", query="SELECT o FROM OhrmPayGradeCurrency o")
public class OhrmPayGradeCurrency implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmPayGradeCurrencyPK id;

	@Column(name="max_salary")
	private double maxSalary;

	@Column(name="min_salary")
	private double minSalary;

	//bi-directional many-to-one association to HsHrCurrencyType
	@ManyToOne
	@JoinColumn(name="currency_id")
	private HsHrCurrencyType hsHrCurrencyType;

	//bi-directional many-to-one association to OhrmPayGrade
	@ManyToOne
	@JoinColumn(name="pay_grade_id")
	private OhrmPayGrade ohrmPayGrade;

	public OhrmPayGradeCurrency() {
	}

	public OhrmPayGradeCurrencyPK getId() {
		return this.id;
	}

	public void setId(OhrmPayGradeCurrencyPK id) {
		this.id = id;
	}

	public double getMaxSalary() {
		return this.maxSalary;
	}

	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	public double getMinSalary() {
		return this.minSalary;
	}

	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	public HsHrCurrencyType getHsHrCurrencyType() {
		return this.hsHrCurrencyType;
	}

	public void setHsHrCurrencyType(HsHrCurrencyType hsHrCurrencyType) {
		this.hsHrCurrencyType = hsHrCurrencyType;
	}

	public OhrmPayGrade getOhrmPayGrade() {
		return this.ohrmPayGrade;
	}

	public void setOhrmPayGrade(OhrmPayGrade ohrmPayGrade) {
		this.ohrmPayGrade = ohrmPayGrade;
	}

}