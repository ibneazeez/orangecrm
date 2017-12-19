package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ohrm_leave_leave_entitlement database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_leave_entitlement")
@NamedQuery(name="OhrmLeaveLeaveEntitlement.findAll", query="SELECT o FROM OhrmLeaveLeaveEntitlement o")
public class OhrmLeaveLeaveEntitlement implements Serializable {
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

	//bi-directional many-to-one association to OhrmLeave
	@ManyToOne
	@JoinColumn(name="leave_id")
	private OhrmLeave ohrmLeave;

	public OhrmLeaveLeaveEntitlement() {
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

	public OhrmLeave getOhrmLeave() {
		return this.ohrmLeave;
	}

	public void setOhrmLeave(OhrmLeave ohrmLeave) {
		this.ohrmLeave = ohrmLeave;
	}

}