package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_custom_fields database table.
 * 
 */
@Entity
@Table(name="hs_hr_custom_fields")
@NamedQuery(name="HsHrCustomField.findAll", query="SELECT h FROM HsHrCustomField h")
public class HsHrCustomField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="field_num")
	private int fieldNum;

	@Column(name="extra_data")
	private String extraData;

	private String name;

	private String screen;

	private int type;

	public HsHrCustomField() {
	}

	public int getFieldNum() {
		return this.fieldNum;
	}

	public void setFieldNum(int fieldNum) {
		this.fieldNum = fieldNum;
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreen() {
		return this.screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

}