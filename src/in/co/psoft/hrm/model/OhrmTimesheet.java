package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ohrm_timesheet database table.
 * 
 */
@Entity
@Table(name="ohrm_timesheet")
@NamedQuery(name="OhrmTimesheet.findAll", query="SELECT o FROM OhrmTimesheet o")
public class OhrmTimesheet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="timesheet_id")
	private String timesheetId;

	@Column(name="employee_id")
	private BigInteger employeeId;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String state;

	public OhrmTimesheet() {
	}

	public String getTimesheetId() {
		return this.timesheetId;
	}

	public void setTimesheetId(String timesheetId) {
		this.timesheetId = timesheetId;
	}

	public BigInteger getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(BigInteger employeeId) {
		this.employeeId = employeeId;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}