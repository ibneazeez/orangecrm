package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the hs_hr_emp_directdebit database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_directdebit")
@NamedQuery(name="HsHrEmpDirectdebit.findAll", query="SELECT h FROM HsHrEmpDirectdebit h")
public class HsHrEmpDirectdebit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="dd_account")
	private String ddAccount;

	@Column(name="dd_account_type")
	private String ddAccountType;

	@Column(name="dd_amount")
	private BigDecimal ddAmount;

	@Column(name="dd_routing_num")
	private int ddRoutingNum;

	@Column(name="dd_transaction_type")
	private String ddTransactionType;

	//bi-directional many-to-one association to HsHrEmpBasicsalary
	@ManyToOne
	@JoinColumn(name="salary_id")
	private HsHrEmpBasicsalary hsHrEmpBasicsalary;

	public HsHrEmpDirectdebit() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDdAccount() {
		return this.ddAccount;
	}

	public void setDdAccount(String ddAccount) {
		this.ddAccount = ddAccount;
	}

	public String getDdAccountType() {
		return this.ddAccountType;
	}

	public void setDdAccountType(String ddAccountType) {
		this.ddAccountType = ddAccountType;
	}

	public BigDecimal getDdAmount() {
		return this.ddAmount;
	}

	public void setDdAmount(BigDecimal ddAmount) {
		this.ddAmount = ddAmount;
	}

	public int getDdRoutingNum() {
		return this.ddRoutingNum;
	}

	public void setDdRoutingNum(int ddRoutingNum) {
		this.ddRoutingNum = ddRoutingNum;
	}

	public String getDdTransactionType() {
		return this.ddTransactionType;
	}

	public void setDdTransactionType(String ddTransactionType) {
		this.ddTransactionType = ddTransactionType;
	}

	public HsHrEmpBasicsalary getHsHrEmpBasicsalary() {
		return this.hsHrEmpBasicsalary;
	}

	public void setHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		this.hsHrEmpBasicsalary = hsHrEmpBasicsalary;
	}

}