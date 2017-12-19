package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hs_hr_emp_contract_extend database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_contract_extend")
@NamedQuery(name="HsHrEmpContractExtend.findAll", query="SELECT h FROM HsHrEmpContractExtend h")
public class HsHrEmpContractExtend implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpContractExtendPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="econ_extend_end_date")
	private Date econExtendEndDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="econ_extend_start_date")
	private Date econExtendStartDate;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpContractExtend() {
	}

	public HsHrEmpContractExtendPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpContractExtendPK id) {
		this.id = id;
	}

	public Date getEconExtendEndDate() {
		return this.econExtendEndDate;
	}

	public void setEconExtendEndDate(Date econExtendEndDate) {
		this.econExtendEndDate = econExtendEndDate;
	}

	public Date getEconExtendStartDate() {
		return this.econExtendStartDate;
	}

	public void setEconExtendStartDate(Date econExtendStartDate) {
		this.econExtendStartDate = econExtendStartDate;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}