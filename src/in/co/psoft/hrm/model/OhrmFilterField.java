package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_filter_field database table.
 * 
 */
@Entity
@Table(name="ohrm_filter_field")
@NamedQuery(name="OhrmFilterField.findAll", query="SELECT o FROM OhrmFilterField o")
public class OhrmFilterField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="filter_field_id")
	private String filterFieldId;

	@Column(name="condition_no")
	private int conditionNo;

	@Column(name="filter_field_widget")
	private String filterFieldWidget;

	private String name;

	private String required;

	@Lob
	@Column(name="where_clause_part")
	private String whereClausePart;

	//bi-directional many-to-one association to OhrmReportGroup
	@ManyToOne
	@JoinColumn(name="report_group_id")
	private OhrmReportGroup ohrmReportGroup;

	//bi-directional many-to-one association to OhrmSelectedFilterField
	@OneToMany(mappedBy="ohrmFilterField")
	private List<OhrmSelectedFilterField> ohrmSelectedFilterFields;

	public OhrmFilterField() {
	}

	public String getFilterFieldId() {
		return this.filterFieldId;
	}

	public void setFilterFieldId(String filterFieldId) {
		this.filterFieldId = filterFieldId;
	}

	public int getConditionNo() {
		return this.conditionNo;
	}

	public void setConditionNo(int conditionNo) {
		this.conditionNo = conditionNo;
	}

	public String getFilterFieldWidget() {
		return this.filterFieldWidget;
	}

	public void setFilterFieldWidget(String filterFieldWidget) {
		this.filterFieldWidget = filterFieldWidget;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRequired() {
		return this.required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	public String getWhereClausePart() {
		return this.whereClausePart;
	}

	public void setWhereClausePart(String whereClausePart) {
		this.whereClausePart = whereClausePart;
	}

	public OhrmReportGroup getOhrmReportGroup() {
		return this.ohrmReportGroup;
	}

	public void setOhrmReportGroup(OhrmReportGroup ohrmReportGroup) {
		this.ohrmReportGroup = ohrmReportGroup;
	}

	public List<OhrmSelectedFilterField> getOhrmSelectedFilterFields() {
		return this.ohrmSelectedFilterFields;
	}

	public void setOhrmSelectedFilterFields(List<OhrmSelectedFilterField> ohrmSelectedFilterFields) {
		this.ohrmSelectedFilterFields = ohrmSelectedFilterFields;
	}

	public OhrmSelectedFilterField addOhrmSelectedFilterField(OhrmSelectedFilterField ohrmSelectedFilterField) {
		getOhrmSelectedFilterFields().add(ohrmSelectedFilterField);
		ohrmSelectedFilterField.setOhrmFilterField(this);

		return ohrmSelectedFilterField;
	}

	public OhrmSelectedFilterField removeOhrmSelectedFilterField(OhrmSelectedFilterField ohrmSelectedFilterField) {
		getOhrmSelectedFilterFields().remove(ohrmSelectedFilterField);
		ohrmSelectedFilterField.setOhrmFilterField(null);

		return ohrmSelectedFilterField;
	}

}