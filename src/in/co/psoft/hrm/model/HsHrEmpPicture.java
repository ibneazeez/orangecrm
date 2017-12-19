package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_emp_picture database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_picture")
@NamedQuery(name="HsHrEmpPicture.findAll", query="SELECT h FROM HsHrEmpPicture h")
public class HsHrEmpPicture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_number")
	private int empNumber;

	@Column(name="epic_file_height")
	private String epicFileHeight;

	@Column(name="epic_file_size")
	private String epicFileSize;

	@Column(name="epic_file_width")
	private String epicFileWidth;

	@Column(name="epic_filename")
	private String epicFilename;

	@Lob
	@Column(name="epic_picture")
	private byte[] epicPicture;

	@Column(name="epic_type")
	private String epicType;

	//bi-directional one-to-one association to HsHrEmployee
	@OneToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpPicture() {
	}

	public int getEmpNumber() {
		return this.empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getEpicFileHeight() {
		return this.epicFileHeight;
	}

	public void setEpicFileHeight(String epicFileHeight) {
		this.epicFileHeight = epicFileHeight;
	}

	public String getEpicFileSize() {
		return this.epicFileSize;
	}

	public void setEpicFileSize(String epicFileSize) {
		this.epicFileSize = epicFileSize;
	}

	public String getEpicFileWidth() {
		return this.epicFileWidth;
	}

	public void setEpicFileWidth(String epicFileWidth) {
		this.epicFileWidth = epicFileWidth;
	}

	public String getEpicFilename() {
		return this.epicFilename;
	}

	public void setEpicFilename(String epicFilename) {
		this.epicFilename = epicFilename;
	}

	public byte[] getEpicPicture() {
		return this.epicPicture;
	}

	public void setEpicPicture(byte[] epicPicture) {
		this.epicPicture = epicPicture;
	}

	public String getEpicType() {
		return this.epicType;
	}

	public void setEpicType(String epicType) {
		this.epicType = epicType;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}