package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_data_group database table.
 * 
 */
@Entity
@Table(name="ohrm_data_group")
@NamedQuery(name="OhrmDataGroup.findAll", query="SELECT o FROM OhrmDataGroup o")
public class OhrmDataGroup implements Serializable {
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

	private String description;

	private String name;

	//bi-directional many-to-one association to OhrmDataGroupScreen
	@OneToMany(mappedBy="ohrmDataGroup")
	private List<OhrmDataGroupScreen> ohrmDataGroupScreens;

	//bi-directional many-to-one association to OhrmUserRoleDataGroup
	@OneToMany(mappedBy="ohrmDataGroup")
	private List<OhrmUserRoleDataGroup> ohrmUserRoleDataGroups;

	public OhrmDataGroup() {
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmDataGroupScreen> getOhrmDataGroupScreens() {
		return this.ohrmDataGroupScreens;
	}

	public void setOhrmDataGroupScreens(List<OhrmDataGroupScreen> ohrmDataGroupScreens) {
		this.ohrmDataGroupScreens = ohrmDataGroupScreens;
	}

	public OhrmDataGroupScreen addOhrmDataGroupScreen(OhrmDataGroupScreen ohrmDataGroupScreen) {
		getOhrmDataGroupScreens().add(ohrmDataGroupScreen);
		ohrmDataGroupScreen.setOhrmDataGroup(this);

		return ohrmDataGroupScreen;
	}

	public OhrmDataGroupScreen removeOhrmDataGroupScreen(OhrmDataGroupScreen ohrmDataGroupScreen) {
		getOhrmDataGroupScreens().remove(ohrmDataGroupScreen);
		ohrmDataGroupScreen.setOhrmDataGroup(null);

		return ohrmDataGroupScreen;
	}

	public List<OhrmUserRoleDataGroup> getOhrmUserRoleDataGroups() {
		return this.ohrmUserRoleDataGroups;
	}

	public void setOhrmUserRoleDataGroups(List<OhrmUserRoleDataGroup> ohrmUserRoleDataGroups) {
		this.ohrmUserRoleDataGroups = ohrmUserRoleDataGroups;
	}

	public OhrmUserRoleDataGroup addOhrmUserRoleDataGroup(OhrmUserRoleDataGroup ohrmUserRoleDataGroup) {
		getOhrmUserRoleDataGroups().add(ohrmUserRoleDataGroup);
		ohrmUserRoleDataGroup.setOhrmDataGroup(this);

		return ohrmUserRoleDataGroup;
	}

	public OhrmUserRoleDataGroup removeOhrmUserRoleDataGroup(OhrmUserRoleDataGroup ohrmUserRoleDataGroup) {
		getOhrmUserRoleDataGroups().remove(ohrmUserRoleDataGroup);
		ohrmUserRoleDataGroup.setOhrmDataGroup(null);

		return ohrmUserRoleDataGroup;
	}

}