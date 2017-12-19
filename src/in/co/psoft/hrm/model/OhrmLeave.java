package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_leave database table.
 * 
 */
@Entity
@Table(name="ohrm_leave")
@NamedQuery(name="OhrmLeave.findAll", query="SELECT o FROM OhrmLeave o")
public class OhrmLeave implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String comments;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="duration_type")
	private byte durationType;

	@Column(name="emp_number")
	private int empNumber;

	@Column(name="end_time")
	private Time endTime;

	@Column(name="length_days")
	private BigDecimal lengthDays;

	@Column(name="length_hours")
	private BigDecimal lengthHours;

	@Column(name="start_time")
	private Time startTime;

	private short status;

	//bi-directional many-to-one association to OhrmLeaveRequest
	@ManyToOne
	@JoinColumn(name="leave_request_id")
	private OhrmLeaveRequest ohrmLeaveRequest;

	//bi-directional many-to-one association to OhrmLeaveType
	@ManyToOne
	@JoinColumn(name="leave_type_id")
	private OhrmLeaveType ohrmLeaveType;

	//bi-directional many-to-one association to OhrmLeaveComment
	@OneToMany(mappedBy="ohrmLeave")
	private List<OhrmLeaveComment> ohrmLeaveComments;

	//bi-directional many-to-one association to OhrmLeaveLeaveEntitlement
	@OneToMany(mappedBy="ohrmLeave")
	private List<OhrmLeaveLeaveEntitlement> ohrmLeaveLeaveEntitlements;

	public OhrmLeave() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte getDurationType() {
		return this.durationType;
	}

	public void setDurationType(byte durationType) {
		this.durationType = durationType;
	}

	public int getEmpNumber() {
		return this.empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public BigDecimal getLengthDays() {
		return this.lengthDays;
	}

	public void setLengthDays(BigDecimal lengthDays) {
		this.lengthDays = lengthDays;
	}

	public BigDecimal getLengthHours() {
		return this.lengthHours;
	}

	public void setLengthHours(BigDecimal lengthHours) {
		this.lengthHours = lengthHours;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public short getStatus() {
		return this.status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

	public OhrmLeaveRequest getOhrmLeaveRequest() {
		return this.ohrmLeaveRequest;
	}

	public void setOhrmLeaveRequest(OhrmLeaveRequest ohrmLeaveRequest) {
		this.ohrmLeaveRequest = ohrmLeaveRequest;
	}

	public OhrmLeaveType getOhrmLeaveType() {
		return this.ohrmLeaveType;
	}

	public void setOhrmLeaveType(OhrmLeaveType ohrmLeaveType) {
		this.ohrmLeaveType = ohrmLeaveType;
	}

	public List<OhrmLeaveComment> getOhrmLeaveComments() {
		return this.ohrmLeaveComments;
	}

	public void setOhrmLeaveComments(List<OhrmLeaveComment> ohrmLeaveComments) {
		this.ohrmLeaveComments = ohrmLeaveComments;
	}

	public OhrmLeaveComment addOhrmLeaveComment(OhrmLeaveComment ohrmLeaveComment) {
		getOhrmLeaveComments().add(ohrmLeaveComment);
		ohrmLeaveComment.setOhrmLeave(this);

		return ohrmLeaveComment;
	}

	public OhrmLeaveComment removeOhrmLeaveComment(OhrmLeaveComment ohrmLeaveComment) {
		getOhrmLeaveComments().remove(ohrmLeaveComment);
		ohrmLeaveComment.setOhrmLeave(null);

		return ohrmLeaveComment;
	}

	public List<OhrmLeaveLeaveEntitlement> getOhrmLeaveLeaveEntitlements() {
		return this.ohrmLeaveLeaveEntitlements;
	}

	public void setOhrmLeaveLeaveEntitlements(List<OhrmLeaveLeaveEntitlement> ohrmLeaveLeaveEntitlements) {
		this.ohrmLeaveLeaveEntitlements = ohrmLeaveLeaveEntitlements;
	}

	public OhrmLeaveLeaveEntitlement addOhrmLeaveLeaveEntitlement(OhrmLeaveLeaveEntitlement ohrmLeaveLeaveEntitlement) {
		getOhrmLeaveLeaveEntitlements().add(ohrmLeaveLeaveEntitlement);
		ohrmLeaveLeaveEntitlement.setOhrmLeave(this);

		return ohrmLeaveLeaveEntitlement;
	}

	public OhrmLeaveLeaveEntitlement removeOhrmLeaveLeaveEntitlement(OhrmLeaveLeaveEntitlement ohrmLeaveLeaveEntitlement) {
		getOhrmLeaveLeaveEntitlements().remove(ohrmLeaveLeaveEntitlement);
		ohrmLeaveLeaveEntitlement.setOhrmLeave(null);

		return ohrmLeaveLeaveEntitlement;
	}

}