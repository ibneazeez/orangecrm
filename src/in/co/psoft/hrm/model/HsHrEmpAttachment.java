package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the hs_hr_emp_attachment database table.
 * 
 */
@Entity
@Table(name="hs_hr_emp_attachment")
@NamedQuery(name="HsHrEmpAttachment.findAll", query="SELECT h FROM HsHrEmpAttachment h")
public class HsHrEmpAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HsHrEmpAttachmentPK id;

	@Column(name="attached_by")
	private int attachedBy;

	@Column(name="attached_by_name")
	private String attachedByName;

	@Column(name="attached_time")
	private Timestamp attachedTime;

	@Lob
	@Column(name="eattach_attachment")
	private byte[] eattachAttachment;

	@Column(name="eattach_desc")
	private String eattachDesc;

	@Column(name="eattach_filename")
	private String eattachFilename;

	@Column(name="eattach_size")
	private int eattachSize;

	@Column(name="eattach_type")
	private String eattachType;

	private String screen;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	public HsHrEmpAttachment() {
	}

	public HsHrEmpAttachmentPK getId() {
		return this.id;
	}

	public void setId(HsHrEmpAttachmentPK id) {
		this.id = id;
	}

	public int getAttachedBy() {
		return this.attachedBy;
	}

	public void setAttachedBy(int attachedBy) {
		this.attachedBy = attachedBy;
	}

	public String getAttachedByName() {
		return this.attachedByName;
	}

	public void setAttachedByName(String attachedByName) {
		this.attachedByName = attachedByName;
	}

	public Timestamp getAttachedTime() {
		return this.attachedTime;
	}

	public void setAttachedTime(Timestamp attachedTime) {
		this.attachedTime = attachedTime;
	}

	public byte[] getEattachAttachment() {
		return this.eattachAttachment;
	}

	public void setEattachAttachment(byte[] eattachAttachment) {
		this.eattachAttachment = eattachAttachment;
	}

	public String getEattachDesc() {
		return this.eattachDesc;
	}

	public void setEattachDesc(String eattachDesc) {
		this.eattachDesc = eattachDesc;
	}

	public String getEattachFilename() {
		return this.eattachFilename;
	}

	public void setEattachFilename(String eattachFilename) {
		this.eattachFilename = eattachFilename;
	}

	public int getEattachSize() {
		return this.eattachSize;
	}

	public void setEattachSize(int eattachSize) {
		this.eattachSize = eattachSize;
	}

	public String getEattachType() {
		return this.eattachType;
	}

	public void setEattachType(String eattachType) {
		this.eattachType = eattachType;
	}

	public String getScreen() {
		return this.screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

}