package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_datapoint_type database table.
 * 
 */
@Entity
@Table(name="ohrm_datapoint_type")
@NamedQuery(name="OhrmDatapointType.findAll", query="SELECT o FROM OhrmDatapointType o")
public class OhrmDatapointType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="action_class")
	private String actionClass;

	private String name;

	//bi-directional many-to-one association to OhrmDatapoint
	@OneToMany(mappedBy="ohrmDatapointType")
	private List<OhrmDatapoint> ohrmDatapoints;

	public OhrmDatapointType() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActionClass() {
		return this.actionClass;
	}

	public void setActionClass(String actionClass) {
		this.actionClass = actionClass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmDatapoint> getOhrmDatapoints() {
		return this.ohrmDatapoints;
	}

	public void setOhrmDatapoints(List<OhrmDatapoint> ohrmDatapoints) {
		this.ohrmDatapoints = ohrmDatapoints;
	}

	public OhrmDatapoint addOhrmDatapoint(OhrmDatapoint ohrmDatapoint) {
		getOhrmDatapoints().add(ohrmDatapoint);
		ohrmDatapoint.setOhrmDatapointType(this);

		return ohrmDatapoint;
	}

	public OhrmDatapoint removeOhrmDatapoint(OhrmDatapoint ohrmDatapoint) {
		getOhrmDatapoints().remove(ohrmDatapoint);
		ohrmDatapoint.setOhrmDatapointType(null);

		return ohrmDatapoint;
	}

}