package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ohrm_oauth_authorization_code database table.
 * 
 */
@Entity
@Table(name="ohrm_oauth_authorization_code")
@NamedQuery(name="OhrmOauthAuthorizationCode.findAll", query="SELECT o FROM OhrmOauthAuthorizationCode o")
public class OhrmOauthAuthorizationCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="authorization_code")
	private String authorizationCode;

	@Column(name="client_id")
	private String clientId;

	private Timestamp expires;

	@Column(name="redirect_uri")
	private String redirectUri;

	private String scope;

	@Column(name="user_id")
	private String userId;

	public OhrmOauthAuthorizationCode() {
	}

	public String getAuthorizationCode() {
		return this.authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
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

	public String getRedirectUri() {
		return this.redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
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