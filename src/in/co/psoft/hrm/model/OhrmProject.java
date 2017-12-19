package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_project database table.
 * 
 */
@Entity
@Table(name="ohrm_project")
@NamedQuery(name="OhrmProject.findAll", query="SELECT o FROM OhrmProject o")
public class OhrmProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmProjectPK id;

	private String description;

	@Column(name="is_deleted")
	private byte isDeleted;

	private String name;

	public OhrmProject() {
	}

	public OhrmProjectPK getId() {
		return this.id;
	}

	public void setId(OhrmProjectPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}