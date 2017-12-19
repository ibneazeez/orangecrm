package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_screen database table.
 * 
 */
@Entity
@Table(name="ohrm_screen")
@NamedQuery(name="OhrmScreen.findAll", query="SELECT o FROM OhrmScreen o")
public class OhrmScreen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="action_url")
	private String actionUrl;

	private String name;

	//bi-directional many-to-one association to OhrmDataGroupScreen
	@OneToMany(mappedBy="ohrmScreen")
	private List<OhrmDataGroupScreen> ohrmDataGroupScreens;

	//bi-directional many-to-one association to OhrmMenuItem
	@OneToMany(mappedBy="ohrmScreen")
	private List<OhrmMenuItem> ohrmMenuItems;

	//bi-directional many-to-one association to OhrmModule
	@ManyToOne
	@JoinColumn(name="module_id")
	private OhrmModule ohrmModule;

	//bi-directional many-to-one association to OhrmUserRoleScreen
	@OneToMany(mappedBy="ohrmScreen")
	private List<OhrmUserRoleScreen> ohrmUserRoleScreens;

	public OhrmScreen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActionUrl() {
		return this.actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
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
		ohrmDataGroupScreen.setOhrmScreen(this);

		return ohrmDataGroupScreen;
	}

	public OhrmDataGroupScreen removeOhrmDataGroupScreen(OhrmDataGroupScreen ohrmDataGroupScreen) {
		getOhrmDataGroupScreens().remove(ohrmDataGroupScreen);
		ohrmDataGroupScreen.setOhrmScreen(null);

		return ohrmDataGroupScreen;
	}

	public List<OhrmMenuItem> getOhrmMenuItems() {
		return this.ohrmMenuItems;
	}

	public void setOhrmMenuItems(List<OhrmMenuItem> ohrmMenuItems) {
		this.ohrmMenuItems = ohrmMenuItems;
	}

	public OhrmMenuItem addOhrmMenuItem(OhrmMenuItem ohrmMenuItem) {
		getOhrmMenuItems().add(ohrmMenuItem);
		ohrmMenuItem.setOhrmScreen(this);

		return ohrmMenuItem;
	}

	public OhrmMenuItem removeOhrmMenuItem(OhrmMenuItem ohrmMenuItem) {
		getOhrmMenuItems().remove(ohrmMenuItem);
		ohrmMenuItem.setOhrmScreen(null);

		return ohrmMenuItem;
	}

	public OhrmModule getOhrmModule() {
		return this.ohrmModule;
	}

	public void setOhrmModule(OhrmModule ohrmModule) {
		this.ohrmModule = ohrmModule;
	}

	public List<OhrmUserRoleScreen> getOhrmUserRoleScreens() {
		return this.ohrmUserRoleScreens;
	}

	public void setOhrmUserRoleScreens(List<OhrmUserRoleScreen> ohrmUserRoleScreens) {
		this.ohrmUserRoleScreens = ohrmUserRoleScreens;
	}

	public OhrmUserRoleScreen addOhrmUserRoleScreen(OhrmUserRoleScreen ohrmUserRoleScreen) {
		getOhrmUserRoleScreens().add(ohrmUserRoleScreen);
		ohrmUserRoleScreen.setOhrmScreen(this);

		return ohrmUserRoleScreen;
	}

	public OhrmUserRoleScreen removeOhrmUserRoleScreen(OhrmUserRoleScreen ohrmUserRoleScreen) {
		getOhrmUserRoleScreens().remove(ohrmUserRoleScreen);
		ohrmUserRoleScreen.setOhrmScreen(null);

		return ohrmUserRoleScreen;
	}

}