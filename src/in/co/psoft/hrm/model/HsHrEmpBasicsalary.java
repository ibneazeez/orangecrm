package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hs_hr_emp_basicsalary database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_basicsalary")
@NamedQuery(name="HsHrEmpBasicsalary.findAll", query="SELECT h FROM HsHrEmpBasicsalary h")
public class HsHrEmpBasicsalary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String comments;

	@Column(name="ebsal_basic_salary")
	private String ebsalBasicSalary;

	@Column(name="salary_component")
	private String salaryComponent;

	//bi-directional many-to-one association to OhrmPayGrade
	@ManyToOne
	@JoinColumn(name="sal_grd_code")
	private OhrmPayGrade ohrmPayGrade;

	//bi-directional many-to-one association to HsHrCurrencyType
	@ManyToOne
	@JoinColumn(name="currency_id")
	private HsHrCurrencyType hsHrCurrencyType;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to HsHrPayperiod
	@ManyToOne
	@JoinColumn(name="payperiod_code")
	private HsHrPayperiod hsHrPayperiod;

	//bi-directional many-to-one association to HsHrEmpDirectdebit
	@OneToMany(mappedBy="hsHrEmpBasicsalary")
	private List<HsHrEmpDirectdebit> hsHrEmpDirectdebits;

	public HsHrEmpBasicsalary() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getEbsalBasicSalary() {
		return this.ebsalBasicSalary;
	}

	public void setEbsalBasicSalary(String ebsalBasicSalary) {
		this.ebsalBasicSalary = ebsalBasicSalary;
	}

	public String getSalaryComponent() {
		return this.salaryComponent;
	}

	public void setSalaryComponent(String salaryComponent) {
		this.salaryComponent = salaryComponent;
	}

	public OhrmPayGrade getOhrmPayGrade() {
		return this.ohrmPayGrade;
	}

	public void setOhrmPayGrade(OhrmPayGrade ohrmPayGrade) {
		this.ohrmPayGrade = ohrmPayGrade;
	}

	public HsHrCurrencyType getHsHrCurrencyType() {
		return this.hsHrCurrencyType;
	}

	public void setHsHrCurrencyType(HsHrCurrencyType hsHrCurrencyType) {
		this.hsHrCurrencyType = hsHrCurrencyType;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public HsHrPayperiod getHsHrPayperiod() {
		return this.hsHrPayperiod;
	}

	public void setHsHrPayperiod(HsHrPayperiod hsHrPayperiod) {
		this.hsHrPayperiod = hsHrPayperiod;
	}

	public List<HsHrEmpDirectdebit> getHsHrEmpDirectdebits() {
		return this.hsHrEmpDirectdebits;
	}

	public void setHsHrEmpDirectdebits(List<HsHrEmpDirectdebit> hsHrEmpDirectdebits) {
		this.hsHrEmpDirectdebits = hsHrEmpDirectdebits;
	}

	public HsHrEmpDirectdebit addHsHrEmpDirectdebit(HsHrEmpDirectdebit hsHrEmpDirectdebit) {
		getHsHrEmpDirectdebits().add(hsHrEmpDirectdebit);
		hsHrEmpDirectdebit.setHsHrEmpBasicsalary(this);

		return hsHrEmpDirectdebit;
	}

	public HsHrEmpDirectdebit removeHsHrEmpDirectdebit(HsHrEmpDirectdebit hsHrEmpDirectdebit) {
		getHsHrEmpDirectdebits().remove(hsHrEmpDirectdebit);
		hsHrEmpDirectdebit.setHsHrEmpBasicsalary(null);

		return hsHrEmpDirectdebit;
	}

}