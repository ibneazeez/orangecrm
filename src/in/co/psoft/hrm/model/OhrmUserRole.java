package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_user_role database table.
 * 
 */
@Entity
@Table(name="ohrm_user_role")
@NamedQuery(name="OhrmUserRole.findAll", query="SELECT o FROM OhrmUserRole o")
public class OhrmUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="display_name")
	private String displayName;

	@Column(name="is_assignable")
	private byte isAssignable;

	@Column(name="is_predefined")
	private byte isPredefined;

	private String name;

	//bi-directional many-to-one association to OhrmHomePage
	@OneToMany(mappedBy="ohrmUserRole")
	private List<OhrmHomePage> ohrmHomePages;

	//bi-directional many-to-one association to OhrmModuleDefaultPage
	@OneToMany(mappedBy="ohrmUserRole")
	private List<OhrmModuleDefaultPage> ohrmModuleDefaultPages;

	//bi-directional many-to-one association to OhrmUser
	@OneToMany(mappedBy="ohrmUserRole")
	private List<OhrmUser> ohrmUsers;

	//bi-directional many-to-one association to OhrmUserRoleDataGroup
	@OneToMany(mappedBy="ohrmUserRole")
	private List<OhrmUserRoleDataGroup> ohrmUserRoleDataGroups;

	//bi-directional many-to-one association to OhrmUserRoleScreen
	@OneToMany(mappedBy="ohrmUserRole")
	private List<OhrmUserRoleScreen> ohrmUserRoleScreens;

	public OhrmUserRole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public byte getIsAssignable() {
		return this.isAssignable;
	}

	public void setIsAssignable(byte isAssignable) {
		this.isAssignable = isAssignable;
	}

	public byte getIsPredefined() {
		return this.isPredefined;
	}

	public void setIsPredefined(byte isPredefined) {
		this.isPredefined = isPredefined;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmHomePage> getOhrmHomePages() {
		return this.ohrmHomePages;
	}

	public void setOhrmHomePages(List<OhrmHomePage> ohrmHomePages) {
		this.ohrmHomePages = ohrmHomePages;
	}

	public OhrmHomePage addOhrmHomePage(OhrmHomePage ohrmHomePage) {
		getOhrmHomePages().add(ohrmHomePage);
		ohrmHomePage.setOhrmUserRole(this);

		return ohrmHomePage;
	}

	public OhrmHomePage removeOhrmHomePage(OhrmHomePage ohrmHomePage) {
		getOhrmHomePages().remove(ohrmHomePage);
		ohrmHomePage.setOhrmUserRole(null);

		return ohrmHomePage;
	}

	public List<OhrmModuleDefaultPage> getOhrmModuleDefaultPages() {
		return this.ohrmModuleDefaultPages;
	}

	public void setOhrmModuleDefaultPages(List<OhrmModuleDefaultPage> ohrmModuleDefaultPages) {
		this.ohrmModuleDefaultPages = ohrmModuleDefaultPages;
	}

	public OhrmModuleDefaultPage addOhrmModuleDefaultPage(OhrmModuleDefaultPage ohrmModuleDefaultPage) {
		getOhrmModuleDefaultPages().add(ohrmModuleDefaultPage);
		ohrmModuleDefaultPage.setOhrmUserRole(this);

		return ohrmModuleDefaultPage;
	}

	public OhrmModuleDefaultPage removeOhrmModuleDefaultPage(OhrmModuleDefaultPage ohrmModuleDefaultPage) {
		getOhrmModuleDefaultPages().remove(ohrmModuleDefaultPage);
		ohrmModuleDefaultPage.setOhrmUserRole(null);

		return ohrmModuleDefaultPage;
	}

	public List<OhrmUser> getOhrmUsers() {
		return this.ohrmUsers;
	}

	public void setOhrmUsers(List<OhrmUser> ohrmUsers) {
		this.ohrmUsers = ohrmUsers;
	}

	public OhrmUser addOhrmUser(OhrmUser ohrmUser) {
		getOhrmUsers().add(ohrmUser);
		ohrmUser.setOhrmUserRole(this);

		return ohrmUser;
	}

	public OhrmUser removeOhrmUser(OhrmUser ohrmUser) {
		getOhrmUsers().remove(ohrmUser);
		ohrmUser.setOhrmUserRole(null);

		return ohrmUser;
	}

	public List<OhrmUserRoleDataGroup> getOhrmUserRoleDataGroups() {
		return this.ohrmUserRoleDataGroups;
	}

	public void setOhrmUserRoleDataGroups(List<OhrmUserRoleDataGroup> ohrmUserRoleDataGroups) {
		this.ohrmUserRoleDataGroups = ohrmUserRoleDataGroups;
	}

	public OhrmUserRoleDataGroup addOhrmUserRoleDataGroup(OhrmUserRoleDataGroup ohrmUserRoleDataGroup) {
		getOhrmUserRoleDataGroups().add(ohrmUserRoleDataGroup);
		ohrmUserRoleDataGroup.setOhrmUserRole(this);

		return ohrmUserRoleDataGroup;
	}

	public OhrmUserRoleDataGroup removeOhrmUserRoleDataGroup(OhrmUserRoleDataGroup ohrmUserRoleDataGroup) {
		getOhrmUserRoleDataGroups().remove(ohrmUserRoleDataGroup);
		ohrmUserRoleDataGroup.setOhrmUserRole(null);

		return ohrmUserRoleDataGroup;
	}

	public List<OhrmUserRoleScreen> getOhrmUserRoleScreens() {
		return this.ohrmUserRoleScreens;
	}

	public void setOhrmUserRoleScreens(List<OhrmUserRoleScreen> ohrmUserRoleScreens) {
		this.ohrmUserRoleScreens = ohrmUserRoleScreens;
	}

	public OhrmUserRoleScreen addOhrmUserRoleScreen(OhrmUserRoleScreen ohrmUserRoleScreen) {
		getOhrmUserRoleScreens().add(ohrmUserRoleScreen);
		ohrmUserRoleScreen.setOhrmUserRole(this);

		return ohrmUserRoleScreen;
	}

	public OhrmUserRoleScreen removeOhrmUserRoleScreen(OhrmUserRoleScreen ohrmUserRoleScreen) {
		getOhrmUserRoleScreens().remove(ohrmUserRoleScreen);
		ohrmUserRoleScreen.setOhrmUserRole(null);

		return ohrmUserRoleScreen;
	}

}