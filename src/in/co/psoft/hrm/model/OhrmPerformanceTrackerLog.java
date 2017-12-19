package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ohrm_performance_tracker_log database table.
 * 
 */
@Entity
@Table(name="ohrm_performance_tracker_log")
@NamedQuery(name="OhrmPerformanceTrackerLog.findAll", query="SELECT o FROM OhrmPerformanceTrackerLog o")
public class OhrmPerformanceTrackerLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String achievement;

	@Column(name="added_date")
	private Timestamp addedDate;

	private String comment;

	private String log;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private int status;

	//bi-directional many-to-one association to OhrmUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private OhrmUser ohrmUser;

	//bi-directional many-to-one association to OhrmPerformanceTrack
	@ManyToOne
	@JoinColumn(name="performance_track_id")
	private OhrmPerformanceTrack ohrmPerformanceTrack;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="reviewer_id")
	private HsHrEmployee hsHrEmployee;

	public OhrmPerformanceTrackerLog() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAchievement() {
		return this.achievement;
	}

	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public OhrmUser getOhrmUser() {
		return this.ohrmUser;
	}

	public void setOhrmUser(OhrmUser ohrmUser) {
		this.ohrmUser = ohrmUser;
	}

	public OhrmPerformanceTrack getOhrmPerformanceTrack() {
		return this.ohrmPerformanceTrack;
	}

	public void setOhrmPerformanceTrack(OhrmPerformanceTrack ohrmPerformanceTrack) {
		this.ohrmPerformanceTrack = ohrmPerformanceTrack;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}