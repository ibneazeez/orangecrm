package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_district database table.
 * 
 */
@Entity
@Table(name="hs_hr_district")
@NamedQuery(name="HsHrDistrict.findAll", query="SELECT h FROM HsHrDistrict h")
public class HsHrDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="district_code")
	private String districtCode;

	@Column(name="district_name")
	private String districtName;

	@Column(name="province_code")
	private String provinceCode;

	public HsHrDistrict() {
	}

	public String getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}