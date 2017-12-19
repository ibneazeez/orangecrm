package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_openid_user_identity database table.
 * 
 */
@Entity
@Table(name="ohrm_openid_user_identity")
@NamedQuery(name="OhrmOpenidUserIdentity.findAll", query="SELECT o FROM OhrmOpenidUserIdentity o")
public class OhrmOpenidUserIdentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="user_identity")
	private String userIdentity;

	//bi-directional many-to-one association to OhrmUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private OhrmUser ohrmUser;

	//bi-directional many-to-one association to OhrmOpenidProvider
	@ManyToOne
	@JoinColumn(name="provider_id")
	private OhrmOpenidProvider ohrmOpenidProvider;

	public OhrmOpenidUserIdentity() {
	}

	public String getUserIdentity() {
		return this.userIdentity;
	}

	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	public OhrmUser getOhrmUser() {
		return this.ohrmUser;
	}

	public void setOhrmUser(OhrmUser ohrmUser) {
		this.ohrmUser = ohrmUser;
	}

	public OhrmOpenidProvider getOhrmOpenidProvider() {
		return this.ohrmOpenidProvider;
	}

	public void setOhrmOpenidProvider(OhrmOpenidProvider ohrmOpenidProvider) {
		this.ohrmOpenidProvider = ohrmOpenidProvider;
	}

}