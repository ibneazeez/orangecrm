package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_selected_display_field database table.
 * 
 */
@Entity
@Table(name="ohrm_selected_display_field")
@NamedQuery(name="OhrmSelectedDisplayField.findAll", query="SELECT o FROM OhrmSelectedDisplayField o")
public class OhrmSelectedDisplayField implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmSelectedDisplayFieldPK id;

	//bi-directional many-to-one association to OhrmReport
	@ManyToOne
	@JoinColumn(name="report_id")
	private OhrmReport ohrmReport;

	//bi-directional many-to-one association to OhrmDisplayField
	@ManyToOne
	@JoinColumn(name="display_field_id")
	private OhrmDisplayField ohrmDisplayField;

	public OhrmSelectedDisplayField() {
	}

	public OhrmSelectedDisplayFieldPK getId() {
		return this.id;
	}

	public void setId(OhrmSelectedDisplayFieldPK id) {
		this.id = id;
	}

	public OhrmReport getOhrmReport() {
		return this.ohrmReport;
	}

	public void setOhrmReport(OhrmReport ohrmReport) {
		this.ohrmReport = ohrmReport;
	}

	public OhrmDisplayField getOhrmDisplayField() {
		return this.ohrmDisplayField;
	}

	public void setOhrmDisplayField(OhrmDisplayField ohrmDisplayField) {
		this.ohrmDisplayField = ohrmDisplayField;
	}

}