package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_province database table.
 * 
 */
@Entity
@Table(name="hs_hr_province")
@NamedQuery(name="HsHrProvince.findAll", query="SELECT h FROM HsHrProvince h")
public class HsHrProvince implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="cou_code")
	private String couCode;

	@Column(name="province_code")
	private String provinceCode;

	@Column(name="province_name")
	private String provinceName;

	public HsHrProvince() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCouCode() {
		return this.couCode;
	}

	public void setCouCode(String couCode) {
		this.couCode = couCode;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}