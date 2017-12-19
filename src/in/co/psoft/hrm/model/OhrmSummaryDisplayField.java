package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_summary_display_field database table.
 * 
 */
@Entity
@Table(name="ohrm_summary_display_field")
@NamedQuery(name="OhrmSummaryDisplayField.findAll", query="SELECT o FROM OhrmSummaryDisplayField o")
public class OhrmSummaryDisplayField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="summary_display_field_id")
	private String summaryDisplayFieldId;

	@Column(name="default_value")
	private String defaultValue;

	@Column(name="element_property")
	private String elementProperty;

	@Column(name="element_type")
	private String elementType;

	@Column(name="field_alias")
	private String fieldAlias;

	private String function;

	@Column(name="is_exportable")
	private String isExportable;

	@Column(name="is_sortable")
	private String isSortable;

	@Column(name="is_value_list")
	private byte isValueList;

	private String label;

	@Column(name="sort_field")
	private String sortField;

	@Column(name="sort_order")
	private String sortOrder;

	@Column(name="text_alignment_style")
	private String textAlignmentStyle;

	private String width;

	//bi-directional many-to-one association to OhrmSelectedGroupField
	@OneToMany(mappedBy="ohrmSummaryDisplayField")
	private List<OhrmSelectedGroupField> ohrmSelectedGroupFields;

	//bi-directional many-to-one association to OhrmDisplayFieldGroup
	@ManyToOne
	@JoinColumn(name="display_field_group_id")
	private OhrmDisplayFieldGroup ohrmDisplayFieldGroup;

	public OhrmSummaryDisplayField() {
	}

	public String getSummaryDisplayFieldId() {
		return this.summaryDisplayFieldId;
	}

	public void setSummaryDisplayFieldId(String summaryDisplayFieldId) {
		this.summaryDisplayFieldId = summaryDisplayFieldId;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getElementProperty() {
		return this.elementProperty;
	}

	public void setElementProperty(String elementProperty) {
		this.elementProperty = elementProperty;
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getFieldAlias() {
		return this.fieldAlias;
	}

	public void setFieldAlias(String fieldAlias) {
		this.fieldAlias = fieldAlias;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getIsExportable() {
		return this.isExportable;
	}

	public void setIsExportable(String isExportable) {
		this.isExportable = isExportable;
	}

	public String getIsSortable() {
		return this.isSortable;
	}

	public void setIsSortable(String isSortable) {
		this.isSortable = isSortable;
	}

	public byte getIsValueList() {
		return this.isValueList;
	}

	public void setIsValueList(byte isValueList) {
		this.isValueList = isValueList;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getTextAlignmentStyle() {
		return this.textAlignmentStyle;
	}

	public void setTextAlignmentStyle(String textAlignmentStyle) {
		this.textAlignmentStyle = textAlignmentStyle;
	}

	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public List<OhrmSelectedGroupField> getOhrmSelectedGroupFields() {
		return this.ohrmSelectedGroupFields;
	}

	public void setOhrmSelectedGroupFields(List<OhrmSelectedGroupField> ohrmSelectedGroupFields) {
		this.ohrmSelectedGroupFields = ohrmSelectedGroupFields;
	}

	public OhrmSelectedGroupField addOhrmSelectedGroupField(OhrmSelectedGroupField ohrmSelectedGroupField) {
		getOhrmSelectedGroupFields().add(ohrmSelectedGroupField);
		ohrmSelectedGroupField.setOhrmSummaryDisplayField(this);

		return ohrmSelectedGroupField;
	}

	public OhrmSelectedGroupField removeOhrmSelectedGroupField(OhrmSelectedGroupField ohrmSelectedGroupField) {
		getOhrmSelectedGroupFields().remove(ohrmSelectedGroupField);
		ohrmSelectedGroupField.setOhrmSummaryDisplayField(null);

		return ohrmSelectedGroupField;
	}

	public OhrmDisplayFieldGroup getOhrmDisplayFieldGroup() {
		return this.ohrmDisplayFieldGroup;
	}

	public void setOhrmDisplayFieldGroup(OhrmDisplayFieldGroup ohrmDisplayFieldGroup) {
		this.ohrmDisplayFieldGroup = ohrmDisplayFieldGroup;
	}

}