package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_performance_review database table.
 * 
 */
@Entity
@Table(name="ohrm_performance_review")
@NamedQuery(name="OhrmPerformanceReview.findAll", query="SELECT o FROM OhrmPerformanceReview o")
public class OhrmPerformanceReview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="activated_date")
	private Date activatedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="completed_date")
	private Date completedDate;

	@Column(name="department_id")
	private int departmentId;

	@Temporal(TemporalType.DATE)
	@Column(name="due_date")
	private Date dueDate;

	@Lob
	@Column(name="final_comment")
	private String finalComment;

	@Column(name="final_rate")
	private BigDecimal finalRate;

	@Column(name="job_title_code")
	private int jobTitleCode;

	@Column(name="status_id")
	private int statusId;

	@Temporal(TemporalType.DATE)
	@Column(name="work_period_end")
	private Date workPeriodEnd;

	@Temporal(TemporalType.DATE)
	@Column(name="work_period_start")
	private Date workPeriodStart;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="employee_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmReviewer
	@OneToMany(mappedBy="ohrmPerformanceReview")
	private List<OhrmReviewer> ohrmReviewers;

	//bi-directional many-to-one association to OhrmReviewerRating
	@OneToMany(mappedBy="ohrmPerformanceReview")
	private List<OhrmReviewerRating> ohrmReviewerRatings;

	public OhrmPerformanceReview() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getActivatedDate() {
		return this.activatedDate;
	}

	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;
	}

	public Date getCompletedDate() {
		return this.completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getFinalComment() {
		return this.finalComment;
	}

	public void setFinalComment(String finalComment) {
		this.finalComment = finalComment;
	}

	public BigDecimal getFinalRate() {
		return this.finalRate;
	}

	public void setFinalRate(BigDecimal finalRate) {
		this.finalRate = finalRate;
	}

	public int getJobTitleCode() {
		return this.jobTitleCode;
	}

	public void setJobTitleCode(int jobTitleCode) {
		this.jobTitleCode = jobTitleCode;
	}

	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Date getWorkPeriodEnd() {
		return this.workPeriodEnd;
	}

	public void setWorkPeriodEnd(Date workPeriodEnd) {
		this.workPeriodEnd = workPeriodEnd;
	}

	public Date getWorkPeriodStart() {
		return this.workPeriodStart;
	}

	public void setWorkPeriodStart(Date workPeriodStart) {
		this.workPeriodStart = workPeriodStart;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public List<OhrmReviewer> getOhrmReviewers() {
		return this.ohrmReviewers;
	}

	public void setOhrmReviewers(List<OhrmReviewer> ohrmReviewers) {
		this.ohrmReviewers = ohrmReviewers;
	}

	public OhrmReviewer addOhrmReviewer(OhrmReviewer ohrmReviewer) {
		getOhrmReviewers().add(ohrmReviewer);
		ohrmReviewer.setOhrmPerformanceReview(this);

		return ohrmReviewer;
	}

	public OhrmReviewer removeOhrmReviewer(OhrmReviewer ohrmReviewer) {
		getOhrmReviewers().remove(ohrmReviewer);
		ohrmReviewer.setOhrmPerformanceReview(null);

		return ohrmReviewer;
	}

	public List<OhrmReviewerRating> getOhrmReviewerRatings() {
		return this.ohrmReviewerRatings;
	}

	public void setOhrmReviewerRatings(List<OhrmReviewerRating> ohrmReviewerRatings) {
		this.ohrmReviewerRatings = ohrmReviewerRatings;
	}

	public OhrmReviewerRating addOhrmReviewerRating(OhrmReviewerRating ohrmReviewerRating) {
		getOhrmReviewerRatings().add(ohrmReviewerRating);
		ohrmReviewerRating.setOhrmPerformanceReview(this);

		return ohrmReviewerRating;
	}

	public OhrmReviewerRating removeOhrmReviewerRating(OhrmReviewerRating ohrmReviewerRating) {
		getOhrmReviewerRatings().remove(ohrmReviewerRating);
		ohrmReviewerRating.setOhrmPerformanceReview(null);

		return ohrmReviewerRating;
	}

}