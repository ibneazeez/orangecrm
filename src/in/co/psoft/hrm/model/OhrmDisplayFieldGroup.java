package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_display_field_group database table.
 * 
 */
@Entity
@Table(name="ohrm_display_field_group")
@NamedQuery(name="OhrmDisplayFieldGroup.findAll", query="SELECT o FROM OhrmDisplayFieldGroup o")
public class OhrmDisplayFieldGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="is_list")
	private byte isList;

	private String name;

	//bi-directional many-to-one association to OhrmCompositeDisplayField
	@OneToMany(mappedBy="ohrmDisplayFieldGroup")
	private List<OhrmCompositeDisplayField> ohrmCompositeDisplayFields;

	//bi-directional many-to-one association to OhrmDisplayField
	@OneToMany(mappedBy="ohrmDisplayFieldGroup")
	private List<OhrmDisplayField> ohrmDisplayFields;

	//bi-directional many-to-one association to OhrmReportGroup
	@ManyToOne
	@JoinColumn(name="report_group_id")
	private OhrmReportGroup ohrmReportGroup;

	//bi-directional many-to-one association to OhrmSelectedDisplayFieldGroup
	@OneToMany(mappedBy="ohrmDisplayFieldGroup")
	private List<OhrmSelectedDisplayFieldGroup> ohrmSelectedDisplayFieldGroups;

	//bi-directional many-to-one association to OhrmSummaryDisplayField
	@OneToMany(mappedBy="ohrmDisplayFieldGroup")
	private List<OhrmSummaryDisplayField> ohrmSummaryDisplayFields;

	public OhrmDisplayFieldGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsList() {
		return this.isList;
	}

	public void setIsList(byte isList) {
		this.isList = isList;
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
		ohrmCompositeDisplayField.setOhrmDisplayFieldGroup(this);

		return ohrmCompositeDisplayField;
	}

	public OhrmCompositeDisplayField removeOhrmCompositeDisplayField(OhrmCompositeDisplayField ohrmCompositeDisplayField) {
		getOhrmCompositeDisplayFields().remove(ohrmCompositeDisplayField);
		ohrmCompositeDisplayField.setOhrmDisplayFieldGroup(null);

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
		ohrmDisplayField.setOhrmDisplayFieldGroup(this);

		return ohrmDisplayField;
	}

	public OhrmDisplayField removeOhrmDisplayField(OhrmDisplayField ohrmDisplayField) {
		getOhrmDisplayFields().remove(ohrmDisplayField);
		ohrmDisplayField.setOhrmDisplayFieldGroup(null);

		return ohrmDisplayField;
	}

	public OhrmReportGroup getOhrmReportGroup() {
		return this.ohrmReportGroup;
	}

	public void setOhrmReportGroup(OhrmReportGroup ohrmReportGroup) {
		this.ohrmReportGroup = ohrmReportGroup;
	}

	public List<OhrmSelectedDisplayFieldGroup> getOhrmSelectedDisplayFieldGroups() {
		return this.ohrmSelectedDisplayFieldGroups;
	}

	public void setOhrmSelectedDisplayFieldGroups(List<OhrmSelectedDisplayFieldGroup> ohrmSelectedDisplayFieldGroups) {
		this.ohrmSelectedDisplayFieldGroups = ohrmSelectedDisplayFieldGroups;
	}

	public OhrmSelectedDisplayFieldGroup addOhrmSelectedDisplayFieldGroup(OhrmSelectedDisplayFieldGroup ohrmSelectedDisplayFieldGroup) {
		getOhrmSelectedDisplayFieldGroups().add(ohrmSelectedDisplayFieldGroup);
		ohrmSelectedDisplayFieldGroup.setOhrmDisplayFieldGroup(this);

		return ohrmSelectedDisplayFieldGroup;
	}

	public OhrmSelectedDisplayFieldGroup removeOhrmSelectedDisplayFieldGroup(OhrmSelectedDisplayFieldGroup ohrmSelectedDisplayFieldGroup) {
		getOhrmSelectedDisplayFieldGroups().remove(ohrmSelectedDisplayFieldGroup);
		ohrmSelectedDisplayFieldGroup.setOhrmDisplayFieldGroup(null);

		return ohrmSelectedDisplayFieldGroup;
	}

	public List<OhrmSummaryDisplayField> getOhrmSummaryDisplayFields() {
		return this.ohrmSummaryDisplayFields;
	}

	public void setOhrmSummaryDisplayFields(List<OhrmSummaryDisplayField> ohrmSummaryDisplayFields) {
		this.ohrmSummaryDisplayFields = ohrmSummaryDisplayFields;
	}

	public OhrmSummaryDisplayField addOhrmSummaryDisplayField(OhrmSummaryDisplayField ohrmSummaryDisplayField) {
		getOhrmSummaryDisplayFields().add(ohrmSummaryDisplayField);
		ohrmSummaryDisplayField.setOhrmDisplayFieldGroup(this);

		return ohrmSummaryDisplayField;
	}

	public OhrmSummaryDisplayField removeOhrmSummaryDisplayField(OhrmSummaryDisplayField ohrmSummaryDisplayField) {
		getOhrmSummaryDisplayFields().remove(ohrmSummaryDisplayField);
		ohrmSummaryDisplayField.setOhrmDisplayFieldGroup(null);

		return ohrmSummaryDisplayField;
	}

}