package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_user_selection_rule database table.
 * 
 */
@Entity
@Table(name="ohrm_user_selection_rule")
@NamedQuery(name="OhrmUserSelectionRule.findAll", query="SELECT o FROM OhrmUserSelectionRule o")
public class OhrmUserSelectionRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	@Column(name="implementation_class")
	private String implementationClass;

	private String name;

	@Lob
	@Column(name="rule_xml_data")
	private String ruleXmlData;

	public OhrmUserSelectionRule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImplementationClass() {
		return this.implementationClass;
	}

	public void setImplementationClass(String implementationClass) {
		this.implementationClass = implementationClass;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRuleXmlData() {
		return this.ruleXmlData;
	}

	public void setRuleXmlData(String ruleXmlData) {
		this.ruleXmlData = ruleXmlData;
	}

}