package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_selected_composite_display_field database table.
 * 
 */
@Entity
@Table(name="ohrm_selected_composite_display_field")
@NamedQuery(name="OhrmSelectedCompositeDisplayField.findAll", query="SELECT o FROM OhrmSelectedCompositeDisplayField o")
public class OhrmSelectedCompositeDisplayField implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmSelectedCompositeDisplayFieldPK id;

	//bi-directional many-to-one association to OhrmReport
	@ManyToOne
	@JoinColumn(name="report_id")
	private OhrmReport ohrmReport;

	//bi-directional many-to-one association to OhrmCompositeDisplayField
	@ManyToOne
	@JoinColumn(name="composite_display_field_id")
	private OhrmCompositeDisplayField ohrmCompositeDisplayField;

	public OhrmSelectedCompositeDisplayField() {
	}

	public OhrmSelectedCompositeDisplayFieldPK getId() {
		return this.id;
	}

	public void setId(OhrmSelectedCompositeDisplayFieldPK id) {
		this.id = id;
	}

	public OhrmReport getOhrmReport() {
		return this.ohrmReport;
	}

	public void setOhrmReport(OhrmReport ohrmReport) {
		this.ohrmReport = ohrmReport;
	}

	public OhrmCompositeDisplayField getOhrmCompositeDisplayField() {
		return this.ohrmCompositeDisplayField;
	}

	public void setOhrmCompositeDisplayField(OhrmCompositeDisplayField ohrmCompositeDisplayField) {
		this.ohrmCompositeDisplayField = ohrmCompositeDisplayField;
	}

}