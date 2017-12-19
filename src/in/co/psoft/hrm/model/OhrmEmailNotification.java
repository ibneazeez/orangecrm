package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_email_notification database table.
 * 
 */
@Entity
@Table(name="ohrm_email_notification")
@NamedQuery(name="OhrmEmailNotification.findAll", query="SELECT o FROM OhrmEmailNotification o")
public class OhrmEmailNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="is_enable")
	private int isEnable;

	private String name;

	//bi-directional many-to-one association to OhrmEmailSubscriber
	@OneToMany(mappedBy="ohrmEmailNotification")
	private List<OhrmEmailSubscriber> ohrmEmailSubscribers;

	public OhrmEmailNotification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(int isEnable) {
		this.isEnable = isEnable;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OhrmEmailSubscriber> getOhrmEmailSubscribers() {
		return this.ohrmEmailSubscribers;
	}

	public void setOhrmEmailSubscribers(List<OhrmEmailSubscriber> ohrmEmailSubscribers) {
		this.ohrmEmailSubscribers = ohrmEmailSubscribers;
	}

	public OhrmEmailSubscriber addOhrmEmailSubscriber(OhrmEmailSubscriber ohrmEmailSubscriber) {
		getOhrmEmailSubscribers().add(ohrmEmailSubscriber);
		ohrmEmailSubscriber.setOhrmEmailNotification(this);

		return ohrmEmailSubscriber;
	}

	public OhrmEmailSubscriber removeOhrmEmailSubscriber(OhrmEmailSubscriber ohrmEmailSubscriber) {
		getOhrmEmailSubscribers().remove(ohrmEmailSubscriber);
		ohrmEmailSubscriber.setOhrmEmailNotification(null);

		return ohrmEmailSubscriber;
	}

}