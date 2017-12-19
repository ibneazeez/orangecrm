package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_plugin database table.
 * 
 */
@Entity
@Table(name="ohrm_plugin")
@NamedQuery(name="OhrmPlugin.findAll", query="SELECT o FROM OhrmPlugin o")
public class OhrmPlugin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String version;

	public OhrmPlugin() {
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}