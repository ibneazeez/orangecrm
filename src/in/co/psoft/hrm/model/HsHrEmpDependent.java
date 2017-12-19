package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hs_hr_emp_dependents database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_dependents")
@NamedQuery(name="HsHrEmpDependent.findAll", query="SELECT h FROM HsHrEmpDependent h")
public class HsHrEmpDependent implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpDependentPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ed_date_of_birth")
	private Date edDateOfBirth;

	@Column(name="ed_name")
	private String edName;

	@Column(name="ed_relationship")
	private String edRelationship;

	@Column(name="ed_relationship_type")
	private String edRelationshipType;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpDependent() {
	}

	public HsHrEmpDependentPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpDependentPK id) {
		this.id = id;
	}

	public Date getEdDateOfBirth() {
		return this.edDateOfBirth;
	}

	public void setEdDateOfBirth(Date edDateOfBirth) {
		this.edDateOfBirth = edDateOfBirth;
	}

	public String getEdName() {
		return this.edName;
	}

	public void setEdName(String edName) {
		this.edName = edName;
	}

	public String getEdRelationship() {
		return this.edRelationship;
	}

	public void setEdRelationship(String edRelationship) {
		this.edRelationship = edRelationship;
	}

	public String getEdRelationshipType() {
		return this.edRelationshipType;
	}

	public void setEdRelationshipType(String edRelationshipType) {
		this.edRelationshipType = edRelationshipType;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}