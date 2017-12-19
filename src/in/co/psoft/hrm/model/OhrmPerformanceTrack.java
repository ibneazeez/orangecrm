package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ohrm_performance_track database table.
 * 
 */
@Entity
@Table(name="ohrm_performance_track")
@NamedQuery(name="OhrmPerformanceTrack.findAll", query="SELECT o FROM OhrmPerformanceTrack o")
public class OhrmPerformanceTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="added_date")
	private Timestamp addedDate;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private int status;

	@Column(name="tracker_name")
	private String trackerName;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee1;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="added_by")
	private HsHrEmployee hsHrEmployee2;

	//bi-directional many-to-one association to OhrmPerformanceTrackerLog
	@OneToMany(mappedBy="ohrmPerformanceTrack")
	private List<OhrmPerformanceTrackerLog> ohrmPerformanceTrackerLogs;

	//bi-directional many-to-one association to OhrmPerformanceTrackerReviewer
	@OneToMany(mappedBy="ohrmPerformanceTrack")
	private List<OhrmPerformanceTrackerReviewer> ohrmPerformanceTrackerReviewers;

	public OhrmPerformanceTrack() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
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

	public String getTrackerName() {
		return this.trackerName;
	}

	public void setTrackerName(String trackerName) {
		this.trackerName = trackerName;
	}

	public HsHrEmployee getHsHrEmployee1() {
		return this.hsHrEmployee1;
	}

	public void setHsHrEmployee1(HsHrEmployee hsHrEmployee1) {
		this.hsHrEmployee1 = hsHrEmployee1;
	}

	public HsHrEmployee getHsHrEmployee2() {
		return this.hsHrEmployee2;
	}

	public void setHsHrEmployee2(HsHrEmployee hsHrEmployee2) {
		this.hsHrEmployee2 = hsHrEmployee2;
	}

	public List<OhrmPerformanceTrackerLog> getOhrmPerformanceTrackerLogs() {
		return this.ohrmPerformanceTrackerLogs;
	}

	public void setOhrmPerformanceTrackerLogs(List<OhrmPerformanceTrackerLog> ohrmPerformanceTrackerLogs) {
		this.ohrmPerformanceTrackerLogs = ohrmPerformanceTrackerLogs;
	}

	public OhrmPerformanceTrackerLog addOhrmPerformanceTrackerLog(OhrmPerformanceTrackerLog ohrmPerformanceTrackerLog) {
		getOhrmPerformanceTrackerLogs().add(ohrmPerformanceTrackerLog);
		ohrmPerformanceTrackerLog.setOhrmPerformanceTrack(this);

		return ohrmPerformanceTrackerLog;
	}

	public OhrmPerformanceTrackerLog removeOhrmPerformanceTrackerLog(OhrmPerformanceTrackerLog ohrmPerformanceTrackerLog) {
		getOhrmPerformanceTrackerLogs().remove(ohrmPerformanceTrackerLog);
		ohrmPerformanceTrackerLog.setOhrmPerformanceTrack(null);

		return ohrmPerformanceTrackerLog;
	}

	public List<OhrmPerformanceTrackerReviewer> getOhrmPerformanceTrackerReviewers() {
		return this.ohrmPerformanceTrackerReviewers;
	}

	public void setOhrmPerformanceTrackerReviewers(List<OhrmPerformanceTrackerReviewer> ohrmPerformanceTrackerReviewers) {
		this.ohrmPerformanceTrackerReviewers = ohrmPerformanceTrackerReviewers;
	}

	public OhrmPerformanceTrackerReviewer addOhrmPerformanceTrackerReviewer(OhrmPerformanceTrackerReviewer ohrmPerformanceTrackerReviewer) {
		getOhrmPerformanceTrackerReviewers().add(ohrmPerformanceTrackerReviewer);
		ohrmPerformanceTrackerReviewer.setOhrmPerformanceTrack(this);

		return ohrmPerformanceTrackerReviewer;
	}

	public OhrmPerformanceTrackerReviewer removeOhrmPerformanceTrackerReviewer(OhrmPerformanceTrackerReviewer ohrmPerformanceTrackerReviewer) {
		getOhrmPerformanceTrackerReviewers().remove(ohrmPerformanceTrackerReviewer);
		ohrmPerformanceTrackerReviewer.setOhrmPerformanceTrack(null);

		return ohrmPerformanceTrackerReviewer;
	}

}