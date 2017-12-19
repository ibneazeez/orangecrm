package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ohrm_performance_tracker_reviewer database table.
 * 
 */
@Entity
@Table(name="ohrm_performance_tracker_reviewer")
@NamedQuery(name="OhrmPerformanceTrackerReviewer.findAll", query="SELECT o FROM OhrmPerformanceTrackerReviewer o")
public class OhrmPerformanceTrackerReviewer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="added_date")
	private Timestamp addedDate;

	private int status;

	//bi-directional many-to-one association to OhrmPerformanceTrack
	@ManyToOne
	@JoinColumn(name="performance_track_id")
	private OhrmPerformanceTrack ohrmPerformanceTrack;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="reviewer_id")
	private HsHrEmployee hsHrEmployee;

	public OhrmPerformanceTrackerReviewer() {
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

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
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