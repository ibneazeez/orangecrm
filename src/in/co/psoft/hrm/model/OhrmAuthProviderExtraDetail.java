package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_auth_provider_extra_details database table.
 * 
 */
@Entity
@Table(name="ohrm_auth_provider_extra_details")
@NamedQuery(name="OhrmAuthProviderExtraDetail.findAll", query="SELECT o FROM OhrmAuthProviderExtraDetail o")
public class OhrmAuthProviderExtraDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	@Column(name="client_id")
	private String clientId;

	@Lob
	@Column(name="client_secret")
	private String clientSecret;

	@Lob
	@Column(name="developer_key")
	private String developerKey;

	@Column(name="provider_type")
	private int providerType;

	//bi-directional many-to-one association to OhrmOpenidProvider
	@ManyToOne
	@JoinColumn(name="provider_id")
	private OhrmOpenidProvider ohrmOpenidProvider;

	public OhrmAuthProviderExtraDetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDeveloperKey() {
		return this.developerKey;
	}

	public void setDeveloperKey(String developerKey) {
		this.developerKey = developerKey;
	}

	public int getProviderType() {
		return this.providerType;
	}

	public void setProviderType(int providerType) {
		this.providerType = providerType;
	}

	public OhrmOpenidProvider getOhrmOpenidProvider() {
		return this.ohrmOpenidProvider;
	}

	public void setOhrmOpenidProvider(OhrmOpenidProvider ohrmOpenidProvider) {
		this.ohrmOpenidProvider = ohrmOpenidProvider;
	}

}