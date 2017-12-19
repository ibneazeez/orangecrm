package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_pay_grade database table.
 * 
 */
@Entity
@Table(name="ohrm_pay_grade")
@NamedQuery(name="OhrmPayGrade.findAll", query="SELECT o FROM OhrmPayGrade o")
public class OhrmPayGrade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to HsHrEmpBasicsalary
	@OneToMany(mappedBy="ohrmPayGrade")
	private List<HsHrEmpBasicsalary> hsHrEmpBasicsalaries;

	//bi-directional many-to-one association to OhrmPayGradeCurrency
	@OneToMany(mappedBy="ohrmPayGrade")
	private List<OhrmPayGradeCurrency> ohrmPayGradeCurrencies;

	public OhrmPayGrade() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<HsHrEmpBasicsalary> getHsHrEmpBasicsalaries() {
		return this.hsHrEmpBasicsalaries;
	}

	public void setHsHrEmpBasicsalaries(List<HsHrEmpBasicsalary> hsHrEmpBasicsalaries) {
		this.hsHrEmpBasicsalaries = hsHrEmpBasicsalaries;
	}

	public HsHrEmpBasicsalary addHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		getHsHrEmpBasicsalaries().add(hsHrEmpBasicsalary);
		hsHrEmpBasicsalary.setOhrmPayGrade(this);

		return hsHrEmpBasicsalary;
	}

	public HsHrEmpBasicsalary removeHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		getHsHrEmpBasicsalaries().remove(hsHrEmpBasicsalary);
		hsHrEmpBasicsalary.setOhrmPayGrade(null);

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
		ohrmPayGradeCurrency.setOhrmPayGrade(this);

		return ohrmPayGradeCurrency;
	}

	public OhrmPayGradeCurrency removeOhrmPayGradeCurrency(OhrmPayGradeCurrency ohrmPayGradeCurrency) {
		getOhrmPayGradeCurrencies().remove(ohrmPayGradeCurrency);
		ohrmPayGradeCurrency.setOhrmPayGrade(null);

		return ohrmPayGradeCurrency;
	}

}