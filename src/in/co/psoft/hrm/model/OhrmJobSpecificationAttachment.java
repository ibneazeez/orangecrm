package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ohrm_job_specification_attachment database table.
 * 
 */
@Entity
@Table(name="ohrm_job_specification_attachment")
@NamedQuery(name="OhrmJobSpecificationAttachment.findAll", query="SELECT o FROM OhrmJobSpecificationAttachment o")
public class OhrmJobSpecificationAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Lob
	@Column(name="file_content")
	private byte[] fileContent;

	@Column(name="file_name")
	private String fileName;

	@Column(name="file_size")
	private int fileSize;

	@Column(name="file_type")
	private String fileType;

	//bi-directional many-to-one association to OhrmJobTitle
	@ManyToOne
	@JoinColumn(name="job_title_id")
	private OhrmJobTitle ohrmJobTitle;

	public OhrmJobSpecificationAttachment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public OhrmJobTitle getOhrmJobTitle() {
		return this.ohrmJobTitle;
	}

	public void setOhrmJobTitle(OhrmJobTitle ohrmJobTitle) {
		this.ohrmJobTitle = ohrmJobTitle;
	}

}