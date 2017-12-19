package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_leave_entitlement_type database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_entitlement_type")
@NamedQuery(name="OhrmLeaveEntitlementType.findAll", query="SELECT o FROM OhrmLeaveEntitlementType o")
public class OhrmLeaveEntitlementType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="is_editable")
	private byte isEditable;

	private String name;

	//bi-directional many-to-one association to OhrmLeaveAdjustment
	@OneToMany(mappedBy="ohrmLeaveEntitlementType")
	private List<OhrmLeaveAdjustment> ohrmLeaveAdjustments;

	//bi-directional many-to-one association to OhrmLeaveEntitlement
	@OneToMany(mappedBy="ohrmLeaveEntitlementType")
	private List<OhrmLeaveEntitlement> ohrmLeaveEntitlements;

	public OhrmLeaveEntitlementType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsEditable() {
		return this.isEditable;
	}

	public void setIsEditable(byte isEditable) {
		this.isEditable = isEditable;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmLeaveAdjustment> getOhrmLeaveAdjustments() {
		return this.ohrmLeaveAdjustments;
	}

	public void setOhrmLeaveAdjustments(List<OhrmLeaveAdjustment> ohrmLeaveAdjustments) {
		this.ohrmLeaveAdjustments = ohrmLeaveAdjustments;
	}

	public OhrmLeaveAdjustment addOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().add(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setOhrmLeaveEntitlementType(this);

		return ohrmLeaveAdjustment;
	}

	public OhrmLeaveAdjustment removeOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().remove(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setOhrmLeaveEntitlementType(null);

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
		ohrmLeaveEntitlement.setOhrmLeaveEntitlementType(this);

		return ohrmLeaveEntitlement;
	}

	public OhrmLeaveEntitlement removeOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().remove(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setOhrmLeaveEntitlementType(null);

		return ohrmLeaveEntitlement;
	}

}