package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_leave_comment database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_comment")
@NamedQuery(name="OhrmLeaveComment.findAll", query="SELECT o FROM OhrmLeaveComment o")
public class OhrmLeaveComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String comments;

	@Temporal(TemporalType.TIMESTAMP)
	private Date created;

	@Column(name="created_by_name")
	private String createdByName;

	//bi-directional many-to-one association to OhrmLeave
	@ManyToOne
	@JoinColumn(name="leave_id")
	private OhrmLeave ohrmLeave;

	//bi-directional many-to-one association to OhrmUser
	@ManyToOne
	@JoinColumn(name="created_by_id")
	private OhrmUser ohrmUser;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="created_by_emp_number")
	private HsHrEmployee hsHrEmployee;

	public OhrmLeaveComment() {
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

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public OhrmLeave getOhrmLeave() {
		return this.ohrmLeave;
	}

	public void setOhrmLeave(OhrmLeave ohrmLeave) {
		this.ohrmLeave = ohrmLeave;
	}

	public OhrmUser getOhrmUser() {
		return this.ohrmUser;
	}

	public void setOhrmUser(OhrmUser ohrmUser) {
		this.ohrmUser = ohrmUser;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}