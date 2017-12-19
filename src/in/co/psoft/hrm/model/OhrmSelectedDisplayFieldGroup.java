package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_selected_display_field_group database table.
 * 
 */
@Entity
@Table(name="ohrm_selected_display_field_group")
@NamedQuery(name="OhrmSelectedDisplayFieldGroup.findAll", query="SELECT o FROM OhrmSelectedDisplayFieldGroup o")
public class OhrmSelectedDisplayFieldGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to OhrmReport
	@ManyToOne
	@JoinColumn(name="report_id")
	private OhrmReport ohrmReport;

	//bi-directional many-to-one association to OhrmDisplayFieldGroup
	@ManyToOne
	@JoinColumn(name="display_field_group_id")
	private OhrmDisplayFieldGroup ohrmDisplayFieldGroup;

	public OhrmSelectedDisplayFieldGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OhrmReport getOhrmReport() {
		return this.ohrmReport;
	}

	public void setOhrmReport(OhrmReport ohrmReport) {
		this.ohrmReport = ohrmReport;
	}

	public OhrmDisplayFieldGroup getOhrmDisplayFieldGroup() {
		return this.ohrmDisplayFieldGroup;
	}

	public void setOhrmDisplayFieldGroup(OhrmDisplayFieldGroup ohrmDisplayFieldGroup) {
		this.ohrmDisplayFieldGroup = ohrmDisplayFieldGroup;
	}

}