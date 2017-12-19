package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ohrm_emp_education database table.
 * 
 */
@Entity
@Table(name="ohrm_emp_education")
@NamedQuery(name="OhrmEmpEducation.findAll", query="SELECT o FROM OhrmEmpEducation o")
public class OhrmEmpEducation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	private String institute;

	private String major;

	private String score;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private BigDecimal year;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmEducation
	@ManyToOne
	@JoinColumn(name="education_id")
	private OhrmEducation ohrmEducation;

	public OhrmEmpEducation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getInstitute() {
		return this.institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmEducation getOhrmEducation() {
		return this.ohrmEducation;
	}

	public void setOhrmEducation(OhrmEducation ohrmEducation) {
		this.ohrmEducation = ohrmEducation;
	}

}