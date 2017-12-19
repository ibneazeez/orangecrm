package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_selected_group_field database table.
 * 
 */
@Entity
@Table(name="ohrm_selected_group_field")
@NamedQuery(name="OhrmSelectedGroupField.findAll", query="SELECT o FROM OhrmSelectedGroupField o")
public class OhrmSelectedGroupField implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmSelectedGroupFieldPK id;

	//bi-directional many-to-one association to OhrmReport
	@ManyToOne
	@JoinColumn(name="report_id")
	private OhrmReport ohrmReport;

	//bi-directional many-to-one association to OhrmGroupField
	@ManyToOne
	@JoinColumn(name="group_field_id")
	private OhrmGroupField ohrmGroupField;

	//bi-directional many-to-one association to OhrmSummaryDisplayField
	@ManyToOne
	@JoinColumn(name="summary_display_field_id")
	private OhrmSummaryDisplayField ohrmSummaryDisplayField;

	public OhrmSelectedGroupField() {
	}

	public OhrmSelectedGroupFieldPK getId() {
		return this.id;
	}

	public void setId(OhrmSelectedGroupFieldPK id) {
		this.id = id;
	}

	public OhrmReport getOhrmReport() {
		return this.ohrmReport;
	}

	public void setOhrmReport(OhrmReport ohrmReport) {
		this.ohrmReport = ohrmReport;
	}

	public OhrmGroupField getOhrmGroupField() {
		return this.ohrmGroupField;
	}

	public void setOhrmGroupField(OhrmGroupField ohrmGroupField) {
		this.ohrmGroupField = ohrmGroupField;
	}

	public OhrmSummaryDisplayField getOhrmSummaryDisplayField() {
		return this.ohrmSummaryDisplayField;
	}

	public void setOhrmSummaryDisplayField(OhrmSummaryDisplayField ohrmSummaryDisplayField) {
		this.ohrmSummaryDisplayField = ohrmSummaryDisplayField;
	}

}