package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_skill database table.
 * 
 */
@Entity
@Table(name="ohrm_skill")
@NamedQuery(name="OhrmSkill.findAll", query="SELECT o FROM OhrmSkill o")
public class OhrmSkill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String description;

	private String name;

	//bi-directional many-to-one association to HsHrEmpSkill
	@OneToMany(mappedBy="ohrmSkill")
	private List<HsHrEmpSkill> hsHrEmpSkills;

	public OhrmSkill() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<HsHrEmpSkill> getHsHrEmpSkills() {
		return this.hsHrEmpSkills;
	}

	public void setHsHrEmpSkills(List<HsHrEmpSkill> hsHrEmpSkills) {
		this.hsHrEmpSkills = hsHrEmpSkills;
	}

	public HsHrEmpSkill addHsHrEmpSkill(HsHrEmpSkill hsHrEmpSkill) {
		getHsHrEmpSkills().add(hsHrEmpSkill);
		hsHrEmpSkill.setOhrmSkill(this);

		return hsHrEmpSkill;
	}

	public HsHrEmpSkill removeHsHrEmpSkill(HsHrEmpSkill hsHrEmpSkill) {
		getHsHrEmpSkills().remove(hsHrEmpSkill);
		hsHrEmpSkill.setOhrmSkill(null);

		return hsHrEmpSkill;
	}

}