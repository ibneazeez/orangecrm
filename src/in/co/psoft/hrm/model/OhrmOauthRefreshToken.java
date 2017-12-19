package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ohrm_oauth_refresh_token database table.
 * 
 */
@Entity
@Table(name="ohrm_oauth_refresh_token")
@NamedQuery(name="OhrmOauthRefreshToken.findAll", query="SELECT o FROM OhrmOauthRefreshToken o")
public class OhrmOauthRefreshToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="refresh_token")
	private String refreshToken;

	@Column(name="client_id")
	private String clientId;

	private Timestamp expires;

	private String scope;

	@Column(name="user_id")
	private String userId;

	public OhrmOauthRefreshToken() {
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
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