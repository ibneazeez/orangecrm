package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ohrm_timesheet_action_log database table.
 * 
 */
@Entity
@Table(name="ohrm_timesheet_action_log")
@NamedQuery(name="OhrmTimesheetActionLog.findAll", query="SELECT o FROM OhrmTimesheetActionLog o")
public class OhrmTimesheetActionLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="timesheet_action_log_id")
	private String timesheetActionLogId;

	private String action;

	private String comment;

	@Temporal(TemporalType.DATE)
	@Column(name="date_time")
	private Date dateTime;

	@Column(name="timesheet_id")
	private BigInteger timesheetId;

	//bi-directional many-to-one association to OhrmUser
	@ManyToOne
	@JoinColumn(name="performed_by")
	private OhrmUser ohrmUser;

	public OhrmTimesheetActionLog() {
	}

	public String getTimesheetActionLogId() {
		return this.timesheetActionLogId;
	}

	public void setTimesheetActionLogId(String timesheetActionLogId) {
		this.timesheetActionLogId = timesheetActionLogId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public BigInteger getTimesheetId() {
		return this.timesheetId;
	}

	public void setTimesheetId(BigInteger timesheetId) {
		this.timesheetId = timesheetId;
	}

	public OhrmUser getOhrmUser() {
		return this.ohrmUser;
	}

	public void setOhrmUser(OhrmUser ohrmUser) {
		this.ohrmUser = ohrmUser;
	}

}