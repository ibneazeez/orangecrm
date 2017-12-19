package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_available_group_field database table.
 * 
 */
@Entity
@Table(name="ohrm_available_group_field")
@NamedQuery(name="OhrmAvailableGroupField.findAll", query="SELECT o FROM OhrmAvailableGroupField o")
public class OhrmAvailableGroupField implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmAvailableGroupFieldPK id;

	//bi-directional many-to-one association to OhrmGroupField
	@ManyToOne
	@JoinColumn(name="group_field_id")
	private OhrmGroupField ohrmGroupField;

	public OhrmAvailableGroupField() {
	}

	public OhrmAvailableGroupFieldPK getId() {
		return this.id;
	}

	public void setId(OhrmAvailableGroupFieldPK id) {
		this.id = id;
	}

	public OhrmGroupField getOhrmGroupField() {
		return this.ohrmGroupField;
	}

	public void setOhrmGroupField(OhrmGroupField ohrmGroupField) {
		this.ohrmGroupField = ohrmGroupField;
	}

}