package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_emp_history_of_ealier_pos database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_history_of_ealier_pos")
@NamedQuery(name="HsHrEmpHistoryOfEalierPo.findAll", query="SELECT h FROM HsHrEmpHistoryOfEalierPo h")
public class HsHrEmpHistoryOfEalierPo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpHistoryOfEalierPoPK id;

	@Column(name="ehoep_job_title")
	private String ehoepJobTitle;

	@Column(name="ehoep_years")
	private String ehoepYears;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpHistoryOfEalierPo() {
	}

	public HsHrEmpHistoryOfEalierPoPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpHistoryOfEalierPoPK id) {
		this.id = id;
	}

	public String getEhoepJobTitle() {
		return this.ehoepJobTitle;
	}

	public void setEhoepJobTitle(String ehoepJobTitle) {
		this.ehoepJobTitle = ehoepJobTitle;
	}

	public String getEhoepYears() {
		return this.ehoepYears;
	}

	public void setEhoepYears(String ehoepYears) {
		this.ehoepYears = ehoepYears;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}