package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_nationality database table.
 * 
 */
@Entity
@Table(name="ohrm_nationality")
@NamedQuery(name="OhrmNationality.findAll", query="SELECT o FROM OhrmNationality o")
public class OhrmNationality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to HsHrEmployee
	@OneToMany(mappedBy="ohrmNationality")
	private List<HsHrEmployee> hsHrEmployees;

	public OhrmNationality() {
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
		hsHrEmployee.setOhrmNationality(this);

		return hsHrEmployee;
	}

	public HsHrEmployee removeHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().remove(hsHrEmployee);
		hsHrEmployee.setOhrmNationality(null);

		return hsHrEmployee;
	}

}