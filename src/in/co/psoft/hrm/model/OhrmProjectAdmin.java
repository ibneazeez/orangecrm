package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_project_admin database table.
 * 
 */
@Entity
@Table(name="ohrm_project_admin")
@NamedQuery(name="OhrmProjectAdmin.findAll", query="SELECT o FROM OhrmProjectAdmin o")
public class OhrmProjectAdmin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmProjectAdminPK id;

	public OhrmProjectAdmin() {
	}

	public OhrmProjectAdminPK getId() {
		return this.id;
	}

	public void setId(OhrmProjectAdminPK id) {
		this.id = id;
	}

}