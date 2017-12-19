package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hs_hr_emp_work_experience database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_work_experience")
@NamedQuery(name="HsHrEmpWorkExperience.findAll", query="SELECT h FROM HsHrEmpWorkExperience h")
public class HsHrEmpWorkExperience implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpWorkExperiencePK id;

	@Column(name="eexp_comments")
	private String eexpComments;

	@Column(name="eexp_employer")
	private String eexpEmployer;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eexp_from_date")
	private Date eexpFromDate;

	@Column(name="eexp_internal")
	private int eexpInternal;

	@Column(name="eexp_jobtit")
	private String eexpJobtit;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="eexp_to_date")
	private Date eexpToDate;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpWorkExperience() {
	}

	public HsHrEmpWorkExperiencePK getId() {
		return this.id;
	}

	public void setId(HsHrEmpWorkExperiencePK id) {
		this.id = id;
	}

	public String getEexpComments() {
		return this.eexpComments;
	}

	public void setEexpComments(String eexpComments) {
		this.eexpComments = eexpComments;
	}

	public String getEexpEmployer() {
		return this.eexpEmployer;
	}

	public void setEexpEmployer(String eexpEmployer) {
		this.eexpEmployer = eexpEmployer;
	}

	public Date getEexpFromDate() {
		return this.eexpFromDate;
	}

	public void setEexpFromDate(Date eexpFromDate) {
		this.eexpFromDate = eexpFromDate;
	}

	public int getEexpInternal() {
		return this.eexpInternal;
	}

	public void setEexpInternal(int eexpInternal) {
		this.eexpInternal = eexpInternal;
	}

	public String getEexpJobtit() {
		return this.eexpJobtit;
	}

	public void setEexpJobtit(String eexpJobtit) {
		this.eexpJobtit = eexpJobtit;
	}

	public Date getEexpToDate() {
		return this.eexpToDate;
	}

	public void setEexpToDate(Date eexpToDate) {
		this.eexpToDate = eexpToDate;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}