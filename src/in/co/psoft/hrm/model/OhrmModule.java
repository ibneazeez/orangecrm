package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_module database table.
 * 
 */
@Entity
@Table(name="ohrm_module")
@NamedQuery(name="OhrmModule.findAll", query="SELECT o FROM OhrmModule o")
public class OhrmModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private byte status;

	//bi-directional many-to-one association to OhrmModuleDefaultPage
	@OneToMany(mappedBy="ohrmModule")
	private List<OhrmModuleDefaultPage> ohrmModuleDefaultPages;

	//bi-directional many-to-one association to OhrmScreen
	@OneToMany(mappedBy="ohrmModule")
	private List<OhrmScreen> ohrmScreens;

	public OhrmModule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<OhrmModuleDefaultPage> getOhrmModuleDefaultPages() {
		return this.ohrmModuleDefaultPages;
	}

	public void setOhrmModuleDefaultPages(List<OhrmModuleDefaultPage> ohrmModuleDefaultPages) {
		this.ohrmModuleDefaultPages = ohrmModuleDefaultPages;
	}

	public OhrmModuleDefaultPage addOhrmModuleDefaultPage(OhrmModuleDefaultPage ohrmModuleDefaultPage) {
		getOhrmModuleDefaultPages().add(ohrmModuleDefaultPage);
		ohrmModuleDefaultPage.setOhrmModule(this);

		return ohrmModuleDefaultPage;
	}

	public OhrmModuleDefaultPage removeOhrmModuleDefaultPage(OhrmModuleDefaultPage ohrmModuleDefaultPage) {
		getOhrmModuleDefaultPages().remove(ohrmModuleDefaultPage);
		ohrmModuleDefaultPage.setOhrmModule(null);

		return ohrmModuleDefaultPage;
	}

	public List<OhrmScreen> getOhrmScreens() {
		return this.ohrmScreens;
	}

	public void setOhrmScreens(List<OhrmScreen> ohrmScreens) {
		this.ohrmScreens = ohrmScreens;
	}

	public OhrmScreen addOhrmScreen(OhrmScreen ohrmScreen) {
		getOhrmScreens().add(ohrmScreen);
		ohrmScreen.setOhrmModule(this);

		return ohrmScreen;
	}

	public OhrmScreen removeOhrmScreen(OhrmScreen ohrmScreen) {
		getOhrmScreens().remove(ohrmScreen);
		ohrmScreen.setOhrmModule(null);

		return ohrmScreen;
	}

}