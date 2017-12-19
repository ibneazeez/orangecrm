package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_emp_reportto database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_reportto")
@NamedQuery(name="HsHrEmpReportto.findAll", query="SELECT h FROM HsHrEmpReportto h")
public class HsHrEmpReportto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpReporttoPK id;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="erep_sup_emp_number")
	private HsHrEmployee hsHrEmployee1;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="erep_sub_emp_number")
	private HsHrEmployee hsHrEmployee2;

	//bi-directional many-to-one association to OhrmEmpReportingMethod
	@ManyToOne
	@JoinColumn(name="erep_reporting_mode")
	private OhrmEmpReportingMethod ohrmEmpReportingMethod;

	public HsHrEmpReportto() {
	}

	public HsHrEmpReporttoPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpReporttoPK id) {
		this.id = id;
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

	public OhrmEmpReportingMethod getOhrmEmpReportingMethod() {
		return this.ohrmEmpReportingMethod;
	}

	public void setOhrmEmpReportingMethod(OhrmEmpReportingMethod ohrmEmpReportingMethod) {
		this.ohrmEmpReportingMethod = ohrmEmpReportingMethod;
	}

}