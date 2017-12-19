package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_emp_termination database table.
 * 
 */
@Entity
@Table(name="ohrm_emp_termination")
@NamedQuery(name="OhrmEmpTermination.findAll", query="SELECT o FROM OhrmEmpTermination o")
public class OhrmEmpTermination implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String note;

	@Temporal(TemporalType.DATE)
	@Column(name="termination_date")
	private Date terminationDate;

	//bi-directional many-to-one association to HsHrEmployee
	@OneToMany(mappedBy="ohrmEmpTermination")
	private List<HsHrEmployee> hsHrEmployees;

	//bi-directional many-to-one association to OhrmEmpTerminationReason
	@ManyToOne
	@JoinColumn(name="reason_id")
	private OhrmEmpTerminationReason ohrmEmpTerminationReason;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public OhrmEmpTermination() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getTerminationDate() {
		return this.terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public List<HsHrEmployee> getHsHrEmployees() {
		return this.hsHrEmployees;
	}

	public void setHsHrEmployees(List<HsHrEmployee> hsHrEmployees) {
		this.hsHrEmployees = hsHrEmployees;
	}

	public HsHrEmployee addHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().add(hsHrEmployee);
		hsHrEmployee.setOhrmEmpTermination(this);

		return hsHrEmployee;
	}

	public HsHrEmployee removeHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().remove(hsHrEmployee);
		hsHrEmployee.setOhrmEmpTermination(null);

		return hsHrEmployee;
	}

	public OhrmEmpTerminationReason getOhrmEmpTerminationReason() {
		return this.ohrmEmpTerminationReason;
	}

	public void setOhrmEmpTerminationReason(OhrmEmpTerminationReason ohrmEmpTerminationReason) {
		this.ohrmEmpTerminationReason = ohrmEmpTerminationReason;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}