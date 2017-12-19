package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_user database table.
 * 
 */
@Entity
@Table(name="ohrm_user")
@NamedQuery(name="OhrmUser.findAll", query="SELECT o FROM OhrmUser o")
public class OhrmUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="created_by")
	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_entered")
	private Date dateEntered;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private byte deleted;

	@Column(name="modified_user_id")
	private int modifiedUserId;

	private byte status;

	@Column(name="user_name")
	private String userName;

	@Column(name="user_password")
	private String userPassword;

	//bi-directional many-to-one association to HsHrMailnotification
	@OneToMany(mappedBy="ohrmUser")
	private List<HsHrMailnotification> hsHrMailnotifications;

	//bi-directional many-to-one association to OhrmLeaveAdjustment
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmLeaveAdjustment> ohrmLeaveAdjustments;

	//bi-directional many-to-one association to OhrmLeaveComment
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmLeaveComment> ohrmLeaveComments;

	//bi-directional many-to-one association to OhrmLeaveEntitlement
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmLeaveEntitlement> ohrmLeaveEntitlements;

	//bi-directional many-to-one association to OhrmLeaveRequestComment
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmLeaveRequestComment> ohrmLeaveRequestComments;

	//bi-directional many-to-one association to OhrmOpenidUserIdentity
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmOpenidUserIdentity> ohrmOpenidUserIdentities;

	//bi-directional many-to-one association to OhrmPerformanceTrackerLog
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmPerformanceTrackerLog> ohrmPerformanceTrackerLogs;

	//bi-directional many-to-one association to OhrmTimesheetActionLog
	@OneToMany(mappedBy="ohrmUser")
	private List<OhrmTimesheetActionLog> ohrmTimesheetActionLogs;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmUserRole
	@ManyToOne
	@JoinColumn(name="user_role_id")
	private OhrmUserRole ohrmUserRole;

	public OhrmUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDateEntered() {
		return this.dateEntered;
	}

	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public byte getDeleted() {
		return this.deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public int getModifiedUserId() {
		return this.modifiedUserId;
	}

	public void setModifiedUserId(int modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<HsHrMailnotification> getHsHrMailnotifications() {
		return this.hsHrMailnotifications;
	}

	public void setHsHrMailnotifications(List<HsHrMailnotification> hsHrMailnotifications) {
		this.hsHrMailnotifications = hsHrMailnotifications;
	}

	public HsHrMailnotification addHsHrMailnotification(HsHrMailnotification hsHrMailnotification) {
		getHsHrMailnotifications().add(hsHrMailnotification);
		hsHrMailnotification.setOhrmUser(this);

		return hsHrMailnotification;
	}

	public HsHrMailnotification removeHsHrMailnotification(HsHrMailnotification hsHrMailnotification) {
		getHsHrMailnotifications().remove(hsHrMailnotification);
		hsHrMailnotification.setOhrmUser(null);

		return hsHrMailnotification;
	}

	public List<OhrmLeaveAdjustment> getOhrmLeaveAdjustments() {
		return this.ohrmLeaveAdjustments;
	}

	public void setOhrmLeaveAdjustments(List<OhrmLeaveAdjustment> ohrmLeaveAdjustments) {
		this.ohrmLeaveAdjustments = ohrmLeaveAdjustments;
	}

	public OhrmLeaveAdjustment addOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().add(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setOhrmUser(this);

		return ohrmLeaveAdjustment;
	}

	public OhrmLeaveAdjustment removeOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().remove(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setOhrmUser(null);

		return ohrmLeaveAdjustment;
	}

	public List<OhrmLeaveComment> getOhrmLeaveComments() {
		return this.ohrmLeaveComments;
	}

	public void setOhrmLeaveComments(List<OhrmLeaveComment> ohrmLeaveComments) {
		this.ohrmLeaveComments = ohrmLeaveComments;
	}

	public OhrmLeaveComment addOhrmLeaveComment(OhrmLeaveComment ohrmLeaveComment) {
		getOhrmLeaveComments().add(ohrmLeaveComment);
		ohrmLeaveComment.setOhrmUser(this);

		return ohrmLeaveComment;
	}

	public OhrmLeaveComment removeOhrmLeaveComment(OhrmLeaveComment ohrmLeaveComment) {
		getOhrmLeaveComments().remove(ohrmLeaveComment);
		ohrmLeaveComment.setOhrmUser(null);

		return ohrmLeaveComment;
	}

	public List<OhrmLeaveEntitlement> getOhrmLeaveEntitlements() {
		return this.ohrmLeaveEntitlements;
	}

	public void setOhrmLeaveEntitlements(List<OhrmLeaveEntitlement> ohrmLeaveEntitlements) {
		this.ohrmLeaveEntitlements = ohrmLeaveEntitlements;
	}

	public OhrmLeaveEntitlement addOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().add(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setOhrmUser(this);

		return ohrmLeaveEntitlement;
	}

	public OhrmLeaveEntitlement removeOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().remove(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setOhrmUser(null);

		return ohrmLeaveEntitlement;
	}

	public List<OhrmLeaveRequestComment> getOhrmLeaveRequestComments() {
		return this.ohrmLeaveRequestComments;
	}

	public void setOhrmLeaveRequestComments(List<OhrmLeaveRequestComment> ohrmLeaveRequestComments) {
		this.ohrmLeaveRequestComments = ohrmLeaveRequestComments;
	}

	public OhrmLeaveRequestComment addOhrmLeaveRequestComment(OhrmLeaveRequestComment ohrmLeaveRequestComment) {
		getOhrmLeaveRequestComments().add(ohrmLeaveRequestComment);
		ohrmLeaveRequestComment.setOhrmUser(this);

		return ohrmLeaveRequestComment;
	}

	public OhrmLeaveRequestComment removeOhrmLeaveRequestComment(OhrmLeaveRequestComment ohrmLeaveRequestComment) {
		getOhrmLeaveRequestComments().remove(ohrmLeaveRequestComment);
		ohrmLeaveRequestComment.setOhrmUser(null);

		return ohrmLeaveRequestComment;
	}

	public List<OhrmOpenidUserIdentity> getOhrmOpenidUserIdentities() {
		return this.ohrmOpenidUserIdentities;
	}

	public void setOhrmOpenidUserIdentities(List<OhrmOpenidUserIdentity> ohrmOpenidUserIdentities) {
		this.ohrmOpenidUserIdentities = ohrmOpenidUserIdentities;
	}

	public OhrmOpenidUserIdentity addOhrmOpenidUserIdentity(OhrmOpenidUserIdentity ohrmOpenidUserIdentity) {
		getOhrmOpenidUserIdentities().add(ohrmOpenidUserIdentity);
		ohrmOpenidUserIdentity.setOhrmUser(this);

		return ohrmOpenidUserIdentity;
	}

	public OhrmOpenidUserIdentity removeOhrmOpenidUserIdentity(OhrmOpenidUserIdentity ohrmOpenidUserIdentity) {
		getOhrmOpenidUserIdentities().remove(ohrmOpenidUserIdentity);
		ohrmOpenidUserIdentity.setOhrmUser(null);

		return ohrmOpenidUserIdentity;
	}

	public List<OhrmPerformanceTrackerLog> getOhrmPerformanceTrackerLogs() {
		return this.ohrmPerformanceTrackerLogs;
	}

	public void setOhrmPerformanceTrackerLogs(List<OhrmPerformanceTrackerLog> ohrmPerformanceTrackerLogs) {
		this.ohrmPerformanceTrackerLogs = ohrmPerformanceTrackerLogs;
	}

	public OhrmPerformanceTrackerLog addOhrmPerformanceTrackerLog(OhrmPerformanceTrackerLog ohrmPerformanceTrackerLog) {
		getOhrmPerformanceTrackerLogs().add(ohrmPerformanceTrackerLog);
		ohrmPerformanceTrackerLog.setOhrmUser(this);

		return ohrmPerformanceTrackerLog;
	}

	public OhrmPerformanceTrackerLog removeOhrmPerformanceTrackerLog(OhrmPerformanceTrackerLog ohrmPerformanceTrackerLog) {
		getOhrmPerformanceTrackerLogs().remove(ohrmPerformanceTrackerLog);
		ohrmPerformanceTrackerLog.setOhrmUser(null);

		return ohrmPerformanceTrackerLog;
	}

	public List<OhrmTimesheetActionLog> getOhrmTimesheetActionLogs() {
		return this.ohrmTimesheetActionLogs;
	}

	public void setOhrmTimesheetActionLogs(List<OhrmTimesheetActionLog> ohrmTimesheetActionLogs) {
		this.ohrmTimesheetActionLogs = ohrmTimesheetActionLogs;
	}

	public OhrmTimesheetActionLog addOhrmTimesheetActionLog(OhrmTimesheetActionLog ohrmTimesheetActionLog) {
		getOhrmTimesheetActionLogs().add(ohrmTimesheetActionLog);
		ohrmTimesheetActionLog.setOhrmUser(this);

		return ohrmTimesheetActionLog;
	}

	public OhrmTimesheetActionLog removeOhrmTimesheetActionLog(OhrmTimesheetActionLog ohrmTimesheetActionLog) {
		getOhrmTimesheetActionLogs().remove(ohrmTimesheetActionLog);
		ohrmTimesheetActionLog.setOhrmUser(null);

		return ohrmTimesheetActionLog;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmUserRole getOhrmUserRole() {
		return this.ohrmUserRole;
	}

	public void setOhrmUserRole(OhrmUserRole ohrmUserRole) {
		this.ohrmUserRole = ohrmUserRole;
	}

}