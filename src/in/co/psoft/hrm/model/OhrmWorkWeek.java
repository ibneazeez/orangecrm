package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_work_week database table.
 * 
 */
@Entity
@Table(name="ohrm_work_week")
@NamedQuery(name="OhrmWorkWeek.findAll", query="SELECT o FROM OhrmWorkWeek o")
public class OhrmWorkWeek implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private byte fri;

	private byte mon;

	private byte sat;

	private byte sun;

	private byte thu;

	private byte tue;

	private byte wed;

	//bi-directional many-to-one association to OhrmOperationalCountry
	@ManyToOne
	@JoinColumn(name="operational_country_id")
	private OhrmOperationalCountry ohrmOperationalCountry;

	public OhrmWorkWeek() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getFri() {
		return this.fri;
	}

	public void setFri(byte fri) {
		this.fri = fri;
	}

	public byte getMon() {
		return this.mon;
	}

	public void setMon(byte mon) {
		this.mon = mon;
	}

	public byte getSat() {
		return this.sat;
	}

	public void setSat(byte sat) {
		this.sat = sat;
	}

	public byte getSun() {
		return this.sun;
	}

	public void setSun(byte sun) {
		this.sun = sun;
	}

	public byte getThu() {
		return this.thu;
	}

	public void setThu(byte thu) {
		this.thu = thu;
	}

	public byte getTue() {
		return this.tue;
	}

	public void setTue(byte tue) {
		this.tue = tue;
	}

	public byte getWed() {
		return this.wed;
	}

	public void setWed(byte wed) {
		this.wed = wed;
	}

	public OhrmOperationalCountry getOhrmOperationalCountry() {
		return this.ohrmOperationalCountry;
	}

	public void setOhrmOperationalCountry(OhrmOperationalCountry ohrmOperationalCountry) {
		this.ohrmOperationalCountry = ohrmOperationalCountry;
	}

}