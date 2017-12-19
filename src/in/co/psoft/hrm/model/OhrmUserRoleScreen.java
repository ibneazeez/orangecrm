package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_user_role_screen database table.
 * 
 */
@Entity
@Table(name="ohrm_user_role_screen")
@NamedQuery(name="OhrmUserRoleScreen.findAll", query="SELECT o FROM OhrmUserRoleScreen o")
public class OhrmUserRoleScreen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="can_create")
	private byte canCreate;

	@Column(name="can_delete")
	private byte canDelete;

	@Column(name="can_read")
	private byte canRead;

	@Column(name="can_update")
	private byte canUpdate;

	//bi-directional many-to-one association to OhrmUserRole
	@ManyToOne
	@JoinColumn(name="user_role_id")
	private OhrmUserRole ohrmUserRole;

	//bi-directional many-to-one association to OhrmScreen
	@ManyToOne
	@JoinColumn(name="screen_id")
	private OhrmScreen ohrmScreen;

	public OhrmUserRoleScreen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getCanCreate() {
		return this.canCreate;
	}

	public void setCanCreate(byte canCreate) {
		this.canCreate = canCreate;
	}

	public byte getCanDelete() {
		return this.canDelete;
	}

	public void setCanDelete(byte canDelete) {
		this.canDelete = canDelete;
	}

	public byte getCanRead() {
		return this.canRead;
	}

	public void setCanRead(byte canRead) {
		this.canRead = canRead;
	}

	public byte getCanUpdate() {
		return this.canUpdate;
	}

	public void setCanUpdate(byte canUpdate) {
		this.canUpdate = canUpdate;
	}

	public OhrmUserRole getOhrmUserRole() {
		return this.ohrmUserRole;
	}

	public void setOhrmUserRole(OhrmUserRole ohrmUserRole) {
		this.ohrmUserRole = ohrmUserRole;
	}

	public OhrmScreen getOhrmScreen() {
		return this.ohrmScreen;
	}

	public void setOhrmScreen(OhrmScreen ohrmScreen) {
		this.ohrmScreen = ohrmScreen;
	}

}