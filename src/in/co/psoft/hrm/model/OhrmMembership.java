package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_membership database table.
 * 
 */
@Entity
@Table(name="ohrm_membership")
@NamedQuery(name="OhrmMembership.findAll", query="SELECT o FROM OhrmMembership o")
public class OhrmMembership implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to HsHrEmpMemberDetail
	@OneToMany(mappedBy="ohrmMembership")
	private List<HsHrEmpMemberDetail> hsHrEmpMemberDetails;

	public OhrmMembership() {
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

	public List<HsHrEmpMemberDetail> getHsHrEmpMemberDetails() {
		return this.hsHrEmpMemberDetails;
	}

	public void setHsHrEmpMemberDetails(List<HsHrEmpMemberDetail> hsHrEmpMemberDetails) {
		this.hsHrEmpMemberDetails = hsHrEmpMemberDetails;
	}

	public HsHrEmpMemberDetail addHsHrEmpMemberDetail(HsHrEmpMemberDetail hsHrEmpMemberDetail) {
		getHsHrEmpMemberDetails().add(hsHrEmpMemberDetail);
		hsHrEmpMemberDetail.setOhrmMembership(this);

		return hsHrEmpMemberDetail;
	}

	public HsHrEmpMemberDetail removeHsHrEmpMemberDetail(HsHrEmpMemberDetail hsHrEmpMemberDetail) {
		getHsHrEmpMemberDetails().remove(hsHrEmpMemberDetail);
		hsHrEmpMemberDetail.setOhrmMembership(null);

		return hsHrEmpMemberDetail;
	}

}