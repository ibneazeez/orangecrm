package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_report database table.
 * 
 */
@Entity
@Table(name="ohrm_report")
@NamedQuery(name="OhrmReport.findAll", query="SELECT o FROM OhrmReport o")
public class OhrmReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="report_id")
	private String reportId;

	private String name;

	private String type;

	@Column(name="use_filter_field")
	private byte useFilterField;

	//bi-directional many-to-one association to OhrmReportGroup
	@ManyToOne
	@JoinColumn(name="report_group_id")
	private OhrmReportGroup ohrmReportGroup;

	//bi-directional many-to-one association to OhrmSelectedCompositeDisplayField
	@OneToMany(mappedBy="ohrmReport")
	private List<OhrmSelectedCompositeDisplayField> ohrmSelectedCompositeDisplayFields;

	//bi-directional many-to-one association to OhrmSelectedDisplayField
	@OneToMany(mappedBy="ohrmReport")
	private List<OhrmSelectedDisplayField> ohrmSelectedDisplayFields;

	//bi-directional many-to-one association to OhrmSelectedDisplayFieldGroup
	@OneToMany(mappedBy="ohrmReport")
	private List<OhrmSelectedDisplayFieldGroup> ohrmSelectedDisplayFieldGroups;

	//bi-directional many-to-one association to OhrmSelectedFilterField
	@OneToMany(mappedBy="ohrmReport")
	private List<OhrmSelectedFilterField> ohrmSelectedFilterFields;

	//bi-directional many-to-one association to OhrmSelectedGroupField
	@OneToMany(mappedBy="ohrmReport")
	private List<OhrmSelectedGroupField> ohrmSelectedGroupFields;

	public OhrmReport() {
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte getUseFilterField() {
		return this.useFilterField;
	}

	public void setUseFilterField(byte useFilterField) {
		this.useFilterField = useFilterField;
	}

	public OhrmReportGroup getOhrmReportGroup() {
		return this.ohrmReportGroup;
	}

	public void setOhrmReportGroup(OhrmReportGroup ohrmReportGroup) {
		this.ohrmReportGroup = ohrmReportGroup;
	}

	public List<OhrmSelectedCompositeDisplayField> getOhrmSelectedCompositeDisplayFields() {
		return this.ohrmSelectedCompositeDisplayFields;
	}

	public void setOhrmSelectedCompositeDisplayFields(List<OhrmSelectedCompositeDisplayField> ohrmSelectedCompositeDisplayFields) {
		this.ohrmSelectedCompositeDisplayFields = ohrmSelectedCompositeDisplayFields;
	}

	public OhrmSelectedCompositeDisplayField addOhrmSelectedCompositeDisplayField(OhrmSelectedCompositeDisplayField ohrmSelectedCompositeDisplayField) {
		getOhrmSelectedCompositeDisplayFields().add(ohrmSelectedCompositeDisplayField);
		ohrmSelectedCompositeDisplayField.setOhrmReport(this);

		return ohrmSelectedCompositeDisplayField;
	}

	public OhrmSelectedCompositeDisplayField removeOhrmSelectedCompositeDisplayField(OhrmSelectedCompositeDisplayField ohrmSelectedCompositeDisplayField) {
		getOhrmSelectedCompositeDisplayFields().remove(ohrmSelectedCompositeDisplayField);
		ohrmSelectedCompositeDisplayField.setOhrmReport(null);

		return ohrmSelectedCompositeDisplayField;
	}

	public List<OhrmSelectedDisplayField> getOhrmSelectedDisplayFields() {
		return this.ohrmSelectedDisplayFields;
	}

	public void setOhrmSelectedDisplayFields(List<OhrmSelectedDisplayField> ohrmSelectedDisplayFields) {
		this.ohrmSelectedDisplayFields = ohrmSelectedDisplayFields;
	}

	public OhrmSelectedDisplayField addOhrmSelectedDisplayField(OhrmSelectedDisplayField ohrmSelectedDisplayField) {
		getOhrmSelectedDisplayFields().add(ohrmSelectedDisplayField);
		ohrmSelectedDisplayField.setOhrmReport(this);

		return ohrmSelectedDisplayField;
	}

	public OhrmSelectedDisplayField removeOhrmSelectedDisplayField(OhrmSelectedDisplayField ohrmSelectedDisplayField) {
		getOhrmSelectedDisplayFields().remove(ohrmSelectedDisplayField);
		ohrmSelectedDisplayField.setOhrmReport(null);

		return ohrmSelectedDisplayField;
	}

	public List<OhrmSelectedDisplayFieldGroup> getOhrmSelectedDisplayFieldGroups() {
		return this.ohrmSelectedDisplayFieldGroups;
	}

	public void setOhrmSelectedDisplayFieldGroups(List<OhrmSelectedDisplayFieldGroup> ohrmSelectedDisplayFieldGroups) {
		this.ohrmSelectedDisplayFieldGroups = ohrmSelectedDisplayFieldGroups;
	}

	public OhrmSelectedDisplayFieldGroup addOhrmSelectedDisplayFieldGroup(OhrmSelectedDisplayFieldGroup ohrmSelectedDisplayFieldGroup) {
		getOhrmSelectedDisplayFieldGroups().add(ohrmSelectedDisplayFieldGroup);
		ohrmSelectedDisplayFieldGroup.setOhrmReport(this);

		return ohrmSelectedDisplayFieldGroup;
	}

	public OhrmSelectedDisplayFieldGroup removeOhrmSelectedDisplayFieldGroup(OhrmSelectedDisplayFieldGroup ohrmSelectedDisplayFieldGroup) {
		getOhrmSelectedDisplayFieldGroups().remove(ohrmSelectedDisplayFieldGroup);
		ohrmSelectedDisplayFieldGroup.setOhrmReport(null);

		return ohrmSelectedDisplayFieldGroup;
	}

	public List<OhrmSelectedFilterField> getOhrmSelectedFilterFields() {
		return this.ohrmSelectedFilterFields;
	}

	public void setOhrmSelectedFilterFields(List<OhrmSelectedFilterField> ohrmSelectedFilterFields) {
		this.ohrmSelectedFilterFields = ohrmSelectedFilterFields;
	}

	public OhrmSelectedFilterField addOhrmSelectedFilterField(OhrmSelectedFilterField ohrmSelectedFilterField) {
		getOhrmSelectedFilterFields().add(ohrmSelectedFilterField);
		ohrmSelectedFilterField.setOhrmReport(this);

		return ohrmSelectedFilterField;
	}

	public OhrmSelectedFilterField removeOhrmSelectedFilterField(OhrmSelectedFilterField ohrmSelectedFilterField) {
		getOhrmSelectedFilterFields().remove(ohrmSelectedFilterField);
		ohrmSelectedFilterField.setOhrmReport(null);

		return ohrmSelectedFilterField;
	}

	public List<OhrmSelectedGroupField> getOhrmSelectedGroupFields() {
		return this.ohrmSelectedGroupFields;
	}

	public void setOhrmSelectedGroupFields(List<OhrmSelectedGroupField> ohrmSelectedGroupFields) {
		this.ohrmSelectedGroupFields = ohrmSelectedGroupFields;
	}

	public OhrmSelectedGroupField addOhrmSelectedGroupField(OhrmSelectedGroupField ohrmSelectedGroupField) {
		getOhrmSelectedGroupFields().add(ohrmSelectedGroupField);
		ohrmSelectedGroupField.setOhrmReport(this);

		return ohrmSelectedGroupField;
	}

	public OhrmSelectedGroupField removeOhrmSelectedGroupField(OhrmSelectedGroupField ohrmSelectedGroupField) {
		getOhrmSelectedGroupFields().remove(ohrmSelectedGroupField);
		ohrmSelectedGroupField.setOhrmReport(null);

		return ohrmSelectedGroupField;
	}

}