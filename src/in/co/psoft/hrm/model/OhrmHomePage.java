package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_home_page database table.
 * 
 */
@Entity
@Table(name="ohrm_home_page")
@NamedQuery(name="OhrmHomePage.findAll", query="SELECT o FROM OhrmHomePage o")
public class OhrmHomePage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String action;

	@Column(name="enable_class")
	private String enableClass;

	private int priority;

	//bi-directional many-to-one association to OhrmUserRole
	@ManyToOne
	@JoinColumn(name="user_role_id")
	private OhrmUserRole ohrmUserRole;

	public OhrmHomePage() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getEnableClass() {
		return this.enableClass;
	}

	public void setEnableClass(String enableClass) {
		this.enableClass = enableClass;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public OhrmUserRole getOhrmUserRole() {
		return this.ohrmUserRole;
	}

	public void setOhrmUserRole(OhrmUserRole ohrmUserRole) {
		this.ohrmUserRole = ohrmUserRole;
	}

}