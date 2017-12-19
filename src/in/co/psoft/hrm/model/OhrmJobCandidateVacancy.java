package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_job_candidate_vacancy database table.
 * 
 */
@Entity
@Table(name="ohrm_job_candidate_vacancy")
@NamedQuery(name="OhrmJobCandidateVacancy.findAll", query="SELECT o FROM OhrmJobCandidateVacancy o")
public class OhrmJobCandidateVacancy implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhrmJobCandidateVacancyPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="applied_date")
	private Date appliedDate;

	private int id;

	private String status;

	//bi-directional many-to-one association to OhrmJobCandidate
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private OhrmJobCandidate ohrmJobCandidate;

	//bi-directional many-to-one association to OhrmJobVacancy
	@ManyToOne
	@JoinColumn(name="vacancy_id")
	private OhrmJobVacancy ohrmJobVacancy;

	public OhrmJobCandidateVacancy() {
	}

	public OhrmJobCandidateVacancyPK getId() {
		return this.id;
	}

	public void setId(OhrmJobCandidateVacancyPK id) {
		this.id = id;
	}

	public Date getAppliedDate() {
		return this.appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public OhrmJobCandidate getOhrmJobCandidate() {
		return this.ohrmJobCandidate;
	}

	public void setOhrmJobCandidate(OhrmJobCandidate ohrmJobCandidate) {
		this.ohrmJobCandidate = ohrmJobCandidate;
	}

	public OhrmJobVacancy getOhrmJobVacancy() {
		return this.ohrmJobVacancy;
	}

	public void setOhrmJobVacancy(OhrmJobVacancy ohrmJobVacancy) {
		this.ohrmJobVacancy = ohrmJobVacancy;
	}

}