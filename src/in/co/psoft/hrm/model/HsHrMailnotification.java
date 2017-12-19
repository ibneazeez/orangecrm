package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the hs_hr_mailnotifications database table.
 * 
 */
@Entity
@Table(name="hs_hr_mailnotifications")
@NamedQuery(name="HsHrMailnotification.findAll", query="SELECT h FROM HsHrMailnotification h")
public class HsHrMailnotification implements Serializable {
	private static final long serialVersionUID = 1L;

	private String email;

	@Column(name="notification_type_id")
	private int notificationTypeId;

	private int status;

	//bi-directional many-to-one association to OhrmUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private OhrmUser ohrmUser;

	public HsHrMailnotification() {
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNotificationTypeId() {
		return this.notificationTypeId;
	}

	public void setNotificationTypeId(int notificationTypeId) {
		this.notificationTypeId = notificationTypeId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public OhrmUser getOhrmUser() {
		return this.ohrmUser;
	}

	public void setOhrmUser(OhrmUser ohrmUser) {
		this.ohrmUser = ohrmUser;
	}

}