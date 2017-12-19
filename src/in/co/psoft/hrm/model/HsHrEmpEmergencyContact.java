package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_emp_emergency_contacts database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_emergency_contacts")
@NamedQuery(name="HsHrEmpEmergencyContact.findAll", query="SELECT h FROM HsHrEmpEmergencyContact h")
public class HsHrEmpEmergencyContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpEmergencyContactPK id;

	@Column(name="eec_home_no")
	private String eecHomeNo;

	@Column(name="eec_mobile_no")
	private String eecMobileNo;

	@Column(name="eec_name")
	private String eecName;

	@Column(name="eec_office_no")
	private String eecOfficeNo;

	@Column(name="eec_relationship")
	private String eecRelationship;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpEmergencyContact() {
	}

	public HsHrEmpEmergencyContactPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpEmergencyContactPK id) {
		this.id = id;
	}

	public String getEecHomeNo() {
		return this.eecHomeNo;
	}

	public void setEecHomeNo(String eecHomeNo) {
		this.eecHomeNo = eecHomeNo;
	}

	public String getEecMobileNo() {
		return this.eecMobileNo;
	}

	public void setEecMobileNo(String eecMobileNo) {
		this.eecMobileNo = eecMobileNo;
	}

	public String getEecName() {
		return this.eecName;
	}

	public void setEecName(String eecName) {
		this.eecName = eecName;
	}

	public String getEecOfficeNo() {
		return this.eecOfficeNo;
	}

	public void setEecOfficeNo(String eecOfficeNo) {
		this.eecOfficeNo = eecOfficeNo;
	}

	public String getEecRelationship() {
		return this.eecRelationship;
	}

	public void setEecRelationship(String eecRelationship) {
		this.eecRelationship = eecRelationship;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}