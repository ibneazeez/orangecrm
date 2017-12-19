package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_report_group database table.
 * 
 */
@Entity
@Table(name="ohrm_report_group")
@NamedQuery(name="OhrmReportGroup.findAll", query="SELECT o FROM OhrmReportGroup o")
public class OhrmReportGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="report_group_id")
	private String reportGroupId;

	@Lob
	@Column(name="core_sql")
	private String coreSql;

	private String name;

	//bi-directional many-to-one association to OhrmCompositeDisplayField
	@OneToMany(mappedBy="ohrmReportGroup")
	private List<OhrmCompositeDisplayField> ohrmCompositeDisplayFields;

	//bi-directional many-to-one association to OhrmDisplayField
	@OneToMany(mappedBy="ohrmReportGroup")
	private List<OhrmDisplayField> ohrmDisplayFields;

	//bi-directional many-to-one association to OhrmDisplayFieldGroup
	@OneToMany(mappedBy="ohrmReportGroup")
	private List<OhrmDisplayFieldGroup> ohrmDisplayFieldGroups;

	//bi-directional many-to-one association to OhrmFilterField
	@OneToMany(mappedBy="ohrmReportGroup")
	private List<OhrmFilterField> ohrmFilterFields;

	//bi-directional many-to-one association to OhrmReport
	@OneToMany(mappedBy="ohrmReportGroup")
	private List<OhrmReport> ohrmReports;

	public OhrmReportGroup() {
	}

	public String getReportGroupId() {
		return this.reportGroupId;
	}

	public void setReportGroupId(String reportGroupId) {
		this.reportGroupId = reportGroupId;
	}

	public String getCoreSql() {
		return this.coreSql;
	}

	public void setCoreSql(String coreSql) {
		this.coreSql = coreSql;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmCompositeDisplayField> getOhrmCompositeDisplayFields() {
		return this.ohrmCompositeDisplayFields;
	}

	public void setOhrmCompositeDisplayFields(List<OhrmCompositeDisplayField> ohrmCompositeDisplayFields) {
		this.ohrmCompositeDisplayFields = ohrmCompositeDisplayFields;
	}

	public OhrmCompositeDisplayField addOhrmCompositeDisplayField(OhrmCompositeDisplayField ohrmCompositeDisplayField) {
		getOhrmCompositeDisplayFields().add(ohrmCompositeDisplayField);
		ohrmCompositeDisplayField.setOhrmReportGroup(this);

		return ohrmCompositeDisplayField;
	}

	public OhrmCompositeDisplayField removeOhrmCompositeDisplayField(OhrmCompositeDisplayField ohrmCompositeDisplayField) {
		getOhrmCompositeDisplayFields().remove(ohrmCompositeDisplayField);
		ohrmCompositeDisplayField.setOhrmReportGroup(null);

		return ohrmCompositeDisplayField;
	}

	public List<OhrmDisplayField> getOhrmDisplayFields() {
		return this.ohrmDisplayFields;
	}

	public void setOhrmDisplayFields(List<OhrmDisplayField> ohrmDisplayFields) {
		this.ohrmDisplayFields = ohrmDisplayFields;
	}

	public OhrmDisplayField addOhrmDisplayField(OhrmDisplayField ohrmDisplayField) {
		getOhrmDisplayFields().add(ohrmDisplayField);
		ohrmDisplayField.setOhrmReportGroup(this);

		return ohrmDisplayField;
	}

	public OhrmDisplayField removeOhrmDisplayField(OhrmDisplayField ohrmDisplayField) {
		getOhrmDisplayFields().remove(ohrmDisplayField);
		ohrmDisplayField.setOhrmReportGroup(null);

		return ohrmDisplayField;
	}

	public List<OhrmDisplayFieldGroup> getOhrmDisplayFieldGroups() {
		return this.ohrmDisplayFieldGroups;
	}

	public void setOhrmDisplayFieldGroups(List<OhrmDisplayFieldGroup> ohrmDisplayFieldGroups) {
		this.ohrmDisplayFieldGroups = ohrmDisplayFieldGroups;
	}

	public OhrmDisplayFieldGroup addOhrmDisplayFieldGroup(OhrmDisplayFieldGroup ohrmDisplayFieldGroup) {
		getOhrmDisplayFieldGroups().add(ohrmDisplayFieldGroup);
		ohrmDisplayFieldGroup.setOhrmReportGroup(this);

		return ohrmDisplayFieldGroup;
	}

	public OhrmDisplayFieldGroup removeOhrmDisplayFieldGroup(OhrmDisplayFieldGroup ohrmDisplayFieldGroup) {
		getOhrmDisplayFieldGroups().remove(ohrmDisplayFieldGroup);
		ohrmDisplayFieldGroup.setOhrmReportGroup(null);

		return ohrmDisplayFieldGroup;
	}

	public List<OhrmFilterField> getOhrmFilterFields() {
		return this.ohrmFilterFields;
	}

	public void setOhrmFilterFields(List<OhrmFilterField> ohrmFilterFields) {
		this.ohrmFilterFields = ohrmFilterFields;
	}

	public OhrmFilterField addOhrmFilterField(OhrmFilterField ohrmFilterField) {
		getOhrmFilterFields().add(ohrmFilterField);
		ohrmFilterField.setOhrmReportGroup(this);

		return ohrmFilterField;
	}

	public OhrmFilterField removeOhrmFilterField(OhrmFilterField ohrmFilterField) {
		getOhrmFilterFields().remove(ohrmFilterField);
		ohrmFilterField.setOhrmReportGroup(null);

		return ohrmFilterField;
	}

	public List<OhrmReport> getOhrmReports() {
		return this.ohrmReports;
	}

	public void setOhrmReports(List<OhrmReport> ohrmReports) {
		this.ohrmReports = ohrmReports;
	}

	public OhrmReport addOhrmReport(OhrmReport ohrmReport) {
		getOhrmReports().add(ohrmReport);
		ohrmReport.setOhrmReportGroup(this);

		return ohrmReport;
	}

	public OhrmReport removeOhrmReport(OhrmReport ohrmReport) {
		getOhrmReports().remove(ohrmReport);
		ohrmReport.setOhrmReportGroup(null);

		return ohrmReport;
	}

}