package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_module database table.
 * 
 */
@Entity
@Table(name="hs_hr_module")
@NamedQuery(name="HsHrModule.findAll", query="SELECT h FROM HsHrModule h")
public class HsHrModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mod_id")
	private String modId;

	@Lob
	private String description;

	private String name;

	private String owner;

	@Column(name="owner_email")
	private String ownerEmail;

	private String version;

	public HsHrModule() {
	}

	public String getModId() {
		return this.modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
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

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerEmail() {
		return this.ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}