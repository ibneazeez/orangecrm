package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the hs_hr_country database table.
 * 
 */
@Entity
@Table(name="hs_hr_country")
@NamedQuery(name="HsHrCountry.findAll", query="SELECT h FROM HsHrCountry h")
public class HsHrCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cou_code")
	private String couCode;

	@Column(name="cou_name")
	private String couName;

	private String iso3;

	private String name;

	private short numcode;

	//bi-directional many-to-one association to OhrmLocation
	@OneToMany(mappedBy="hsHrCountry")
	private List<OhrmLocation> ohrmLocations;

	//bi-directional many-to-one association to OhrmOperationalCountry
	@OneToMany(mappedBy="hsHrCountry")
	private List<OhrmOperationalCountry> ohrmOperationalCountries;

	public HsHrCountry() {
	}

	public String getCouCode() {
		return this.couCode;
	}

	public void setCouCode(String couCode) {
		this.couCode = couCode;
	}

	public String getCouName() {
		return this.couName;
	}

	public void setCouName(String couName) {
		this.couName = couName;
	}

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getNumcode() {
		return this.numcode;
	}

	public void setNumcode(short numcode) {
		this.numcode = numcode;
	}

	public List<OhrmLocation> getOhrmLocations() {
		return this.ohrmLocations;
	}

	public void setOhrmLocations(List<OhrmLocation> ohrmLocations) {
		this.ohrmLocations = ohrmLocations;
	}

	public OhrmLocation addOhrmLocation(OhrmLocation ohrmLocation) {
		getOhrmLocations().add(ohrmLocation);
		ohrmLocation.setHsHrCountry(this);

		return ohrmLocation;
	}

	public OhrmLocation removeOhrmLocation(OhrmLocation ohrmLocation) {
		getOhrmLocations().remove(ohrmLocation);
		ohrmLocation.setHsHrCountry(null);

		return ohrmLocation;
	}

	public List<OhrmOperationalCountry> getOhrmOperationalCountries() {
		return this.ohrmOperationalCountries;
	}

	public void setOhrmOperationalCountries(List<OhrmOperationalCountry> ohrmOperationalCountries) {
		this.ohrmOperationalCountries = ohrmOperationalCountries;
	}

	public OhrmOperationalCountry addOhrmOperationalCountry(OhrmOperationalCountry ohrmOperationalCountry) {
		getOhrmOperationalCountries().add(ohrmOperationalCountry);
		ohrmOperationalCountry.setHsHrCountry(this);

		return ohrmOperationalCountry;
	}

	public OhrmOperationalCountry removeOhrmOperationalCountry(OhrmOperationalCountry ohrmOperationalCountry) {
		getOhrmOperationalCountries().remove(ohrmOperationalCountry);
		ohrmOperationalCountry.setHsHrCountry(null);

		return ohrmOperationalCountry;
	}

}