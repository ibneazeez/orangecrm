package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ohrm_oauth_access_token database table.
 * 
 */
@Entity
@Table(name="ohrm_oauth_access_token")
@NamedQuery(name="OhrmOauthAccessToken.findAll", query="SELECT o FROM OhrmOauthAccessToken o")
public class OhrmOauthAccessToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="access_token")
	private String accessToken;

	@Column(name="client_id")
	private String clientId;

	private Timestamp expires;

	private String scope;

	@Column(name="user_id")
	private String userId;

	public OhrmOauthAccessToken() {
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Timestamp getExpires() {
		return this.expires;
	}

	public void setExpires(Timestamp expires) {
		this.expires = expires;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}