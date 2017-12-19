package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_advanced_report database table.
 * 
 */
@Entity
@Table(name="ohrm_advanced_report")
@NamedQuery(name="OhrmAdvancedReport.findAll", query="SELECT o FROM OhrmAdvancedReport o")
public class OhrmAdvancedReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String definition;

	private String name;

	public OhrmAdvancedReport() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}