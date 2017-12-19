package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;


/**
 * The persistent class for the ohrm_work_shift database table.
 * 
 */
@Entity
@Table(name="ohrm_work_shift")
@NamedQuery(name="OhrmWorkShift.findAll", query="SELECT o FROM OhrmWorkShift o")
public class OhrmWorkShift implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="end_time")
	private Time endTime;

	@Column(name="hours_per_day")
	private BigDecimal hoursPerDay;

	private String name;

	@Column(name="start_time")
	private Time startTime;

	//bi-directional many-to-many association to HsHrEmployee
	@ManyToMany(mappedBy="ohrmWorkShifts")
	private List<HsHrEmployee> hsHrEmployees;

	public OhrmWorkShift() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public BigDecimal getHoursPerDay() {
		return this.hoursPerDay;
	}

	public void setHoursPerDay(BigDecimal hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public List<HsHrEmployee> getHsHrEmployees() {
		return this.hsHrEmployees;
	}

	public void setHsHrEmployees(List<HsHrEmployee> hsHrEmployees) {
		this.hsHrEmployees = hsHrEmployees;
	}

}