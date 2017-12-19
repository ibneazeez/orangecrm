package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_group_field database table.
 * 
 */
@Entity
@Table(name="ohrm_group_field")
@NamedQuery(name="OhrmGroupField.findAll", query="SELECT o FROM OhrmGroupField o")
public class OhrmGroupField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="group_field_id")
	private String groupFieldId;

	@Lob
	@Column(name="group_by_clause")
	private String groupByClause;

	@Column(name="group_field_widget")
	private String groupFieldWidget;

	private String name;

	//bi-directional many-to-one association to OhrmAvailableGroupField
	@OneToMany(mappedBy="ohrmGroupField")
	private List<OhrmAvailableGroupField> ohrmAvailableGroupFields;

	//bi-directional many-to-one association to OhrmSelectedGroupField
	@OneToMany(mappedBy="ohrmGroupField")
	private List<OhrmSelectedGroupField> ohrmSelectedGroupFields;

	public OhrmGroupField() {
	}

	public String getGroupFieldId() {
		return this.groupFieldId;
	}

	public void setGroupFieldId(String groupFieldId) {
		this.groupFieldId = groupFieldId;
	}

	public String getGroupByClause() {
		return this.groupByClause;
	}

	public void setGroupByClause(String groupByClause) {
		this.groupByClause = groupByClause;
	}

	public String getGroupFieldWidget() {
		return this.groupFieldWidget;
	}

	public void setGroupFieldWidget(String groupFieldWidget) {
		this.groupFieldWidget = groupFieldWidget;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmAvailableGroupField> getOhrmAvailableGroupFields() {
		return this.ohrmAvailableGroupFields;
	}

	public void setOhrmAvailableGroupFields(List<OhrmAvailableGroupField> ohrmAvailableGroupFields) {
		this.ohrmAvailableGroupFields = ohrmAvailableGroupFields;
	}

	public OhrmAvailableGroupField addOhrmAvailableGroupField(OhrmAvailableGroupField ohrmAvailableGroupField) {
		getOhrmAvailableGroupFields().add(ohrmAvailableGroupField);
		ohrmAvailableGroupField.setOhrmGroupField(this);

		return ohrmAvailableGroupField;
	}

	public OhrmAvailableGroupField removeOhrmAvailableGroupField(OhrmAvailableGroupField ohrmAvailableGroupField) {
		getOhrmAvailableGroupFields().remove(ohrmAvailableGroupField);
		ohrmAvailableGroupField.setOhrmGroupField(null);

		return ohrmAvailableGroupField;
	}

	public List<OhrmSelectedGroupField> getOhrmSelectedGroupFields() {
		return this.ohrmSelectedGroupFields;
	}

	public void setOhrmSelectedGroupFields(List<OhrmSelectedGroupField> ohrmSelectedGroupFields) {
		this.ohrmSelectedGroupFields = ohrmSelectedGroupFields;
	}

	public OhrmSelectedGroupField addOhrmSelectedGroupField(OhrmSelectedGroupField ohrmSelectedGroupField) {
		getOhrmSelectedGroupFields().add(ohrmSelectedGroupField);
		ohrmSelectedGroupField.setOhrmGroupField(this);

		return ohrmSelectedGroupField;
	}

	public OhrmSelectedGroupField removeOhrmSelectedGroupField(OhrmSelectedGroupField ohrmSelectedGroupField) {
		getOhrmSelectedGroupFields().remove(ohrmSelectedGroupField);
		ohrmSelectedGroupField.setOhrmGroupField(null);

		return ohrmSelectedGroupField;
	}

}