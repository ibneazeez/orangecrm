package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ohrm_job_candidate_history database table.
 * 
 */
@Entity
@Table(name="ohrm_job_candidate_history")
@NamedQuery(name="OhrmJobCandidateHistory.findAll", query="SELECT o FROM OhrmJobCandidateHistory o")
public class OhrmJobCandidateHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int action;

	@Column(name="candidate_vacancy_name")
	private String candidateVacancyName;

	private String interviewers;

	@Lob
	private String note;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="performed_date")
	private Date performedDate;

	//bi-directional many-to-one association to OhrmJobCandidate
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private OhrmJobCandidate ohrmJobCandidate;

	//bi-directional many-to-one association to OhrmJobVacancy
	@ManyToOne
	@JoinColumn(name="vacancy_id")
	private OhrmJobVacancy ohrmJobVacancy;

	//bi-directional many-to-one association to OhrmJobInterview
	@ManyToOne
	@JoinColumn(name="interview_id")
	private OhrmJobInterview ohrmJobInterview;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="performed_by")
	private HsHrEmployee hsHrEmployee;

	public OhrmJobCandidateHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAction() {
		return this.action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getCandidateVacancyName() {
		return this.candidateVacancyName;
	}

	public void setCandidateVacancyName(String candidateVacancyName) {
		this.candidateVacancyName = candidateVacancyName;
	}

	public String getInterviewers() {
		return this.interviewers;
	}

	public void setInterviewers(String interviewers) {
		this.interviewers = interviewers;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getPerformedDate() {
		return this.performedDate;
	}

	public void setPerformedDate(Date performedDate) {
		this.performedDate = performedDate;
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

	public OhrmJobInterview getOhrmJobInterview() {
		return this.ohrmJobInterview;
	}

	public void setOhrmJobInterview(OhrmJobInterview ohrmJobInterview) {
		this.ohrmJobInterview = ohrmJobInterview;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}