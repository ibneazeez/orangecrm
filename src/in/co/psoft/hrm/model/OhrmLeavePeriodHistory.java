package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_leave_period_history database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_period_history")
@NamedQuery(name="OhrmLeavePeriodHistory.findAll", query="SELECT o FROM OhrmLeavePeriodHistory o")
public class OhrmLeavePeriodHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="created_at")
	private Date createdAt;

	@Column(name="leave_period_start_day")
	private int leavePeriodStartDay;

	@Column(name="leave_period_start_month")
	private int leavePeriodStartMonth;

	public OhrmLeavePeriodHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getLeavePeriodStartDay() {
		return this.leavePeriodStartDay;
	}

	public void setLeavePeriodStartDay(int leavePeriodStartDay) {
		this.leavePeriodStartDay = leavePeriodStartDay;
	}

	public int getLeavePeriodStartMonth() {
		return this.leavePeriodStartMonth;
	}

	public void setLeavePeriodStartMonth(int leavePeriodStartMonth) {
		this.leavePeriodStartMonth = leavePeriodStartMonth;
	}

}