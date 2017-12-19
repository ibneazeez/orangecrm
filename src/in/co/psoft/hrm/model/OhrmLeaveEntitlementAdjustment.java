package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ohrm_leave_entitlement_adjustment database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_entitlement_adjustment")
@NamedQuery(name="OhrmLeaveEntitlementAdjustment.findAll", query="SELECT o FROM OhrmLeaveEntitlementAdjustment o")
public class OhrmLeaveEntitlementAdjustment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="length_days")
	private BigDecimal lengthDays;

	//bi-directional many-to-one association to OhrmLeaveEntitlement
	@ManyToOne
	@JoinColumn(name="entitlement_id")
	private OhrmLeaveEntitlement ohrmLeaveEntitlement;

	//bi-directional many-to-one association to OhrmLeaveAdjustment
	@ManyToOne
	@JoinColumn(name="adjustment_id")
	private OhrmLeaveAdjustment ohrmLeaveAdjustment;

	public OhrmLeaveEntitlementAdjustment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getLengthDays() {
		return this.lengthDays;
	}

	public void setLengthDays(BigDecimal lengthDays) {
		this.lengthDays = lengthDays;
	}

	public OhrmLeaveEntitlement getOhrmLeaveEntitlement() {
		return this.ohrmLeaveEntitlement;
	}

	public void setOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		this.ohrmLeaveEntitlement = ohrmLeaveEntitlement;
	}

	public OhrmLeaveAdjustment getOhrmLeaveAdjustment() {
		return this.ohrmLeaveAdjustment;
	}

	public void setOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		this.ohrmLeaveAdjustment = ohrmLeaveAdjustment;
	}

}