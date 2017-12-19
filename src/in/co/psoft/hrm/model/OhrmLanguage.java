package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_language database table.
 * 
 */
@Entity
@Table(name="ohrm_language")
@NamedQuery(name="OhrmLanguage.findAll", query="SELECT o FROM OhrmLanguage o")
public class OhrmLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to HsHrEmpLanguage
	@OneToMany(mappedBy="ohrmLanguage")
	private List<HsHrEmpLanguage> hsHrEmpLanguages;

	public OhrmLanguage() {
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

	public List<HsHrEmpLanguage> getHsHrEmpLanguages() {
		return this.hsHrEmpLanguages;
	}

	public void setHsHrEmpLanguages(List<HsHrEmpLanguage> hsHrEmpLanguages) {
		this.hsHrEmpLanguages = hsHrEmpLanguages;
	}

	public HsHrEmpLanguage addHsHrEmpLanguage(HsHrEmpLanguage hsHrEmpLanguage) {
		getHsHrEmpLanguages().add(hsHrEmpLanguage);
		hsHrEmpLanguage.setOhrmLanguage(this);

		return hsHrEmpLanguage;
	}

	public HsHrEmpLanguage removeHsHrEmpLanguage(HsHrEmpLanguage hsHrEmpLanguage) {
		getHsHrEmpLanguages().remove(hsHrEmpLanguage);
		hsHrEmpLanguage.setOhrmLanguage(null);

		return hsHrEmpLanguage;
	}

}