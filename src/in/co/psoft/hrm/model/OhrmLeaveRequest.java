package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_leave_request database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_request")
@NamedQuery(name="OhrmLeaveRequest.findAll", query="SELECT o FROM OhrmLeaveRequest o")
public class OhrmLeaveRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="date_applied")
	private Date dateApplied;

	//bi-directional many-to-one association to OhrmLeave
	@OneToMany(mappedBy="ohrmLeaveRequest")
	private List<OhrmLeave> ohrmLeaves;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmLeaveType
	@ManyToOne
	@JoinColumn(name="leave_type_id")
	private OhrmLeaveType ohrmLeaveType;

	//bi-directional many-to-one association to OhrmLeaveRequestComment
	@OneToMany(mappedBy="ohrmLeaveRequest")
	private List<OhrmLeaveRequestComment> ohrmLeaveRequestComments;

	public OhrmLeaveRequest() {
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

	public Date getDateApplied() {
		return this.dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public List<OhrmLeave> getOhrmLeaves() {
		return this.ohrmLeaves;
	}

	public void setOhrmLeaves(List<OhrmLeave> ohrmLeaves) {
		this.ohrmLeaves = ohrmLeaves;
	}

	public OhrmLeave addOhrmLeave(OhrmLeave ohrmLeave) {
		getOhrmLeaves().add(ohrmLeave);
		ohrmLeave.setOhrmLeaveRequest(this);

		return ohrmLeave;
	}

	public OhrmLeave removeOhrmLeave(OhrmLeave ohrmLeave) {
		getOhrmLeaves().remove(ohrmLeave);
		ohrmLeave.setOhrmLeaveRequest(null);

		return ohrmLeave;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmLeaveType getOhrmLeaveType() {
		return this.ohrmLeaveType;
	}

	public void setOhrmLeaveType(OhrmLeaveType ohrmLeaveType) {
		this.ohrmLeaveType = ohrmLeaveType;
	}

	public List<OhrmLeaveRequestComment> getOhrmLeaveRequestComments() {
		return this.ohrmLeaveRequestComments;
	}

	public void setOhrmLeaveRequestComments(List<OhrmLeaveRequestComment> ohrmLeaveRequestComments) {
		this.ohrmLeaveRequestComments = ohrmLeaveRequestComments;
	}

	public OhrmLeaveRequestComment addOhrmLeaveRequestComment(OhrmLeaveRequestComment ohrmLeaveRequestComment) {
		getOhrmLeaveRequestComments().add(ohrmLeaveRequestComment);
		ohrmLeaveRequestComment.setOhrmLeaveRequest(this);

		return ohrmLeaveRequestComment;
	}

	public OhrmLeaveRequestComment removeOhrmLeaveRequestComment(OhrmLeaveRequestComment ohrmLeaveRequestComment) {
		getOhrmLeaveRequestComments().remove(ohrmLeaveRequestComment);
		ohrmLeaveRequestComment.setOhrmLeaveRequest(null);

		return ohrmLeaveRequestComment;
	}

}