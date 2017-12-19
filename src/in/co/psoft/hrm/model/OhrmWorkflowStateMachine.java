package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_workflow_state_machine database table.
 * 
 */
@Entity
@Table(name="ohrm_workflow_state_machine")
@NamedQuery(name="OhrmWorkflowStateMachine.findAll", query="SELECT o FROM OhrmWorkflowStateMachine o")
public class OhrmWorkflowStateMachine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String action;

	private int priority;

	@Column(name="resulting_state")
	private String resultingState;

	private String role;

	@Lob
	@Column(name="roles_to_notify")
	private String rolesToNotify;

	private String state;

	private String workflow;

	public OhrmWorkflowStateMachine() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getResultingState() {
		return this.resultingState;
	}

	public void setResultingState(String resultingState) {
		this.resultingState = resultingState;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRolesToNotify() {
		return this.rolesToNotify;
	}

	public void setRolesToNotify(String rolesToNotify) {
		this.rolesToNotify = rolesToNotify;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getWorkflow() {
		return this.workflow;
	}

	public void setWorkflow(String workflow) {
		this.workflow = workflow;
	}

}