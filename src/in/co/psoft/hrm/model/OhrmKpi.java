package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_kpi database table.
 * 
 */
@Entity
@Table(name="ohrm_kpi")
@NamedQuery(name="OhrmKpi.findAll", query="SELECT o FROM OhrmKpi o")
public class OhrmKpi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="default_kpi")
	private short defaultKpi;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="deleted_at")
	private Date deletedAt;

	@Column(name="job_title_code")
	private String jobTitleCode;

	@Column(name="kpi_indicators")
	private String kpiIndicators;

	@Column(name="max_rating")
	private int maxRating;

	@Column(name="min_rating")
	private int minRating;

	public OhrmKpi() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public short getDefaultKpi() {
		return this.defaultKpi;
	}

	public void setDefaultKpi(short defaultKpi) {
		this.defaultKpi = defaultKpi;
	}

	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public String getJobTitleCode() {
		return this.jobTitleCode;
	}

	public void setJobTitleCode(String jobTitleCode) {
		this.jobTitleCode = jobTitleCode;
	}

	public String getKpiIndicators() {
		return this.kpiIndicators;
	}

	public void setKpiIndicators(String kpiIndicators) {
		this.kpiIndicators = kpiIndicators;
	}

	public int getMaxRating() {
		return this.maxRating;
	}

	public void setMaxRating(int maxRating) {
		this.maxRating = maxRating;
	}

	public int getMinRating() {
		return this.minRating;
	}

	public void setMinRating(int minRating) {
		this.minRating = minRating;
	}

}