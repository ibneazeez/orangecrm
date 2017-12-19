package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_leave_type database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_type")
@NamedQuery(name="OhrmLeaveType.findAll", query="SELECT o FROM OhrmLeaveType o")
public class OhrmLeaveType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private byte deleted;

	@Column(name="exclude_in_reports_if_no_entitlement")
	private byte excludeInReportsIfNoEntitlement;

	private String name;

	//bi-directional many-to-one association to OhrmLeave
	@OneToMany(mappedBy="ohrmLeaveType")
	private List<OhrmLeave> ohrmLeaves;

	//bi-directional many-to-one association to OhrmLeaveAdjustment
	@OneToMany(mappedBy="ohrmLeaveType")
	private List<OhrmLeaveAdjustment> ohrmLeaveAdjustments;

	//bi-directional many-to-one association to OhrmLeaveEntitlement
	@OneToMany(mappedBy="ohrmLeaveType")
	private List<OhrmLeaveEntitlement> ohrmLeaveEntitlements;

	//bi-directional many-to-one association to OhrmLeaveRequest
	@OneToMany(mappedBy="ohrmLeaveType")
	private List<OhrmLeaveRequest> ohrmLeaveRequests;

	//bi-directional many-to-one association to OhrmOperationalCountry
	@ManyToOne
	@JoinColumn(name="operational_country_id")
	private OhrmOperationalCountry ohrmOperationalCountry;

	public OhrmLeaveType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getDeleted() {
		return this.deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public byte getExcludeInReportsIfNoEntitlement() {
		return this.excludeInReportsIfNoEntitlement;
	}

	public void setExcludeInReportsIfNoEntitlement(byte excludeInReportsIfNoEntitlement) {
		this.excludeInReportsIfNoEntitlement = excludeInReportsIfNoEntitlement;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmLeave> getOhrmLeaves() {
		return this.ohrmLeaves;
	}

	public void setOhrmLeaves(List<OhrmLeave> ohrmLeaves) {
		this.ohrmLeaves = ohrmLeaves;
	}

	public OhrmLeave addOhrmLeave(OhrmLeave ohrmLeave) {
		getOhrmLeaves().add(ohrmLeave);
		ohrmLeave.setOhrmLeaveType(this);

		return ohrmLeave;
	}

	public OhrmLeave removeOhrmLeave(OhrmLeave ohrmLeave) {
		getOhrmLeaves().remove(ohrmLeave);
		ohrmLeave.setOhrmLeaveType(null);

		return ohrmLeave;
	}

	public List<OhrmLeaveAdjustment> getOhrmLeaveAdjustments() {
		return this.ohrmLeaveAdjustments;
	}

	public void setOhrmLeaveAdjustments(List<OhrmLeaveAdjustment> ohrmLeaveAdjustments) {
		this.ohrmLeaveAdjustments = ohrmLeaveAdjustments;
	}

	public OhrmLeaveAdjustment addOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().add(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setOhrmLeaveType(this);

		return ohrmLeaveAdjustment;
	}

	public OhrmLeaveAdjustment removeOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().remove(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setOhrmLeaveType(null);

		return ohrmLeaveAdjustment;
	}

	public List<OhrmLeaveEntitlement> getOhrmLeaveEntitlements() {
		return this.ohrmLeaveEntitlements;
	}

	public void setOhrmLeaveEntitlements(List<OhrmLeaveEntitlement> ohrmLeaveEntitlements) {
		this.ohrmLeaveEntitlements = ohrmLeaveEntitlements;
	}

	public OhrmLeaveEntitlement addOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().add(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setOhrmLeaveType(this);

		return ohrmLeaveEntitlement;
	}

	public OhrmLeaveEntitlement removeOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().remove(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setOhrmLeaveType(null);

		return ohrmLeaveEntitlement;
	}

	public List<OhrmLeaveRequest> getOhrmLeaveRequests() {
		return this.ohrmLeaveRequests;
	}

	public void setOhrmLeaveRequests(List<OhrmLeaveRequest> ohrmLeaveRequests) {
		this.ohrmLeaveRequests = ohrmLeaveRequests;
	}

	public OhrmLeaveRequest addOhrmLeaveRequest(OhrmLeaveRequest ohrmLeaveRequest) {
		getOhrmLeaveRequests().add(ohrmLeaveRequest);
		ohrmLeaveRequest.setOhrmLeaveType(this);

		return ohrmLeaveRequest;
	}

	public OhrmLeaveRequest removeOhrmLeaveRequest(OhrmLeaveRequest ohrmLeaveRequest) {
		getOhrmLeaveRequests().remove(ohrmLeaveRequest);
		ohrmLeaveRequest.setOhrmLeaveType(null);

		return ohrmLeaveRequest;
	}

	public OhrmOperationalCountry getOhrmOperationalCountry() {
		return this.ohrmOperationalCountry;
	}

	public void setOhrmOperationalCountry(OhrmOperationalCountry ohrmOperationalCountry) {
		this.ohrmOperationalCountry = ohrmOperationalCountry;
	}

}