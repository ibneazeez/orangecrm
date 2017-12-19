package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_operational_country database table.
 * 
 */
@Entity
@Table(name="ohrm_operational_country")
@NamedQuery(name="OhrmOperationalCountry.findAll", query="SELECT o FROM OhrmOperationalCountry o")
public class OhrmOperationalCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	//bi-directional many-to-one association to OhrmHoliday
	@OneToMany(mappedBy="ohrmOperationalCountry")
	private List<OhrmHoliday> ohrmHolidays;

	//bi-directional many-to-one association to OhrmLeaveType
	@OneToMany(mappedBy="ohrmOperationalCountry")
	private List<OhrmLeaveType> ohrmLeaveTypes;

	//bi-directional many-to-one association to HsHrCountry
	@ManyToOne
	@JoinColumn(name="country_code")
	private HsHrCountry hsHrCountry;

	//bi-directional many-to-one association to OhrmWorkWeek
	@OneToMany(mappedBy="ohrmOperationalCountry")
	private List<OhrmWorkWeek> ohrmWorkWeeks;

	public OhrmOperationalCountry() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<OhrmHoliday> getOhrmHolidays() {
		return this.ohrmHolidays;
	}

	public void setOhrmHolidays(List<OhrmHoliday> ohrmHolidays) {
		this.ohrmHolidays = ohrmHolidays;
	}

	public OhrmHoliday addOhrmHoliday(OhrmHoliday ohrmHoliday) {
		getOhrmHolidays().add(ohrmHoliday);
		ohrmHoliday.setOhrmOperationalCountry(this);

		return ohrmHoliday;
	}

	public OhrmHoliday removeOhrmHoliday(OhrmHoliday ohrmHoliday) {
		getOhrmHolidays().remove(ohrmHoliday);
		ohrmHoliday.setOhrmOperationalCountry(null);

		return ohrmHoliday;
	}

	public List<OhrmLeaveType> getOhrmLeaveTypes() {
		return this.ohrmLeaveTypes;
	}

	public void setOhrmLeaveTypes(List<OhrmLeaveType> ohrmLeaveTypes) {
		this.ohrmLeaveTypes = ohrmLeaveTypes;
	}

	public OhrmLeaveType addOhrmLeaveType(OhrmLeaveType ohrmLeaveType) {
		getOhrmLeaveTypes().add(ohrmLeaveType);
		ohrmLeaveType.setOhrmOperationalCountry(this);

		return ohrmLeaveType;
	}

	public OhrmLeaveType removeOhrmLeaveType(OhrmLeaveType ohrmLeaveType) {
		getOhrmLeaveTypes().remove(ohrmLeaveType);
		ohrmLeaveType.setOhrmOperationalCountry(null);

		return ohrmLeaveType;
	}

	public HsHrCountry getHsHrCountry() {
		return this.hsHrCountry;
	}

	public void setHsHrCountry(HsHrCountry hsHrCountry) {
		this.hsHrCountry = hsHrCountry;
	}

	public List<OhrmWorkWeek> getOhrmWorkWeeks() {
		return this.ohrmWorkWeeks;
	}

	public void setOhrmWorkWeeks(List<OhrmWorkWeek> ohrmWorkWeeks) {
		this.ohrmWorkWeeks = ohrmWorkWeeks;
	}

	public OhrmWorkWeek addOhrmWorkWeek(OhrmWorkWeek ohrmWorkWeek) {
		getOhrmWorkWeeks().add(ohrmWorkWeek);
		ohrmWorkWeek.setOhrmOperationalCountry(this);

		return ohrmWorkWeek;
	}

	public OhrmWorkWeek removeOhrmWorkWeek(OhrmWorkWeek ohrmWorkWeek) {
		getOhrmWorkWeeks().remove(ohrmWorkWeek);
		ohrmWorkWeek.setOhrmOperationalCountry(null);

		return ohrmWorkWeek;
	}

}