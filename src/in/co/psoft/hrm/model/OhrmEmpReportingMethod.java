package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_emp_reporting_method database table.
 * 
 */
@Entity
@Table(name="ohrm_emp_reporting_method")
@NamedQuery(name="OhrmEmpReportingMethod.findAll", query="SELECT o FROM OhrmEmpReportingMethod o")
public class OhrmEmpReportingMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="reporting_method_id")
	private int reportingMethodId;

	@Column(name="reporting_method_name")
	private String reportingMethodName;

	//bi-directional many-to-one association to HsHrEmpReportto
	@OneToMany(mappedBy="ohrmEmpReportingMethod")
	private List<HsHrEmpReportto> hsHrEmpReporttos;

	public OhrmEmpReportingMethod() {
	}

	public int getReportingMethodId() {
		return this.reportingMethodId;
	}

	public void setReportingMethodId(int reportingMethodId) {
		this.reportingMethodId = reportingMethodId;
	}

	public String getReportingMethodName() {
		return this.reportingMethodName;
	}

	public void setReportingMethodName(String reportingMethodName) {
		this.reportingMethodName = reportingMethodName;
	}

	public List<HsHrEmpReportto> getHsHrEmpReporttos() {
		return this.hsHrEmpReporttos;
	}

	public void setHsHrEmpReporttos(List<HsHrEmpReportto> hsHrEmpReporttos) {
		this.hsHrEmpReporttos = hsHrEmpReporttos;
	}

	public HsHrEmpReportto addHsHrEmpReportto(HsHrEmpReportto hsHrEmpReportto) {
		getHsHrEmpReporttos().add(hsHrEmpReportto);
		hsHrEmpReportto.setOhrmEmpReportingMethod(this);

		return hsHrEmpReportto;
	}

	public HsHrEmpReportto removeHsHrEmpReportto(HsHrEmpReportto hsHrEmpReportto) {
		getHsHrEmpReporttos().remove(hsHrEmpReportto);
		hsHrEmpReportto.setOhrmEmpReportingMethod(null);

		return hsHrEmpReportto;
	}

}