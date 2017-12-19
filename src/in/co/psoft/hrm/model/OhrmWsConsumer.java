package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_ws_consumer database table.
 * 
 */
@Entity
@Table(name="ohrm_ws_consumer")
@NamedQuery(name="OhrmWsConsumer.findAll", query="SELECT o FROM OhrmWsConsumer o")
public class OhrmWsConsumer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="app_id")
	private int appId;

	@Column(name="app_name")
	private String appName;

	@Column(name="app_token")
	private String appToken;

	private byte status;

	public OhrmWsConsumer() {
	}

	public int getAppId() {
		return this.appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}

	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}