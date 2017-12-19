package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_job_title database table.
 * 
 */
@Entity
@Table(name="ohrm_job_title")
@NamedQuery(name="OhrmJobTitle.findAll", query="SELECT o FROM OhrmJobTitle o")
public class OhrmJobTitle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="is_deleted")
	private byte isDeleted;

	@Column(name="job_description")
	private String jobDescription;

	@Column(name="job_title")
	private String jobTitle;

	private String note;

	//bi-directional many-to-one association to HsHrEmployee
	@OneToMany(mappedBy="ohrmJobTitle")
	private List<HsHrEmployee> hsHrEmployees;

	//bi-directional many-to-many association to OhrmEmploymentStatus
	@ManyToMany(mappedBy="ohrmJobTitles")
	private List<OhrmEmploymentStatus> ohrmEmploymentStatuses;

	//bi-directional many-to-one association to OhrmJobSpecificationAttachment
	@OneToMany(mappedBy="ohrmJobTitle")
	private List<OhrmJobSpecificationAttachment> ohrmJobSpecificationAttachments;

	//bi-directional many-to-one association to OhrmJobVacancy
	@OneToMany(mappedBy="ohrmJobTitle")
	private List<OhrmJobVacancy> ohrmJobVacancies;

	public OhrmJobTitle() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(byte isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getJobDescription() {
		return this.jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public List<HsHrEmployee> getHsHrEmployees() {
		return this.hsHrEmployees;
	}

	public void setHsHrEmployees(List<HsHrEmployee> hsHrEmployees) {
		this.hsHrEmployees = hsHrEmployees;
	}

	public HsHrEmployee addHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().add(hsHrEmployee);
		hsHrEmployee.setOhrmJobTitle(this);

		return hsHrEmployee;
	}

	public HsHrEmployee removeHsHrEmployee(HsHrEmployee hsHrEmployee) {
		getHsHrEmployees().remove(hsHrEmployee);
		hsHrEmployee.setOhrmJobTitle(null);

		return hsHrEmployee;
	}

	public List<OhrmEmploymentStatus> getOhrmEmploymentStatuses() {
		return this.ohrmEmploymentStatuses;
	}

	public void setOhrmEmploymentStatuses(List<OhrmEmploymentStatus> ohrmEmploymentStatuses) {
		this.ohrmEmploymentStatuses = ohrmEmploymentStatuses;
	}

	public List<OhrmJobSpecificationAttachment> getOhrmJobSpecificationAttachments() {
		return this.ohrmJobSpecificationAttachments;
	}

	public void setOhrmJobSpecificationAttachments(List<OhrmJobSpecificationAttachment> ohrmJobSpecificationAttachments) {
		this.ohrmJobSpecificationAttachments = ohrmJobSpecificationAttachments;
	}

	public OhrmJobSpecificationAttachment addOhrmJobSpecificationAttachment(OhrmJobSpecificationAttachment ohrmJobSpecificationAttachment) {
		getOhrmJobSpecificationAttachments().add(ohrmJobSpecificationAttachment);
		ohrmJobSpecificationAttachment.setOhrmJobTitle(this);

		return ohrmJobSpecificationAttachment;
	}

	public OhrmJobSpecificationAttachment removeOhrmJobSpecificationAttachment(OhrmJobSpecificationAttachment ohrmJobSpecificationAttachment) {
		getOhrmJobSpecificationAttachments().remove(ohrmJobSpecificationAttachment);
		ohrmJobSpecificationAttachment.setOhrmJobTitle(null);

		return ohrmJobSpecificationAttachment;
	}

	public List<OhrmJobVacancy> getOhrmJobVacancies() {
		return this.ohrmJobVacancies;
	}

	public void setOhrmJobVacancies(List<OhrmJobVacancy> ohrmJobVacancies) {
		this.ohrmJobVacancies = ohrmJobVacancies;
	}

	public OhrmJobVacancy addOhrmJobVacancy(OhrmJobVacancy ohrmJobVacancy) {
		getOhrmJobVacancies().add(ohrmJobVacancy);
		ohrmJobVacancy.setOhrmJobTitle(this);

		return ohrmJobVacancy;
	}

	public OhrmJobVacancy removeOhrmJobVacancy(OhrmJobVacancy ohrmJobVacancy) {
		getOhrmJobVacancies().remove(ohrmJobVacancy);
		ohrmJobVacancy.setOhrmJobTitle(null);

		return ohrmJobVacancy;
	}

}