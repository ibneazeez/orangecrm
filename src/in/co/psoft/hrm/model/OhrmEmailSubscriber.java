package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_email_subscriber database table.
 * 
 */
@Entity
@Table(name="ohrm_email_subscriber")
@NamedQuery(name="OhrmEmailSubscriber.findAll", query="SELECT o FROM OhrmEmailSubscriber o")
public class OhrmEmailSubscriber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String email;

	private String name;

	//bi-directional many-to-one association to OhrmEmailNotification
	@ManyToOne
	@JoinColumn(name="notification_id")
	private OhrmEmailNotification ohrmEmailNotification;

	public OhrmEmailSubscriber() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OhrmEmailNotification getOhrmEmailNotification() {
		return this.ohrmEmailNotification;
	}

	public void setOhrmEmailNotification(OhrmEmailNotification ohrmEmailNotification) {
		this.ohrmEmailNotification = ohrmEmailNotification;
	}

}