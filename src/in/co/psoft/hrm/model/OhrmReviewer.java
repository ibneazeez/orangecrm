package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_reviewer database table.
 * 
 */
@Entity
@Table(name="ohrm_reviewer")
@NamedQuery(name="OhrmReviewer.findAll", query="SELECT o FROM OhrmReviewer o")
public class OhrmReviewer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String comment;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="completed_date")
	private Date completedDate;

	@Column(name="employee_number")
	private int employeeNumber;

	@Column(name="reviewer_group_id")
	private int reviewerGroupId;

	private int status;

	//bi-directional many-to-one association to OhrmPerformanceReview
	@ManyToOne
	@JoinColumn(name="review_id")
	private OhrmPerformanceReview ohrmPerformanceReview;

	//bi-directional many-to-one association to OhrmReviewerRating
	@OneToMany(mappedBy="ohrmReviewer")
	private List<OhrmReviewerRating> ohrmReviewerRatings;

	public OhrmReviewer() {
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

	public Date getCompletedDate() {
		return this.completedDate;
	}

	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}

	public int getEmployeeNumber() {
		return this.employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getReviewerGroupId() {
		return this.reviewerGroupId;
	}

	public void setReviewerGroupId(int reviewerGroupId) {
		this.reviewerGroupId = reviewerGroupId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public OhrmPerformanceReview getOhrmPerformanceReview() {
		return this.ohrmPerformanceReview;
	}

	public void setOhrmPerformanceReview(OhrmPerformanceReview ohrmPerformanceReview) {
		this.ohrmPerformanceReview = ohrmPerformanceReview;
	}

	public List<OhrmReviewerRating> getOhrmReviewerRatings() {
		return this.ohrmReviewerRatings;
	}

	public void setOhrmReviewerRatings(List<OhrmReviewerRating> ohrmReviewerRatings) {
		this.ohrmReviewerRatings = ohrmReviewerRatings;
	}

	public OhrmReviewerRating addOhrmReviewerRating(OhrmReviewerRating ohrmReviewerRating) {
		getOhrmReviewerRatings().add(ohrmReviewerRating);
		ohrmReviewerRating.setOhrmReviewer(this);

		return ohrmReviewerRating;
	}

	public OhrmReviewerRating removeOhrmReviewerRating(OhrmReviewerRating ohrmReviewerRating) {
		getOhrmReviewerRatings().remove(ohrmReviewerRating);
		ohrmReviewerRating.setOhrmReviewer(null);

		return ohrmReviewerRating;
	}

}