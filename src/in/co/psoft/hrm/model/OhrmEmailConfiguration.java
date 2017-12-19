package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_email_configuration database table.
 * 
 */
@Entity
@Table(name="ohrm_email_configuration")
@NamedQuery(name="OhrmEmailConfiguration.findAll", query="SELECT o FROM OhrmEmailConfiguration o")
public class OhrmEmailConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="mail_type")
	private String mailType;

	@Column(name="sendmail_path")
	private String sendmailPath;

	@Column(name="sent_as")
	private String sentAs;

	@Column(name="smtp_auth_type")
	private String smtpAuthType;

	@Column(name="smtp_host")
	private String smtpHost;

	@Column(name="smtp_password")
	private String smtpPassword;

	@Column(name="smtp_port")
	private int smtpPort;

	@Column(name="smtp_security_type")
	private String smtpSecurityType;

	@Column(name="smtp_username")
	private String smtpUsername;

	public OhrmEmailConfiguration() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMailType() {
		return this.mailType;
	}

	public void setMailType(String mailType) {
		this.mailType = mailType;
	}

	public String getSendmailPath() {
		return this.sendmailPath;
	}

	public void setSendmailPath(String sendmailPath) {
		this.sendmailPath = sendmailPath;
	}

	public String getSentAs() {
		return this.sentAs;
	}

	public void setSentAs(String sentAs) {
		this.sentAs = sentAs;
	}

	public String getSmtpAuthType() {
		return this.smtpAuthType;
	}

	public void setSmtpAuthType(String smtpAuthType) {
		this.smtpAuthType = smtpAuthType;
	}

	public String getSmtpHost() {
		return this.smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public String getSmtpPassword() {
		return this.smtpPassword;
	}

	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	public int getSmtpPort() {
		return this.smtpPort;
	}

	public void setSmtpPort(int smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getSmtpSecurityType() {
		return this.smtpSecurityType;
	}

	public void setSmtpSecurityType(String smtpSecurityType) {
		this.smtpSecurityType = smtpSecurityType;
	}

	public String getSmtpUsername() {
		return this.smtpUsername;
	}

	public void setSmtpUsername(String smtpUsername) {
		this.smtpUsername = smtpUsername;
	}

}