package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hs_hr_currency_type database table.
 * 
 */
@Entity
@Table(name="hs_hr_currency_type")
@NamedQuery(name="HsHrCurrencyType.findAll", query="SELECT h FROM HsHrCurrencyType h")
public class HsHrCurrencyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="currency_id")
	private String currencyId;

	private int code;

	@Column(name="currency_name")
	private String currencyName;

	//bi-directional many-to-one association to HsHrEmpBasicsalary
	@OneToMany(mappedBy="hsHrCurrencyType")
	private List<HsHrEmpBasicsalary> hsHrEmpBasicsalaries;

	//bi-directional many-to-one association to OhrmPayGradeCurrency
	@OneToMany(mappedBy="hsHrCurrencyType")
	private List<OhrmPayGradeCurrency> ohrmPayGradeCurrencies;

	public HsHrCurrencyType() {
	}

	public String getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public List<HsHrEmpBasicsalary> getHsHrEmpBasicsalaries() {
		return this.hsHrEmpBasicsalaries;
	}

	public void setHsHrEmpBasicsalaries(List<HsHrEmpBasicsalary> hsHrEmpBasicsalaries) {
		this.hsHrEmpBasicsalaries = hsHrEmpBasicsalaries;
	}

	public HsHrEmpBasicsalary addHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		getHsHrEmpBasicsalaries().add(hsHrEmpBasicsalary);
		hsHrEmpBasicsalary.setHsHrCurrencyType(this);

		return hsHrEmpBasicsalary;
	}

	public HsHrEmpBasicsalary removeHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		getHsHrEmpBasicsalaries().remove(hsHrEmpBasicsalary);
		hsHrEmpBasicsalary.setHsHrCurrencyType(null);

		return hsHrEmpBasicsalary;
	}

	public List<OhrmPayGradeCurrency> getOhrmPayGradeCurrencies() {
		return this.ohrmPayGradeCurrencies;
	}

	public void setOhrmPayGradeCurrencies(List<OhrmPayGradeCurrency> ohrmPayGradeCurrencies) {
		this.ohrmPayGradeCurrencies = ohrmPayGradeCurrencies;
	}

	public OhrmPayGradeCurrency addOhrmPayGradeCurrency(OhrmPayGradeCurrency ohrmPayGradeCurrency) {
		getOhrmPayGradeCurrencies().add(ohrmPayGradeCurrency);
		ohrmPayGradeCurrency.setHsHrCurrencyType(this);

		return ohrmPayGradeCurrency;
	}

	public OhrmPayGradeCurrency removeOhrmPayGradeCurrency(OhrmPayGradeCurrency ohrmPayGradeCurrency) {
		getOhrmPayGradeCurrencies().remove(ohrmPayGradeCurrency);
		ohrmPayGradeCurrency.setHsHrCurrencyType(null);

		return ohrmPayGradeCurrency;
	}

}