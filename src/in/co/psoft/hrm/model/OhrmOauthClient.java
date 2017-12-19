package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_oauth_client database table.
 * 
 */
@Entity
@Table(name="ohrm_oauth_client")
@NamedQuery(name="OhrmOauthClient.findAll", query="SELECT o FROM OhrmOauthClient o")
public class OhrmOauthClient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="client_id")
	private String clientId;

	@Column(name="client_secret")
	private String clientSecret;

	@Column(name="redirect_uri")
	private String redirectUri;

	public OhrmOauthClient() {
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return this.clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getRedirectUri() {
		return this.redirectUri;
	}

	public void setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
	}

}