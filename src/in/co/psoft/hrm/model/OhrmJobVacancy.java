package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_job_vacancy database table.
 * 
 */
@Entity
@Table(name="ohrm_job_vacancy")
@NamedQuery(name="OhrmJobVacancy.findAll", query="SELECT o FROM OhrmJobVacancy o")
public class OhrmJobVacancy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="defined_time")
	private Date definedTime;

	@Lob
	private String description;

	private String name;

	@Column(name="no_of_positions")
	private int noOfPositions;

	@Column(name="published_in_feed")
	private byte publishedInFeed;

	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="updated_time")
	private Date updatedTime;

	//bi-directional many-to-one association to OhrmJobCandidateHistory
	@OneToMany(mappedBy="ohrmJobVacancy")
	private List<OhrmJobCandidateHistory> ohrmJobCandidateHistories;

	//bi-directional many-to-one association to OhrmJobCandidateVacancy
	@OneToMany(mappedBy="ohrmJobVacancy")
	private List<OhrmJobCandidateVacancy> ohrmJobCandidateVacancies;

	//bi-directional many-to-one association to OhrmJobTitle
	@ManyToOne
	@JoinColumn(name="job_title_code")
	private OhrmJobTitle ohrmJobTitle;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="hiring_manager_id")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmJobVacancyAttachment
	@OneToMany(mappedBy="ohrmJobVacancy")
	private List<OhrmJobVacancyAttachment> ohrmJobVacancyAttachments;

	public OhrmJobVacancy() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDefinedTime() {
		return this.definedTime;
	}

	public void setDefinedTime(Date definedTime) {
		this.definedTime = definedTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPositions() {
		return this.noOfPositions;
	}

	public void setNoOfPositions(int noOfPositions) {
		this.noOfPositions = noOfPositions;
	}

	public byte getPublishedInFeed() {
		return this.publishedInFeed;
	}

	public void setPublishedInFeed(byte publishedInFeed) {
		this.publishedInFeed = publishedInFeed;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public List<OhrmJobCandidateHistory> getOhrmJobCandidateHistories() {
		return this.ohrmJobCandidateHistories;
	}

	public void setOhrmJobCandidateHistories(List<OhrmJobCandidateHistory> ohrmJobCandidateHistories) {
		this.ohrmJobCandidateHistories = ohrmJobCandidateHistories;
	}

	public OhrmJobCandidateHistory addOhrmJobCandidateHistory(OhrmJobCandidateHistory ohrmJobCandidateHistory) {
		getOhrmJobCandidateHistories().add(ohrmJobCandidateHistory);
		ohrmJobCandidateHistory.setOhrmJobVacancy(this);

		return ohrmJobCandidateHistory;
	}

	public OhrmJobCandidateHistory removeOhrmJobCandidateHistory(OhrmJobCandidateHistory ohrmJobCandidateHistory) {
		getOhrmJobCandidateHistories().remove(ohrmJobCandidateHistory);
		ohrmJobCandidateHistory.setOhrmJobVacancy(null);

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
		ohrmJobCandidateVacancy.setOhrmJobVacancy(this);

		return ohrmJobCandidateVacancy;
	}

	public OhrmJobCandidateVacancy removeOhrmJobCandidateVacancy(OhrmJobCandidateVacancy ohrmJobCandidateVacancy) {
		getOhrmJobCandidateVacancies().remove(ohrmJobCandidateVacancy);
		ohrmJobCandidateVacancy.setOhrmJobVacancy(null);

		return ohrmJobCandidateVacancy;
	}

	public OhrmJobTitle getOhrmJobTitle() {
		return this.ohrmJobTitle;
	}

	public void setOhrmJobTitle(OhrmJobTitle ohrmJobTitle) {
		this.ohrmJobTitle = ohrmJobTitle;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public List<OhrmJobVacancyAttachment> getOhrmJobVacancyAttachments() {
		return this.ohrmJobVacancyAttachments;
	}

	public void setOhrmJobVacancyAttachments(List<OhrmJobVacancyAttachment> ohrmJobVacancyAttachments) {
		this.ohrmJobVacancyAttachments = ohrmJobVacancyAttachments;
	}

	public OhrmJobVacancyAttachment addOhrmJobVacancyAttachment(OhrmJobVacancyAttachment ohrmJobVacancyAttachment) {
		getOhrmJobVacancyAttachments().add(ohrmJobVacancyAttachment);
		ohrmJobVacancyAttachment.setOhrmJobVacancy(this);

		return ohrmJobVacancyAttachment;
	}

	public OhrmJobVacancyAttachment removeOhrmJobVacancyAttachment(OhrmJobVacancyAttachment ohrmJobVacancyAttachment) {
		getOhrmJobVacancyAttachments().remove(ohrmJobVacancyAttachment);
		ohrmJobVacancyAttachment.setOhrmJobVacancy(null);

		return ohrmJobVacancyAttachment;
	}

}