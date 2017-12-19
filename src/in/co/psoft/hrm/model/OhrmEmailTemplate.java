package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_email_template database table.
 * 
 */
@Entity
@Table(name="ohrm_email_template")
@NamedQuery(name="OhrmEmailTemplate.findAll", query="SELECT o FROM OhrmEmailTemplate o")
public class OhrmEmailTemplate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String body;

	private String locale;

	@Column(name="performer_role")
	private String performerRole;

	@Column(name="recipient_role")
	private String recipientRole;

	private String subject;

	//bi-directional many-to-one association to OhrmEmail
	@ManyToOne
	@JoinColumn(name="email_id")
	private OhrmEmail ohrmEmail;

	public OhrmEmailTemplate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getPerformerRole() {
		return this.performerRole;
	}

	public void setPerformerRole(String performerRole) {
		this.performerRole = performerRole;
	}

	public String getRecipientRole() {
		return this.recipientRole;
	}

	public void setRecipientRole(String recipientRole) {
		this.recipientRole = recipientRole;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public OhrmEmail getOhrmEmail() {
		return this.ohrmEmail;
	}

	public void setOhrmEmail(OhrmEmail ohrmEmail) {
		this.ohrmEmail = ohrmEmail;
	}

}