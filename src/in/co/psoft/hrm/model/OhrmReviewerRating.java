package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ohrm_reviewer_rating database table.
 * 
 */
@Entity
@Table(name="ohrm_reviewer_rating")
@NamedQuery(name="OhrmReviewerRating.findAll", query="SELECT o FROM OhrmReviewerRating o")
public class OhrmReviewerRating implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	private String comment;

	@Column(name="kpi_id")
	private int kpiId;

	private BigDecimal rating;

	//bi-directional many-to-one association to OhrmReviewer
	@ManyToOne
	@JoinColumn(name="reviewer_id")
	private OhrmReviewer ohrmReviewer;

	//bi-directional many-to-one association to OhrmPerformanceReview
	@ManyToOne
	@JoinColumn(name="review_id")
	private OhrmPerformanceReview ohrmPerformanceReview;

	public OhrmReviewerRating() {
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

	public int getKpiId() {
		return this.kpiId;
	}

	public void setKpiId(int kpiId) {
		this.kpiId = kpiId;
	}

	public BigDecimal getRating() {
		return this.rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}

	public OhrmReviewer getOhrmReviewer() {
		return this.ohrmReviewer;
	}

	public void setOhrmReviewer(OhrmReviewer ohrmReviewer) {
		this.ohrmReviewer = ohrmReviewer;
	}

	public OhrmPerformanceReview getOhrmPerformanceReview() {
		return this.ohrmPerformanceReview;
	}

	public void setOhrmPerformanceReview(OhrmPerformanceReview ohrmPerformanceReview) {
		this.ohrmPerformanceReview = ohrmPerformanceReview;
	}

}