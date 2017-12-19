package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_role_user_selection_rule database table.
 * 
 */
@Entity
@Table(name="ohrm_role_user_selection_rule")
@NamedQuery(name="OhrmRoleUserSelectionRule.findAll", query="SELECT o FROM OhrmRoleUserSelectionRule o")
public class OhrmRoleUserSelectionRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmRoleUserSelectionRulePK id;

	@Lob
	@Column(name="configurable_params")
	private String configurableParams;

	public OhrmRoleUserSelectionRule() {
	}

	public OhrmRoleUserSelectionRulePK getId() {
		return this.id;
	}

	public void setId(OhrmRoleUserSelectionRulePK id) {
		this.id = id;
	}

	public String getConfigurableParams() {
		return this.configurableParams;
	}

	public void setConfigurableParams(String configurableParams) {
		this.configurableParams = configurableParams;
	}

}