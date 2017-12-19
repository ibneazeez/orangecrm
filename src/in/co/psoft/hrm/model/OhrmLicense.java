package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_license database table.
 * 
 */
@Entity
@Table(name="ohrm_license")
@NamedQuery(name="OhrmLicense.findAll", query="SELECT o FROM OhrmLicense o")
public class OhrmLicense implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to OhrmEmpLicense
	@OneToMany(mappedBy="ohrmLicense")
	private List<OhrmEmpLicense> ohrmEmpLicenses;

	public OhrmLicense() {
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

	public List<OhrmEmpLicense> getOhrmEmpLicenses() {
		return this.ohrmEmpLicenses;
	}

	public void setOhrmEmpLicenses(List<OhrmEmpLicense> ohrmEmpLicenses) {
		this.ohrmEmpLicenses = ohrmEmpLicenses;
	}

	public OhrmEmpLicense addOhrmEmpLicens(OhrmEmpLicense ohrmEmpLicens) {
		getOhrmEmpLicenses().add(ohrmEmpLicens);
		ohrmEmpLicens.setOhrmLicense(this);

		return ohrmEmpLicens;
	}

	public OhrmEmpLicense removeOhrmEmpLicens(OhrmEmpLicense ohrmEmpLicens) {
		getOhrmEmpLicenses().remove(ohrmEmpLicens);
		ohrmEmpLicens.setOhrmLicense(null);

		return ohrmEmpLicens;
	}

}