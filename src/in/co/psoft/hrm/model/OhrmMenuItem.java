package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_menu_item database table.
 * 
 */
@Entity
@Table(name="ohrm_menu_item")
@NamedQuery(name="OhrmMenuItem.findAll", query="SELECT o FROM OhrmMenuItem o")
public class OhrmMenuItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private byte level;

	@Column(name="menu_title")
	private String menuTitle;

	@Column(name="order_hint")
	private int orderHint;

	@Column(name="parent_id")
	private int parentId;

	private byte status;

	@Column(name="url_extras")
	private String urlExtras;

	//bi-directional many-to-one association to OhrmScreen
	@ManyToOne
	@JoinColumn(name="screen_id")
	private OhrmScreen ohrmScreen;

	public OhrmMenuItem() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getLevel() {
		return this.level;
	}

	public void setLevel(byte level) {
		this.level = level;
	}

	public String getMenuTitle() {
		return this.menuTitle;
	}

	public void setMenuTitle(String menuTitle) {
		this.menuTitle = menuTitle;
	}

	public int getOrderHint() {
		return this.orderHint;
	}

	public void setOrderHint(int orderHint) {
		this.orderHint = orderHint;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getUrlExtras() {
		return this.urlExtras;
	}

	public void setUrlExtras(String urlExtras) {
		this.urlExtras = urlExtras;
	}

	public OhrmScreen getOhrmScreen() {
		return this.ohrmScreen;
	}

	public void setOhrmScreen(OhrmScreen ohrmScreen) {
		this.ohrmScreen = ohrmScreen;
	}

}