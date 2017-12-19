package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ohrm_timesheet_item database table.
 * 
 */
@Entity
@Table(name="ohrm_timesheet_item")
@NamedQuery(name="OhrmTimesheetItem.findAll", query="SELECT o FROM OhrmTimesheetItem o")
public class OhrmTimesheetItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="timesheet_item_id")
	private String timesheetItemId;

	@Column(name="activity_id")
	private BigInteger activityId;

	@Lob
	private String comment;

	@Temporal(TemporalType.DATE)
	private Date date;

	private BigInteger duration;

	@Column(name="employee_id")
	private BigInteger employeeId;

	@Column(name="project_id")
	private BigInteger projectId;

	@Column(name="timesheet_id")
	private BigInteger timesheetId;

	public OhrmTimesheetItem() {
	}

	public String getTimesheetItemId() {
		return this.timesheetItemId;
	}

	public void setTimesheetItemId(String timesheetItemId) {
		this.timesheetItemId = timesheetItemId;
	}

	public BigInteger getActivityId() {
		return this.activityId;
	}

	public void setActivityId(BigInteger activityId) {
		this.activityId = activityId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigInteger getDuration() {
		return this.duration;
	}

	public void setDuration(BigInteger duration) {
		this.duration = duration;
	}

	public BigInteger getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(BigInteger employeeId) {
		this.employeeId = employeeId;
	}

	public BigInteger getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigInteger projectId) {
		this.projectId = projectId;
	}

	public BigInteger getTimesheetId() {
		return this.timesheetId;
	}

	public void setTimesheetId(BigInteger timesheetId) {
		this.timesheetId = timesheetId;
	}

}