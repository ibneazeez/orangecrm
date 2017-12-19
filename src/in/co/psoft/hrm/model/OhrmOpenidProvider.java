package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_openid_provider database table.
 * 
 */
@Entity
@Table(name="ohrm_openid_provider")
@NamedQuery(name="OhrmOpenidProvider.findAll", query="SELECT o FROM OhrmOpenidProvider o")
public class OhrmOpenidProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="provider_name")
	private String providerName;

	@Column(name="provider_url")
	private String providerUrl;

	private byte status;

	//bi-directional many-to-one association to OhrmAuthProviderExtraDetail
	@OneToMany(mappedBy="ohrmOpenidProvider")
	private List<OhrmAuthProviderExtraDetail> ohrmAuthProviderExtraDetails;

	//bi-directional many-to-one association to OhrmOpenidUserIdentity
	@OneToMany(mappedBy="ohrmOpenidProvider")
	private List<OhrmOpenidUserIdentity> ohrmOpenidUserIdentities;

	public OhrmOpenidProvider() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderUrl() {
		return this.providerUrl;
	}

	public void setProviderUrl(String providerUrl) {
		this.providerUrl = providerUrl;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public List<OhrmAuthProviderExtraDetail> getOhrmAuthProviderExtraDetails() {
		return this.ohrmAuthProviderExtraDetails;
	}

	public void setOhrmAuthProviderExtraDetails(List<OhrmAuthProviderExtraDetail> ohrmAuthProviderExtraDetails) {
		this.ohrmAuthProviderExtraDetails = ohrmAuthProviderExtraDetails;
	}

	public OhrmAuthProviderExtraDetail addOhrmAuthProviderExtraDetail(OhrmAuthProviderExtraDetail ohrmAuthProviderExtraDetail) {
		getOhrmAuthProviderExtraDetails().add(ohrmAuthProviderExtraDetail);
		ohrmAuthProviderExtraDetail.setOhrmOpenidProvider(this);

		return ohrmAuthProviderExtraDetail;
	}

	public OhrmAuthProviderExtraDetail removeOhrmAuthProviderExtraDetail(OhrmAuthProviderExtraDetail ohrmAuthProviderExtraDetail) {
		getOhrmAuthProviderExtraDetails().remove(ohrmAuthProviderExtraDetail);
		ohrmAuthProviderExtraDetail.setOhrmOpenidProvider(null);

		return ohrmAuthProviderExtraDetail;
	}

	public List<OhrmOpenidUserIdentity> getOhrmOpenidUserIdentities() {
		return this.ohrmOpenidUserIdentities;
	}

	public void setOhrmOpenidUserIdentities(List<OhrmOpenidUserIdentity> ohrmOpenidUserIdentities) {
		this.ohrmOpenidUserIdentities = ohrmOpenidUserIdentities;
	}

	public OhrmOpenidUserIdentity addOhrmOpenidUserIdentity(OhrmOpenidUserIdentity ohrmOpenidUserIdentity) {
		getOhrmOpenidUserIdentities().add(ohrmOpenidUserIdentity);
		ohrmOpenidUserIdentity.setOhrmOpenidProvider(this);

		return ohrmOpenidUserIdentity;
	}

	public OhrmOpenidUserIdentity removeOhrmOpenidUserIdentity(OhrmOpenidUserIdentity ohrmOpenidUserIdentity) {
		getOhrmOpenidUserIdentities().remove(ohrmOpenidUserIdentity);
		ohrmOpenidUserIdentity.setOhrmOpenidProvider(null);

		return ohrmOpenidUserIdentity;
	}

}