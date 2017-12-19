package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ohrm_job_candidate_vacancy database table.
 * 
 */
@Embeddable
public class OhrmJobCandidateVacancyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="candidate_id", insertable=false, updatable=false)
	private int candidateId;

	@Column(name="vacancy_id", insertable=false, updatable=false)
	private int vacancyId;

	public OhrmJobCandidateVacancyPK() {
	}
	public int getCandidateId() {
		return this.candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getVacancyId() {
		return this.vacancyId;
	}
	public void setVacancyId(int vacancyId) {
		this.vacancyId = vacancyId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OhrmJobCandidateVacancyPK)) {
			return false;
		}
		OhrmJobCandidateVacancyPK castOther = (OhrmJobCandidateVacancyPK)other;
		return 
			(this.candidateId == castOther.candidateId)
			&& (this.vacancyId == castOther.vacancyId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.candidateId;
		hash = hash * prime + this.vacancyId;
		
		return hash;
	}
}