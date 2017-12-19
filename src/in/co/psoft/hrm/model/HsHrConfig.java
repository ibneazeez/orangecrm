package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_config database table.
 * 
 */
@Entity
@Table(name="hs_hr_config")
@NamedQuery(name="HsHrConfig.findAll", query="SELECT h FROM HsHrConfig h")
public class HsHrConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String key;

	private String value;

	public HsHrConfig() {
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}