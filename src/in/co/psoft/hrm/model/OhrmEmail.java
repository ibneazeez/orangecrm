package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ohrm_email database table.
 * 
 */
@Entity
@Table(name="ohrm_email")
@NamedQuery(name="OhrmEmail.findAll", query="SELECT o FROM OhrmEmail o")
public class OhrmEmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to OhrmEmailProcessor
	@OneToMany(mappedBy="ohrmEmail")
	private List<OhrmEmailProcessor> ohrmEmailProcessors;

	//bi-directional many-to-one association to OhrmEmailTemplate
	@OneToMany(mappedBy="ohrmEmail")
	private List<OhrmEmailTemplate> ohrmEmailTemplates;

	public OhrmEmail() {
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

	public List<OhrmEmailProcessor> getOhrmEmailProcessors() {
		return this.ohrmEmailProcessors;
	}

	public void setOhrmEmailProcessors(List<OhrmEmailProcessor> ohrmEmailProcessors) {
		this.ohrmEmailProcessors = ohrmEmailProcessors;
	}

	public OhrmEmailProcessor addOhrmEmailProcessor(OhrmEmailProcessor ohrmEmailProcessor) {
		getOhrmEmailProcessors().add(ohrmEmailProcessor);
		ohrmEmailProcessor.setOhrmEmail(this);

		return ohrmEmailProcessor;
	}

	public OhrmEmailProcessor removeOhrmEmailProcessor(OhrmEmailProcessor ohrmEmailProcessor) {
		getOhrmEmailProcessors().remove(ohrmEmailProcessor);
		ohrmEmailProcessor.setOhrmEmail(null);

		return ohrmEmailProcessor;
	}

	public List<OhrmEmailTemplate> getOhrmEmailTemplates() {
		return this.ohrmEmailTemplates;
	}

	public void setOhrmEmailTemplates(List<OhrmEmailTemplate> ohrmEmailTemplates) {
		this.ohrmEmailTemplates = ohrmEmailTemplates;
	}

	public OhrmEmailTemplate addOhrmEmailTemplate(OhrmEmailTemplate ohrmEmailTemplate) {
		getOhrmEmailTemplates().add(ohrmEmailTemplate);
		ohrmEmailTemplate.setOhrmEmail(this);

		return ohrmEmailTemplate;
	}

	public OhrmEmailTemplate removeOhrmEmailTemplate(OhrmEmailTemplate ohrmEmailTemplate) {
		getOhrmEmailTemplates().remove(ohrmEmailTemplate);
		ohrmEmailTemplate.setOhrmEmail(null);

		return ohrmEmailTemplate;
	}

}