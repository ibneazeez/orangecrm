package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_employment_status database table.
 * 
 */
@Entity
@Table(name="ohrm_employment_status")
@NamedQuery(name="OhrmEmploymentStatus.findAll", query="SELECT o FROM OhrmEmploymentStatus o")
public class OhrmEmploymentStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to HsHrEmployee
	@OneToMany(mappedBy="ohrmEmploymentStatus")
	private List<HsHrEmployee> hsHrEmployees;

	//bi-directional many-to-many association to OhrmJobTitle
	@ManyToMany
	@JoinTable(
		name="hs_hr_jobtit_empstat"
		, joinColumns={
			@JoinColumn(name="estat_code")
			}
		, inverseJoinColumns={
			@JoinColumn(name="jobtit_code")
			}
		)
	private List<OhrmJobTitle> ohrmJobTitles;

	public OhrmEmploymentStatus() {
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

	public List<HsHrEmployee> getHsHrEmployees() {
		return this.hsHrEmployees;
	}

	public void setHsHrEmployees(List<HsHrEmployee> hsHrEmployees) {
		this.hsHrEmployees = hsHrEmployees;
	}

	public HsHrEmployee addHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().add(hsHrEmployee);
		hsHrEmployee.setOhrmEmploymentStatus(this);

		return hsHrEmployee;
	}

	public HsHrEmployee removeHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().remove(hsHrEmployee);
		hsHrEmployee.setOhrmEmploymentStatus(null);

		return hsHrEmployee;
	}

	public List<OhrmJobTitle> getOhrmJobTitles() {
		return this.ohrmJobTitles;
	}

	public void setOhrmJobTitles(List<OhrmJobTitle> ohrmJobTitles) {
		this.ohrmJobTitles = ohrmJobTitles;
	}

}