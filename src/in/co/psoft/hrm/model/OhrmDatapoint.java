package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_datapoint database table.
 * 
 */
@Entity
@Table(name="ohrm_datapoint")
@NamedQuery(name="OhrmDatapoint.findAll", query="SELECT o FROM OhrmDatapoint o")
public class OhrmDatapoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String definition;

	private String name;

	//bi-directional many-to-one association to OhrmDatapointType
	@ManyToOne
	@JoinColumn(name="datapoint_type_id")
	private OhrmDatapointType ohrmDatapointType;

	public OhrmDatapoint() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OhrmDatapointType getOhrmDatapointType() {
		return this.ohrmDatapointType;
	}

	public void setOhrmDatapointType(OhrmDatapointType ohrmDatapointType) {
		this.ohrmDatapointType = ohrmDatapointType;
	}

}