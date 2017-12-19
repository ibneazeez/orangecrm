package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_emp_license database table.
 * 
 */
@Entity
@Table(name="ohrm_emp_license")
@NamedQuery(name="OhrmEmpLicense.findAll", query="SELECT o FROM OhrmEmpLicense o")
public class OhrmEmpLicense implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmEmpLicensePK id;

	@Temporal(TemporalType.DATE)
	@Column(name="license_expiry_date")
	private Date licenseExpiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="license_issued_date")
	private Date licenseIssuedDate;

	@Column(name="license_no")
	private String licenseNo;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmLicense
	@ManyToOne
	@JoinColumn(name="license_id")
	private OhrmLicense ohrmLicense;

	public OhrmEmpLicense() {
	}

	public OhrmEmpLicensePK getId() {
		return this.id;
	}

	public void setId(OhrmEmpLicensePK id) {
		this.id = id;
	}

	public Date getLicenseExpiryDate() {
		return this.licenseExpiryDate;
	}

	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public Date getLicenseIssuedDate() {
		return this.licenseIssuedDate;
	}

	public void setLicenseIssuedDate(Date licenseIssuedDate) {
		this.licenseIssuedDate = licenseIssuedDate;
	}

	public String getLicenseNo() {
		return this.licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmLicense getOhrmLicense() {
		return this.ohrmLicense;
	}

	public void setOhrmLicense(OhrmLicense ohrmLicense) {
		this.ohrmLicense = ohrmLicense;
	}

}