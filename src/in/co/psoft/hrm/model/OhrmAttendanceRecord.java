package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ohrm_attendance_record database table.
 * 
 */
@Entity
@Table(name="ohrm_attendance_record")
@NamedQuery(name="OhrmAttendanceRecord.findAll", query="SELECT o FROM OhrmAttendanceRecord o")
public class OhrmAttendanceRecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="employee_id")
	private BigInteger employeeId;

	@Column(name="punch_in_note")
	private String punchInNote;

	@Column(name="punch_in_time_offset")
	private String punchInTimeOffset;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="punch_in_user_time")
	private Date punchInUserTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="punch_in_utc_time")
	private Date punchInUtcTime;

	@Column(name="punch_out_note")
	private String punchOutNote;

	@Column(name="punch_out_time_offset")
	private String punchOutTimeOffset;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="punch_out_user_time")
	private Date punchOutUserTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="punch_out_utc_time")
	private Date punchOutUtcTime;

	private String state;

	public OhrmAttendanceRecord() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(BigInteger employeeId) {
		this.employeeId = employeeId;
	}

	public String getPunchInNote() {
		return this.punchInNote;
	}

	public void setPunchInNote(String punchInNote) {
		this.punchInNote = punchInNote;
	}

	public String getPunchInTimeOffset() {
		return this.punchInTimeOffset;
	}

	public void setPunchInTimeOffset(String punchInTimeOffset) {
		this.punchInTimeOffset = punchInTimeOffset;
	}

	public Date getPunchInUserTime() {
		return this.punchInUserTime;
	}

	public void setPunchInUserTime(Date punchInUserTime) {
		this.punchInUserTime = punchInUserTime;
	}

	public Date getPunchInUtcTime() {
		return this.punchInUtcTime;
	}

	public void setPunchInUtcTime(Date punchInUtcTime) {
		this.punchInUtcTime = punchInUtcTime;
	}

	public String getPunchOutNote() {
		return this.punchOutNote;
	}

	public void setPunchOutNote(String punchOutNote) {
		this.punchOutNote = punchOutNote;
	}

	public String getPunchOutTimeOffset() {
		return this.punchOutTimeOffset;
	}

	public void setPunchOutTimeOffset(String punchOutTimeOffset) {
		this.punchOutTimeOffset = punchOutTimeOffset;
	}

	public Date getPunchOutUserTime() {
		return this.punchOutUserTime;
	}

	public void setPunchOutUserTime(Date punchOutUserTime) {
		this.punchOutUserTime = punchOutUserTime;
	}

	public Date getPunchOutUtcTime() {
		return this.punchOutUtcTime;
	}

	public void setPunchOutUtcTime(Date punchOutUtcTime) {
		this.punchOutUtcTime = punchOutUtcTime;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}