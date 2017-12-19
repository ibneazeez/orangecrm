package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ohrm_beacon_notification database table.
 * 
 */
@Entity
@Table(name="ohrm_beacon_notification")
@NamedQuery(name="OhrmBeaconNotification.findAll", query="SELECT o FROM OhrmBeaconNotification o")
public class OhrmBeaconNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String definition;

	@Column(name="expiry_date")
	private Timestamp expiryDate;

	private String name;

	public OhrmBeaconNotification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public Timestamp getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Timestamp expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}