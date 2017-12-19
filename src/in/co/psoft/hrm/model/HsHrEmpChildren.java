package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hs_hr_emp_children database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_children")
@NamedQuery(name="HsHrEmpChildren.findAll", query="SELECT h FROM HsHrEmpChildren h")
public class HsHrEmpChildren implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpChildrenPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ec_date_of_birth")
	private Date ecDateOfBirth;

	@Column(name="ec_name")
	private String ecName;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpChildren() {
	}

	public HsHrEmpChildrenPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpChildrenPK id) {
		this.id = id;
	}

	public Date getEcDateOfBirth() {
		return this.ecDateOfBirth;
	}

	public void setEcDateOfBirth(Date ecDateOfBirth) {
		this.ecDateOfBirth = ecDateOfBirth;
	}

	public String getEcName() {
		return this.ecName;
	}

	public void setEcName(String ecName) {
		this.ecName = ecName;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}