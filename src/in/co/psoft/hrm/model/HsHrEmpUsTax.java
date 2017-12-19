package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_emp_us_tax database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_us_tax")
@NamedQuery(name="HsHrEmpUsTax.findAll", query="SELECT h FROM HsHrEmpUsTax h")
public class HsHrEmpUsTax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_number")
	private int empNumber;

	@Column(name="tax_federal_exceptions")
	private int taxFederalExceptions;

	@Column(name="tax_federal_status")
	private String taxFederalStatus;

	@Column(name="tax_state")
	private String taxState;

	@Column(name="tax_state_exceptions")
	private int taxStateExceptions;

	@Column(name="tax_state_status")
	private String taxStateStatus;

	@Column(name="tax_unemp_state")
	private String taxUnempState;

	@Column(name="tax_work_state")
	private String taxWorkState;

	//bi-directional one-to-one association to HsHrEmployee
	@OneToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpUsTax() {
	}

	public int getEmpNumber() {
		return this.empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public int getTaxFederalExceptions() {
		return this.taxFederalExceptions;
	}

	public void setTaxFederalExceptions(int taxFederalExceptions) {
		this.taxFederalExceptions = taxFederalExceptions;
	}

	public String getTaxFederalStatus() {
		return this.taxFederalStatus;
	}

	public void setTaxFederalStatus(String taxFederalStatus) {
		this.taxFederalStatus = taxFederalStatus;
	}

	public String getTaxState() {
		return this.taxState;
	}

	public void setTaxState(String taxState) {
		this.taxState = taxState;
	}

	public int getTaxStateExceptions() {
		return this.taxStateExceptions;
	}

	public void setTaxStateExceptions(int taxStateExceptions) {
		this.taxStateExceptions = taxStateExceptions;
	}

	public String getTaxStateStatus() {
		return this.taxStateStatus;
	}

	public void setTaxStateStatus(String taxStateStatus) {
		this.taxStateStatus = taxStateStatus;
	}

	public String getTaxUnempState() {
		return this.taxUnempState;
	}

	public void setTaxUnempState(String taxUnempState) {
		this.taxUnempState = taxUnempState;
	}

	public String getTaxWorkState() {
		return this.taxWorkState;
	}

	public void setTaxWorkState(String taxWorkState) {
		this.taxWorkState = taxWorkState;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}