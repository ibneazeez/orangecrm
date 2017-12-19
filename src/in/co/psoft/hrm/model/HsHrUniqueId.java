package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_unique_id database table.
 * 
 */
@Entity
@Table(name="hs_hr_unique_id")
@NamedQuery(name="HsHrUniqueId.findAll", query="SELECT h FROM HsHrUniqueId h")
public class HsHrUniqueId implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="field_name")
	private String fieldName;

	@Column(name="last_id")
	private int lastId;

	@Column(name="table_name")
	private String tableName;

	public HsHrUniqueId() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getLastId() {
		return this.lastId;
	}

	public void setLastId(int lastId) {
		this.lastId = lastId;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}