package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the ohrm_login database table.
 * 
 */
@Entity
@Table(name="ohrm_login")
@NamedQuery(name="OhrmLogin.findAll", query="SELECT o FROM OhrmLogin o")
public class OhrmLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="login_time")
	private Timestamp loginTime;

	@Column(name="user_id")
	private BigInteger userId;

	@Column(name="user_name")
	private String userName;

	@Lob
	@Column(name="user_role_name")
	private String userRoleName;

	@Column(name="user_role_predefined")
	private byte userRolePredefined;

	public OhrmLogin() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}

	public BigInteger getUserId() {
		return this.userId;
	}

	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRoleName() {
		return this.userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}

	public byte getUserRolePredefined() {
		return this.userRolePredefined;
	}

	public void setUserRolePredefined(byte userRolePredefined) {
		this.userRolePredefined = userRolePredefined;
	}

}