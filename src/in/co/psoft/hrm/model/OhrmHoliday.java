package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_holiday database table.
 * 
 */
@Entity
@Table(name="ohrm_holiday")
@NamedQuery(name="OhrmHoliday.findAll", query="SELECT o FROM OhrmHoliday o")
public class OhrmHoliday implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Lob
	private String description;

	private int length;

	private byte recurring;

	//bi-directional many-to-one association to OhrmOperationalCountry
	@ManyToOne
	@JoinColumn(name="operational_country_id")
	private OhrmOperationalCountry ohrmOperationalCountry;

	public OhrmHoliday() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public byte getRecurring() {
		return this.recurring;
	}

	public void setRecurring(byte recurring) {
		this.recurring = recurring;
	}

	public OhrmOperationalCountry getOhrmOperationalCountry() {
		return this.ohrmOperationalCountry;
	}

	public void setOhrmOperationalCountry(OhrmOperationalCountry ohrmOperationalCountry) {
		this.ohrmOperationalCountry = ohrmOperationalCountry;
	}

}