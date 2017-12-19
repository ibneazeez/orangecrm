package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_reviewer_group database table.
 * 
 */
@Entity
@Table(name="ohrm_reviewer_group")
@NamedQuery(name="OhrmReviewerGroup.findAll", query="SELECT o FROM OhrmReviewerGroup o")
public class OhrmReviewerGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private int piority;

	public OhrmReviewerGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPiority() {
		return this.piority;
	}

	public void setPiority(int piority) {
		this.piority = piority;
	}

}