package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_job_candidate database table.
 * 
 */
@Entity
@Table(name="ohrm_job_candidate")
@NamedQuery(name="OhrmJobCandidate.findAll", query="SELECT o FROM OhrmJobCandidate o")
public class OhrmJobCandidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String comment;

	@Column(name="contact_number")
	private String contactNumber;

	@Column(name="cv_file_id")
	private int cvFileId;

	@Lob
	@Column(name="cv_text_version")
	private String cvTextVersion;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_application")
	private Date dateOfApplication;

	private String email;

	@Column(name="first_name")
	private String firstName;

	private String keywords;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="mode_of_application")
	private int modeOfApplication;

	private int status;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="added_person")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmJobCandidateAttachment
	@OneToMany(mappedBy="ohrmJobCandidate")
	private List<OhrmJobCandidateAttachment> ohrmJobCandidateAttachments;

	//bi-directional many-to-one association to OhrmJobCandidateHistory
	@OneToMany(mappedBy="ohrmJobCandidate")
	private List<OhrmJobCandidateHistory> ohrmJobCandidateHistories;

	//bi-directional many-to-one association to OhrmJobCandidateVacancy
	@OneToMany(mappedBy="ohrmJobCandidate")
	private List<OhrmJobCandidateVacancy> ohrmJobCandidateVacancies;

	public OhrmJobCandidate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getCvFileId() {
		return this.cvFileId;
	}

	public void setCvFileId(int cvFileId) {
		this.cvFileId = cvFileId;
	}

	public String getCvTextVersion() {
		return this.cvTextVersion;
	}

	public void setCvTextVersion(String cvTextVersion) {
		this.cvTextVersion = cvTextVersion;
	}

	public Date getDateOfApplication() {
		return this.dateOfApplication;
	}

	public void setDateOfApplication(Date dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getModeOfApplication() {
		return this.modeOfApplication;
	}

	public void setModeOfApplication(int modeOfApplication) {
		this.modeOfApplication = modeOfApplication;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public List<OhrmJobCandidateAttachment> getOhrmJobCandidateAttachments() {
		return this.ohrmJobCandidateAttachments;
	}

	public void setOhrmJobCandidateAttachments(List<OhrmJobCandidateAttachment> ohrmJobCandidateAttachments) {
		this.ohrmJobCandidateAttachments = ohrmJobCandidateAttachments;
	}

	public OhrmJobCandidateAttachment addOhrmJobCandidateAttachment(OhrmJobCandidateAttachment ohrmJobCandidateAttachment) {
		getOhrmJobCandidateAttachments().add(ohrmJobCandidateAttachment);
		ohrmJobCandidateAttachment.setOhrmJobCandidate(this);

		return ohrmJobCandidateAttachment;
	}

	public OhrmJobCandidateAttachment removeOhrmJobCandidateAttachment(OhrmJobCandidateAttachment ohrmJobCandidateAttachment) {
		getOhrmJobCandidateAttachments().remove(ohrmJobCandidateAttachment);
		ohrmJobCandidateAttachment.setOhrmJobCandidate(null);

		return ohrmJobCandidateAttachment;
	}

	public List<OhrmJobCandidateHistory> getOhrmJobCandidateHistories() {
		return this.ohrmJobCandidateHistories;
	}

	public void setOhrmJobCandidateHistories(List<OhrmJobCandidateHistory> ohrmJobCandidateHistories) {
		this.ohrmJobCandidateHistories = ohrmJobCandidateHistories;
	}

	public OhrmJobCandidateHistory addOhrmJobCandidateHistory(OhrmJobCandidateHistory ohrmJobCandidateHistory) {
		getOhrmJobCandidateHistories().add(ohrmJobCandidateHistory);
		ohrmJobCandidateHistory.setOhrmJobCandidate(this);

		return ohrmJobCandidateHistory;
	}

	public OhrmJobCandidateHistory removeOhrmJobCandidateHistory(OhrmJobCandidateHistory ohrmJobCandidateHistory) {
		getOhrmJobCandidateHistories().remove(ohrmJobCandidateHistory);
		ohrmJobCandidateHistory.setOhrmJobCandidate(null);

		return ohrmJobCandidateHistory;
	}

	public List<OhrmJobCandidateVacancy> getOhrmJobCandidateVacancies() {
		return this.ohrmJobCandidateVacancies;
	}

	public void setOhrmJobCandidateVacancies(List<OhrmJobCandidateVacancy> ohrmJobCandidateVacancies) {
		this.ohrmJobCandidateVacancies = ohrmJobCandidateVacancies;
	}

	public OhrmJobCandidateVacancy addOhrmJobCandidateVacancy(OhrmJobCandidateVacancy ohrmJobCandidateVacancy) {
		getOhrmJobCandidateVacancies().add(ohrmJobCandidateVacancy);
		ohrmJobCandidateVacancy.setOhrmJobCandidate(this);

		return ohrmJobCandidateVacancy;
	}

	public OhrmJobCandidateVacancy removeOhrmJobCandidateVacancy(OhrmJobCandidateVacancy ohrmJobCandidateVacancy) {
		getOhrmJobCandidateVacancies().remove(ohrmJobCandidateVacancy);
		ohrmJobCandidateVacancy.setOhrmJobCandidate(null);

		return ohrmJobCandidateVacancy;
	}

}