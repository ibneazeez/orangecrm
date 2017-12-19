package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_upgrade_history database table.
 * 
 */
@Entity
@Table(name="ohrm_upgrade_history")
@NamedQuery(name="OhrmUpgradeHistory.findAll", query="SELECT o FROM OhrmUpgradeHistory o")
public class OhrmUpgradeHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="end_increment")
	private int endIncrement;

	@Column(name="end_version")
	private String endVersion;

	@Column(name="start_increment")
	private int startIncrement;

	@Column(name="start_version")
	private String startVersion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="upgraded_date")
	private Date upgradedDate;

	public OhrmUpgradeHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEndIncrement() {
		return this.endIncrement;
	}

	public void setEndIncrement(int endIncrement) {
		this.endIncrement = endIncrement;
	}

	public String getEndVersion() {
		return this.endVersion;
	}

	public void setEndVersion(String endVersion) {
		this.endVersion = endVersion;
	}

	public int getStartIncrement() {
		return this.startIncrement;
	}

	public void setStartIncrement(int startIncrement) {
		this.startIncrement = startIncrement;
	}

	public String getStartVersion() {
		return this.startVersion;
	}

	public void setStartVersion(String startVersion) {
		this.startVersion = startVersion;
	}

	public Date getUpgradedDate() {
		return this.upgradedDate;
	}

	public void setUpgradedDate(Date upgradedDate) {
		this.upgradedDate = upgradedDate;
	}

}