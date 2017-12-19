package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hs_hr_emp_passport database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_passport")
@NamedQuery(name="HsHrEmpPassport.findAll", query="SELECT h FROM HsHrEmpPassport h")
public class HsHrEmpPassport implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpPassportPK id;

	@Column(name="cou_code")
	private String couCode;

	@Column(name="ep_comments")
	private String epComments;

	@Temporal(TemporalType.DATE)
	@Column(name="ep_i9_review_date")
	private Date epI9ReviewDate;

	@Column(name="ep_i9_status")
	private String epI9Status;

	@Column(name="ep_passport_num")
	private String epPassportNum;

	@Column(name="ep_passport_type_flg")
	private short epPassportTypeFlg;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ep_passportexpiredate")
	private Date epPassportexpiredate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ep_passportissueddate")
	private Date epPassportissueddate;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpPassport() {
	}

	public HsHrEmpPassportPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpPassportPK id) {
		this.id = id;
	}

	public String getCouCode() {
		return this.couCode;
	}

	public void setCouCode(String couCode) {
		this.couCode = couCode;
	}

	public String getEpComments() {
		return this.epComments;
	}

	public void setEpComments(String epComments) {
		this.epComments = epComments;
	}

	public Date getEpI9ReviewDate() {
		return this.epI9ReviewDate;
	}

	public void setEpI9ReviewDate(Date epI9ReviewDate) {
		this.epI9ReviewDate = epI9ReviewDate;
	}

	public String getEpI9Status() {
		return this.epI9Status;
	}

	public void setEpI9Status(String epI9Status) {
		this.epI9Status = epI9Status;
	}

	public String getEpPassportNum() {
		return this.epPassportNum;
	}

	public void setEpPassportNum(String epPassportNum) {
		this.epPassportNum = epPassportNum;
	}

	public short getEpPassportTypeFlg() {
		return this.epPassportTypeFlg;
	}

	public void setEpPassportTypeFlg(short epPassportTypeFlg) {
		this.epPassportTypeFlg = epPassportTypeFlg;
	}

	public Date getEpPassportexpiredate() {
		return this.epPassportexpiredate;
	}

	public void setEpPassportexpiredate(Date epPassportexpiredate) {
		this.epPassportexpiredate = epPassportexpiredate;
	}

	public Date getEpPassportissueddate() {
		return this.epPassportissueddate;
	}

	public void setEpPassportissueddate(Date epPassportissueddate) {
		this.epPassportissueddate = epPassportissueddate;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}