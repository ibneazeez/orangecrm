package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_subunit database table.
 * 
 */
@Entity
@Table(name="ohrm_subunit")
@NamedQuery(name="OhrmSubunit.findAll", query="SELECT o FROM OhrmSubunit o")
public class OhrmSubunit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private int level;

	private int lft;

	private String name;

	private int rgt;

	@Column(name="unit_id")
	private String unitId;

	//bi-directional many-to-one association to HsHrEmployee
	@OneToMany(mappedBy="ohrmSubunit")
	private List<HsHrEmployee> hsHrEmployees;

	public OhrmSubunit() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLft() {
		return this.lft;
	}

	public void setLft(int lft) {
		this.lft = lft;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRgt() {
		return this.rgt;
	}

	public void setRgt(int rgt) {
		this.rgt = rgt;
	}

	public String getUnitId() {
		return this.unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public List<HsHrEmployee> getHsHrEmployees() {
		return this.hsHrEmployees;
	}

	public void setHsHrEmployees(List<HsHrEmployee> hsHrEmployees) {
		this.hsHrEmployees = hsHrEmployees;
	}

	public HsHrEmployee addHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().add(hsHrEmployee);
		hsHrEmployee.setOhrmSubunit(this);

		return hsHrEmployee;
	}

	public HsHrEmployee removeHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().remove(hsHrEmployee);
		hsHrEmployee.setOhrmSubunit(null);

		return hsHrEmployee;
	}

}