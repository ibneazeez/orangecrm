package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the ohrm_selected_filter_field database table.
 * 
 */
@Entity
@Table(name="ohrm_selected_filter_field")
@NamedQuery(name="OhrmSelectedFilterField.findAll", query="SELECT o FROM OhrmSelectedFilterField o")
public class OhrmSelectedFilterField implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmSelectedFilterFieldPK id;

	@Column(name="filter_field_order")
	private BigInteger filterFieldOrder;

	private String type;

	private String value1;

	private String value2;

	@Column(name="where_condition")
	private String whereCondition;

	//bi-directional many-to-one association to OhrmReport
	@ManyToOne
	@JoinColumn(name="report_id")
	private OhrmReport ohrmReport;

	//bi-directional many-to-one association to OhrmFilterField
	@ManyToOne
	@JoinColumn(name="filter_field_id")
	private OhrmFilterField ohrmFilterField;

	public OhrmSelectedFilterField() {
	}

	public OhrmSelectedFilterFieldPK getId() {
		return this.id;
	}

	public void setId(OhrmSelectedFilterFieldPK id) {
		this.id = id;
	}

	public BigInteger getFilterFieldOrder() {
		return this.filterFieldOrder;
	}

	public void setFilterFieldOrder(BigInteger filterFieldOrder) {
		this.filterFieldOrder = filterFieldOrder;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue1() {
		return this.value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return this.value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

	public OhrmReport getOhrmReport() {
		return this.ohrmReport;
	}

	public void setOhrmReport(OhrmReport ohrmReport) {
		this.ohrmReport = ohrmReport;
	}

	public OhrmFilterField getOhrmFilterField() {
		return this.ohrmFilterField;
	}

	public void setOhrmFilterField(OhrmFilterField ohrmFilterField) {
		this.ohrmFilterField = ohrmFilterField;
	}

}