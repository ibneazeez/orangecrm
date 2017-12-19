package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the hs_hr_emp_skill database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_skill")
@NamedQuery(name="HsHrEmpSkill.findAll", query="SELECT h FROM HsHrEmpSkill h")
public class HsHrEmpSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	private String comments;

	@Column(name="years_of_exp")
	private BigDecimal yearsOfExp;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmSkill
	@ManyToOne
	@JoinColumn(name="skill_id")
	private OhrmSkill ohrmSkill;

	public HsHrEmpSkill() {
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getYearsOfExp() {
		return this.yearsOfExp;
	}

	public void setYearsOfExp(BigDecimal yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmSkill getOhrmSkill() {
		return this.ohrmSkill;
	}

	public void setOhrmSkill(OhrmSkill ohrmSkill) {
		this.ohrmSkill = ohrmSkill;
	}

}