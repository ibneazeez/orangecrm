package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_role_user_selection_rule database table.
 * 
 */
@Embeddable
public class OhrmRoleUserSelectionRulePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="user_role_id")
	private int userRoleId;

	@Column(name="selection_rule_id")
	private int selectionRuleId;

	public OhrmRoleUserSelectionRulePK() {
	}
	public int getUserRoleId() {
		return this.userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public int getSelectionRuleId() {
		return this.selectionRuleId;
	}
	public void setSelectionRuleId(int selectionRuleId) {
		this.selectionRuleId = selectionRuleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmRoleUserSelectionRulePK)) {
			return false;
		}
		OhrmRoleUserSelectionRulePK castOther = (OhrmRoleUserSelectionRulePK)other;
		return 
			(this.userRoleId == castOther.userRoleId)
			&& (this.selectionRuleId == castOther.selectionRuleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userRoleId;
		hash = hash * prime + this.selectionRuleId;
		
		return hash;
	}
}