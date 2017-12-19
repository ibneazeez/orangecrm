package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the hs_hr_emp_member_detail database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_member_detail")
@NamedQuery(name="HsHrEmpMemberDetail.findAll", query="SELECT h FROM HsHrEmpMemberDetail h")
public class HsHrEmpMemberDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpMemberDetailPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ememb_commence_date")
	private Date emembCommenceDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ememb_renewal_date")
	private Date emembRenewalDate;

	@Column(name="ememb_subs_currency")
	private String emembSubsCurrency;

	@Column(name="ememb_subscript_amount")
	private BigDecimal emembSubscriptAmount;

	@Column(name="ememb_subscript_ownership")
	private String emembSubscriptOwnership;

	//bi-directional many-to-one association to OhrmMembership
	@ManyToOne
	@JoinColumn(name="membship_code")
	private OhrmMembership ohrmMembership;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpMemberDetail() {
	}

	public HsHrEmpMemberDetailPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpMemberDetailPK id) {
		this.id = id;
	}

	public Date getEmembCommenceDate() {
		return this.emembCommenceDate;
	}

	public void setEmembCommenceDate(Date emembCommenceDate) {
		this.emembCommenceDate = emembCommenceDate;
	}

	public Date getEmembRenewalDate() {
		return this.emembRenewalDate;
	}

	public void setEmembRenewalDate(Date emembRenewalDate) {
		this.emembRenewalDate = emembRenewalDate;
	}

	public String getEmembSubsCurrency() {
		return this.emembSubsCurrency;
	}

	public void setEmembSubsCurrency(String emembSubsCurrency) {
		this.emembSubsCurrency = emembSubsCurrency;
	}

	public BigDecimal getEmembSubscriptAmount() {
		return this.emembSubscriptAmount;
	}

	public void setEmembSubscriptAmount(BigDecimal emembSubscriptAmount) {
		this.emembSubscriptAmount = emembSubscriptAmount;
	}

	public String getEmembSubscriptOwnership() {
		return this.emembSubscriptOwnership;
	}

	public void setEmembSubscriptOwnership(String emembSubscriptOwnership) {
		this.emembSubscriptOwnership = emembSubscriptOwnership;
	}

	public OhrmMembership getOhrmMembership() {
		return this.ohrmMembership;
	}

	public void setOhrmMembership(OhrmMembership ohrmMembership) {
		this.ohrmMembership = ohrmMembership;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}