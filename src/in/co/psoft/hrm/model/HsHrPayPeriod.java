package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hs_hr_pay_period database table.
 * 
 */
@Entity
@Table(name="hs_hr_pay_period")
@NamedQuery(name="HsHrPayPeriod.findAll", query="SELECT h FROM HsHrPayPeriod h")
public class HsHrPayPeriod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="check_date")
	private Date checkDate;

	@Temporal(TemporalType.DATE)
	@Column(name="close_date")
	private Date closeDate;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	@Temporal(TemporalType.DATE)
	@Column(name="timesheet_aproval_due_date")
	private Date timesheetAprovalDueDate;

	public HsHrPayPeriod() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public Date getCloseDate() {
		return this.closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
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

	public Date getTimesheetAprovalDueDate() {
		return this.timesheetAprovalDueDate;
	}

	public void setTimesheetAprovalDueDate(Date timesheetAprovalDueDate) {
		this.timesheetAprovalDueDate = timesheetAprovalDueDate;
	}

}