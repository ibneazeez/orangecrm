package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_email_processor database table.
 * 
 */
@Entity
@Table(name="ohrm_email_processor")
@NamedQuery(name="OhrmEmailProcessor.findAll", query="SELECT o FROM OhrmEmailProcessor o")
public class OhrmEmailProcessor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="class_name")
	private String className;

	//bi-directional many-to-one association to OhrmEmail
	@ManyToOne
	@JoinColumn(name="email_id")
	private OhrmEmail ohrmEmail;

	public OhrmEmailProcessor() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public OhrmEmail getOhrmEmail() {
		return this.ohrmEmail;
	}

	public void setOhrmEmail(OhrmEmail ohrmEmail) {
		this.ohrmEmail = ohrmEmail;
	}

}