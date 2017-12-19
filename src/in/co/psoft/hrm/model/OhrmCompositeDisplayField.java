package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_composite_display_field database table.
 * 
 */
@Entity
@Table(name="ohrm_composite_display_field")
@NamedQuery(name="OhrmCompositeDisplayField.findAll", query="SELECT o FROM OhrmCompositeDisplayField o")
public class OhrmCompositeDisplayField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="composite_display_field_id")
	private String compositeDisplayFieldId;

	@Column(name="default_value")
	private String defaultValue;

	@Column(name="element_property")
	private String elementProperty;

	@Column(name="element_type")
	private String elementType;

	@Column(name="field_alias")
	private String fieldAlias;

	@Column(name="is_encrypted")
	private byte isEncrypted;

	@Column(name="is_exportable")
	private String isExportable;

	@Column(name="is_meta")
	private byte isMeta;

	@Column(name="is_sortable")
	private String isSortable;

	@Column(name="is_value_list")
	private byte isValueList;

	private String label;

	private String name;

	@Column(name="sort_field")
	private String sortField;

	@Column(name="sort_order")
	private String sortOrder;

	@Column(name="text_alignment_style")
	private String textAlignmentStyle;

	private String width;

	//bi-directional many-to-one association to OhrmReportGroup
	@ManyToOne
	@JoinColumn(name="report_group_id")
	private OhrmReportGroup ohrmReportGroup;

	//bi-directional many-to-one association to OhrmDisplayFieldGroup
	@ManyToOne
	@JoinColumn(name="display_field_group_id")
	private OhrmDisplayFieldGroup ohrmDisplayFieldGroup;

	//bi-directional many-to-one association to OhrmSelectedCompositeDisplayField
	@OneToMany(mappedBy="ohrmCompositeDisplayField")
	private List<OhrmSelectedCompositeDisplayField> ohrmSelectedCompositeDisplayFields;

	public OhrmCompositeDisplayField() {
	}

	public String getCompositeDisplayFieldId() {
		return this.compositeDisplayFieldId;
	}

	public void setCompositeDisplayFieldId(String compositeDisplayFieldId) {
		this.compositeDisplayFieldId = compositeDisplayFieldId;
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

	public byte getIsEncrypted() {
		return this.isEncrypted;
	}

	public void setIsEncrypted(byte isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

	public String getIsExportable() {
		return this.isExportable;
	}

	public void setIsExportable(String isExportable) {
		this.isExportable = isExportable;
	}

	public byte getIsMeta() {
		return this.isMeta;
	}

	public void setIsMeta(byte isMeta) {
		this.isMeta = isMeta;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public OhrmReportGroup getOhrmReportGroup() {
		return this.ohrmReportGroup;
	}

	public void setOhrmReportGroup(OhrmReportGroup ohrmReportGroup) {
		this.ohrmReportGroup = ohrmReportGroup;
	}

	public OhrmDisplayFieldGroup getOhrmDisplayFieldGroup() {
		return this.ohrmDisplayFieldGroup;
	}

	public void setOhrmDisplayFieldGroup(OhrmDisplayFieldGroup ohrmDisplayFieldGroup) {
		this.ohrmDisplayFieldGroup = ohrmDisplayFieldGroup;
	}

	public List<OhrmSelectedCompositeDisplayField> getOhrmSelectedCompositeDisplayFields() {
		return this.ohrmSelectedCompositeDisplayFields;
	}

	public void setOhrmSelectedCompositeDisplayFields(List<OhrmSelectedCompositeDisplayField> ohrmSelectedCompositeDisplayFields) {
		this.ohrmSelectedCompositeDisplayFields = ohrmSelectedCompositeDisplayFields;
	}

	public OhrmSelectedCompositeDisplayField addOhrmSelectedCompositeDisplayField(OhrmSelectedCompositeDisplayField ohrmSelectedCompositeDisplayField) {
		getOhrmSelectedCompositeDisplayFields().add(ohrmSelectedCompositeDisplayField);
		ohrmSelectedCompositeDisplayField.setOhrmCompositeDisplayField(this);

		return ohrmSelectedCompositeDisplayField;
	}

	public OhrmSelectedCompositeDisplayField removeOhrmSelectedCompositeDisplayField(OhrmSelectedCompositeDisplayField ohrmSelectedCompositeDisplayField) {
		getOhrmSelectedCompositeDisplayFields().remove(ohrmSelectedCompositeDisplayField);
		ohrmSelectedCompositeDisplayField.setOhrmCompositeDisplayField(null);

		return ohrmSelectedCompositeDisplayField;
	}

}