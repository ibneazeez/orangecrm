package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_job_vacancy_attachment database table.
 * 
 */
@Entity
@Table(name="ohrm_job_vacancy_attachment")
@NamedQuery(name="OhrmJobVacancyAttachment.findAll", query="SELECT o FROM OhrmJobVacancyAttachment o")
public class OhrmJobVacancyAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="attachment_type")
	private int attachmentType;

	private String comment;

	@Lob
	@Column(name="file_content")
	private byte[] fileContent;

	@Column(name="file_name")
	private String fileName;

	@Column(name="file_size")
	private int fileSize;

	@Column(name="file_type")
	private String fileType;

	//bi-directional many-to-one association to OhrmJobVacancy
	@ManyToOne
	@JoinColumn(name="vacancy_id")
	private OhrmJobVacancy ohrmJobVacancy;

	public OhrmJobVacancyAttachment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(int attachmentType) {
		this.attachmentType = attachmentType;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public byte[] getFileContent() {
		return this.fileContent;
	}

	public void setFileContent(byte[] fileContent) {
		this.fileContent = fileContent;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public OhrmJobVacancy getOhrmJobVacancy() {
		return this.ohrmJobVacancy;
	}

	public void setOhrmJobVacancy(OhrmJobVacancy ohrmJobVacancy) {
		this.ohrmJobVacancy = ohrmJobVacancy;
	}

}