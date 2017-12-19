package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_emp_language database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_language")
@NamedQuery(name="HsHrEmpLanguage.findAll", query="SELECT h FROM HsHrEmpLanguage h")
public class HsHrEmpLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpLanguagePK id;

	private String comments;

	private short competency;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmLanguage
	@ManyToOne
	@JoinColumn(name="lang_id")
	private OhrmLanguage ohrmLanguage;

	public HsHrEmpLanguage() {
	}

	public HsHrEmpLanguagePK getId() {
		return this.id;
	}

	public void setId(HsHrEmpLanguagePK id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public short getCompetency() {
		return this.competency;
	}

	public void setCompetency(short competency) {
		this.competency = competency;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmLanguage getOhrmLanguage() {
		return this.ohrmLanguage;
	}

	public void setOhrmLanguage(OhrmLanguage ohrmLanguage) {
		this.ohrmLanguage = ohrmLanguage;
	}

}