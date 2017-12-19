package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_location database table.
 * 
 */
@Entity
@Table(name="ohrm_location")
@NamedQuery(name="OhrmLocation.findAll", query="SELECT o FROM OhrmLocation o")
public class OhrmLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String address;

	private String city;

	private String fax;

	private String name;

	private String notes;

	private String phone;

	private String province;

	@Column(name="zip_code")
	private String zipCode;

	//bi-directional many-to-many association to HsHrEmployee
	@ManyToMany(mappedBy="ohrmLocations")
	private List<HsHrEmployee> hsHrEmployees;

	//bi-directional many-to-one association to HsHrCountry
	@ManyToOne
	@JoinColumn(name="country_code")
	private HsHrCountry hsHrCountry;

	public OhrmLocation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<HsHrEmployee> getHsHrEmployees() {
		return this.hsHrEmployees;
	}

	public void setHsHrEmployees(List<HsHrEmployee> hsHrEmployees) {
		this.hsHrEmployees = hsHrEmployees;
	}

	public HsHrCountry getHsHrCountry() {
		return this.hsHrCountry;
	}

	public void setHsHrCountry(HsHrCountry hsHrCountry) {
		this.hsHrCountry = hsHrCountry;
	}

}