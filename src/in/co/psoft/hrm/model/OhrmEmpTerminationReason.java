package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_emp_termination_reason database table.
 * 
 */
@Entity
@Table(name="ohrm_emp_termination_reason")
@NamedQuery(name="OhrmEmpTerminationReason.findAll", query="SELECT o FROM OhrmEmpTerminationReason o")
public class OhrmEmpTerminationReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to OhrmEmpTermination
	@OneToMany(mappedBy="ohrmEmpTerminationReason")
	private List<OhrmEmpTermination> ohrmEmpTerminations;

	public OhrmEmpTerminationReason() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmEmpTermination> getOhrmEmpTerminations() {
		return this.ohrmEmpTerminations;
	}

	public void setOhrmEmpTerminations(List<OhrmEmpTermination> ohrmEmpTerminations) {
		this.ohrmEmpTerminations = ohrmEmpTerminations;
	}

	public OhrmEmpTermination addOhrmEmpTermination(OhrmEmpTermination ohrmEmpTermination) {
		getOhrmEmpTerminations().add(ohrmEmpTermination);
		ohrmEmpTermination.setOhrmEmpTerminationReason(this);

		return ohrmEmpTermination;
	}

	public OhrmEmpTermination removeOhrmEmpTermination(OhrmEmpTermination ohrmEmpTermination) {
		getOhrmEmpTerminations().remove(ohrmEmpTermination);
		ohrmEmpTermination.setOhrmEmpTerminationReason(null);

		return ohrmEmpTermination;
	}

}