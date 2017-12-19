package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_data_group_screen database table.
 * 
 */
@Entity
@Table(name="ohrm_data_group_screen")
@NamedQuery(name="OhrmDataGroupScreen.findAll", query="SELECT o FROM OhrmDataGroupScreen o")
public class OhrmDataGroupScreen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int permission;

	//bi-directional many-to-one association to OhrmDataGroup
	@ManyToOne
	@JoinColumn(name="data_group_id")
	private OhrmDataGroup ohrmDataGroup;

	//bi-directional many-to-one association to OhrmScreen
	@ManyToOne
	@JoinColumn(name="screen_id")
	private OhrmScreen ohrmScreen;

	public OhrmDataGroupScreen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPermission() {
		return this.permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

	public OhrmDataGroup getOhrmDataGroup() {
		return this.ohrmDataGroup;
	}

	public void setOhrmDataGroup(OhrmDataGroup ohrmDataGroup) {
		this.ohrmDataGroup = ohrmDataGroup;
	}

	public OhrmScreen getOhrmScreen() {
		return this.ohrmScreen;
	}

	public void setOhrmScreen(OhrmScreen ohrmScreen) {
		this.ohrmScreen = ohrmScreen;
	}

}