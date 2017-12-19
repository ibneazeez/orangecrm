package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the hs_hr_employee database table.
 * 
 */
@Entity
@Table(name="hs_hr_employee")
@NamedQuery(name="HsHrEmployee.findAll", query="SELECT h FROM HsHrEmployee h")
public class HsHrEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_number")
	private int empNumber;

	@Column(name="city_code")
	private String cityCode;

	@Column(name="coun_code")
	private String counCode;

	private String custom1;

	private String custom10;

	private String custom2;

	private String custom3;

	private String custom4;

	private String custom5;

	private String custom6;

	private String custom7;

	private String custom8;

	private String custom9;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_birthday")
	private Date empBirthday;

	@Temporal(TemporalType.DATE)
	@Column(name="emp_dri_lice_exp_date")
	private Date empDriLiceExpDate;

	@Column(name="emp_dri_lice_num")
	private String empDriLiceNum;

	@Column(name="emp_firstname")
	private String empFirstname;

	@Column(name="emp_gender")
	private short empGender;

	@Column(name="emp_hm_telephone")
	private String empHmTelephone;

	@Column(name="emp_lastname")
	private String empLastname;

	@Column(name="emp_marital_status")
	private String empMaritalStatus;

	@Column(name="emp_middle_name")
	private String empMiddleName;

	@Column(name="emp_military_service")
	private String empMilitaryService;

	@Column(name="emp_mobile")
	private String empMobile;

	@Column(name="emp_nick_name")
	private String empNickName;

	@Column(name="emp_oth_email")
	private String empOthEmail;

	@Column(name="emp_other_id")
	private String empOtherId;

	@Column(name="emp_sin_num")
	private String empSinNum;

	@Column(name="emp_smoker")
	private short empSmoker;

	@Column(name="emp_ssn_num")
	private String empSsnNum;

	@Column(name="emp_street1")
	private String empStreet1;

	@Column(name="emp_street2")
	private String empStreet2;

	@Column(name="emp_work_email")
	private String empWorkEmail;

	@Column(name="emp_work_telephone")
	private String empWorkTelephone;

	@Column(name="emp_zipcode")
	private String empZipcode;

	@Column(name="employee_id")
	private String employeeId;

	@Column(name="ethnic_race_code")
	private String ethnicRaceCode;

	@Temporal(TemporalType.DATE)
	@Column(name="joined_date")
	private Date joinedDate;

	@Column(name="provin_code")
	private String provinCode;

	@Column(name="sal_grd_code")
	private String salGrdCode;

	//bi-directional many-to-one association to HsHrEmpAttachment
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpAttachment> hsHrEmpAttachments;

	//bi-directional many-to-one association to HsHrEmpBasicsalary
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpBasicsalary> hsHrEmpBasicsalaries;

	//bi-directional many-to-one association to HsHrEmpChildren
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpChildren> hsHrEmpChildrens;

	//bi-directional many-to-one association to HsHrEmpContractExtend
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpContractExtend> hsHrEmpContractExtends;

	//bi-directional many-to-one association to HsHrEmpDependent
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpDependent> hsHrEmpDependents;

	//bi-directional many-to-one association to HsHrEmpEmergencyContact
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpEmergencyContact> hsHrEmpEmergencyContacts;

	//bi-directional many-to-one association to HsHrEmpHistoryOfEalierPo
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpHistoryOfEalierPo> hsHrEmpHistoryOfEalierPos;

	//bi-directional many-to-one association to HsHrEmpLanguage
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpLanguage> hsHrEmpLanguages;

	//bi-directional many-to-many association to OhrmLocation
	@ManyToMany
	@JoinTable(
		name="hs_hr_emp_locations"
		, joinColumns={
			@JoinColumn(name="emp_number")
			}
		, inverseJoinColumns={
			@JoinColumn(name="location_id")
			}
		)
	private List<OhrmLocation> ohrmLocations;

	//bi-directional many-to-one association to HsHrEmpMemberDetail
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpMemberDetail> hsHrEmpMemberDetails;

	//bi-directional many-to-one association to HsHrEmpPassport
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpPassport> hsHrEmpPassports;

	//bi-directional one-to-one association to HsHrEmpPicture
	@OneToOne(mappedBy="hsHrEmployee")
	private HsHrEmpPicture hsHrEmpPicture;

	//bi-directional many-to-one association to HsHrEmpReportto
	@OneToMany(mappedBy="hsHrEmployee1")
	private List<HsHrEmpReportto> hsHrEmpReporttos1;

	//bi-directional many-to-one association to HsHrEmpReportto
	@OneToMany(mappedBy="hsHrEmployee2")
	private List<HsHrEmpReportto> hsHrEmpReporttos2;

	//bi-directional many-to-one association to HsHrEmpSkill
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpSkill> hsHrEmpSkills;

	//bi-directional one-to-one association to HsHrEmpUsTax
	@OneToOne(mappedBy="hsHrEmployee")
	private HsHrEmpUsTax hsHrEmpUsTax;

	//bi-directional many-to-one association to HsHrEmpWorkExperience
	@OneToMany(mappedBy="hsHrEmployee")
	private List<HsHrEmpWorkExperience> hsHrEmpWorkExperiences;

	//bi-directional many-to-one association to OhrmSubunit
	@ManyToOne
	@JoinColumn(name="work_station")
	private OhrmSubunit ohrmSubunit;

	//bi-directional many-to-one association to OhrmNationality
	@ManyToOne
	@JoinColumn(name="nation_code")
	private OhrmNationality ohrmNationality;

	//bi-directional many-to-one association to OhrmJobTitle
	@ManyToOne
	@JoinColumn(name="job_title_code")
	private OhrmJobTitle ohrmJobTitle;

	//bi-directional many-to-one association to OhrmEmploymentStatus
	@ManyToOne
	@JoinColumn(name="emp_status")
	private OhrmEmploymentStatus ohrmEmploymentStatus;

	//bi-directional many-to-one association to OhrmJobCategory
	@ManyToOne
	@JoinColumn(name="eeo_cat_code")
	private OhrmJobCategory ohrmJobCategory;

	//bi-directional many-to-one association to OhrmEmpTermination
	@ManyToOne
	@JoinColumn(name="termination_id")
	private OhrmEmpTermination ohrmEmpTermination;

	//bi-directional many-to-one association to OhrmEmpEducation
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmEmpEducation> ohrmEmpEducations;

	//bi-directional many-to-one association to OhrmEmpLicense
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmEmpLicense> ohrmEmpLicenses;

	//bi-directional many-to-one association to OhrmEmpTermination
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmEmpTermination> ohrmEmpTerminations;

	//bi-directional many-to-many association to OhrmWorkShift
	@ManyToMany
	@JoinTable(
		name="ohrm_employee_work_shift"
		, joinColumns={
			@JoinColumn(name="emp_number")
			}
		, inverseJoinColumns={
			@JoinColumn(name="work_shift_id")
			}
		)
	private List<OhrmWorkShift> ohrmWorkShifts;

	//bi-directional many-to-one association to OhrmJobCandidate
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmJobCandidate> ohrmJobCandidates;

	//bi-directional many-to-one association to OhrmJobCandidateHistory
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmJobCandidateHistory> ohrmJobCandidateHistories;

	//bi-directional many-to-many association to OhrmJobInterview
	@ManyToMany
	@JoinTable(
		name="ohrm_job_interview_interviewer"
		, joinColumns={
			@JoinColumn(name="interviewer_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="interview_id")
			}
		)
	private List<OhrmJobInterview> ohrmJobInterviews;

	//bi-directional many-to-one association to OhrmJobVacancy
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmJobVacancy> ohrmJobVacancies;

	//bi-directional many-to-one association to OhrmLeaveAdjustment
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmLeaveAdjustment> ohrmLeaveAdjustments;

	//bi-directional many-to-one association to OhrmLeaveComment
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmLeaveComment> ohrmLeaveComments;

	//bi-directional many-to-one association to OhrmLeaveEntitlement
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmLeaveEntitlement> ohrmLeaveEntitlements;

	//bi-directional many-to-one association to OhrmLeaveRequest
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmLeaveRequest> ohrmLeaveRequests;

	//bi-directional many-to-one association to OhrmLeaveRequestComment
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmLeaveRequestComment> ohrmLeaveRequestComments;

	//bi-directional many-to-one association to OhrmPerformanceReview
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmPerformanceReview> ohrmPerformanceReviews;

	//bi-directional many-to-one association to OhrmPerformanceTrack
	@OneToMany(mappedBy="hsHrEmployee1")
	private List<OhrmPerformanceTrack> ohrmPerformanceTracks1;

	//bi-directional many-to-one association to OhrmPerformanceTrack
	@OneToMany(mappedBy="hsHrEmployee2")
	private List<OhrmPerformanceTrack> ohrmPerformanceTracks2;

	//bi-directional many-to-one association to OhrmPerformanceTrackerLog
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmPerformanceTrackerLog> ohrmPerformanceTrackerLogs;

	//bi-directional many-to-one association to OhrmPerformanceTrackerReviewer
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmPerformanceTrackerReviewer> ohrmPerformanceTrackerReviewers;

	//bi-directional many-to-one association to OhrmUser
	@OneToMany(mappedBy="hsHrEmployee")
	private List<OhrmUser> ohrmUsers;

	public HsHrEmployee() {
	}

	public int getEmpNumber() {
		return this.empNumber;
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCounCode() {
		return this.counCode;
	}

	public void setCounCode(String counCode) {
		this.counCode = counCode;
	}

	public String getCustom1() {
		return this.custom1;
	}

	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}

	public String getCustom10() {
		return this.custom10;
	}

	public void setCustom10(String custom10) {
		this.custom10 = custom10;
	}

	public String getCustom2() {
		return this.custom2;
	}

	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}

	public String getCustom3() {
		return this.custom3;
	}

	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}

	public String getCustom4() {
		return this.custom4;
	}

	public void setCustom4(String custom4) {
		this.custom4 = custom4;
	}

	public String getCustom5() {
		return this.custom5;
	}

	public void setCustom5(String custom5) {
		this.custom5 = custom5;
	}

	public String getCustom6() {
		return this.custom6;
	}

	public void setCustom6(String custom6) {
		this.custom6 = custom6;
	}

	public String getCustom7() {
		return this.custom7;
	}

	public void setCustom7(String custom7) {
		this.custom7 = custom7;
	}

	public String getCustom8() {
		return this.custom8;
	}

	public void setCustom8(String custom8) {
		this.custom8 = custom8;
	}

	public String getCustom9() {
		return this.custom9;
	}

	public void setCustom9(String custom9) {
		this.custom9 = custom9;
	}

	public Date getEmpBirthday() {
		return this.empBirthday;
	}

	public void setEmpBirthday(Date empBirthday) {
		this.empBirthday = empBirthday;
	}

	public Date getEmpDriLiceExpDate() {
		return this.empDriLiceExpDate;
	}

	public void setEmpDriLiceExpDate(Date empDriLiceExpDate) {
		this.empDriLiceExpDate = empDriLiceExpDate;
	}

	public String getEmpDriLiceNum() {
		return this.empDriLiceNum;
	}

	public void setEmpDriLiceNum(String empDriLiceNum) {
		this.empDriLiceNum = empDriLiceNum;
	}

	public String getEmpFirstname() {
		return this.empFirstname;
	}

	public void setEmpFirstname(String empFirstname) {
		this.empFirstname = empFirstname;
	}

	public short getEmpGender() {
		return this.empGender;
	}

	public void setEmpGender(short empGender) {
		this.empGender = empGender;
	}

	public String getEmpHmTelephone() {
		return this.empHmTelephone;
	}

	public void setEmpHmTelephone(String empHmTelephone) {
		this.empHmTelephone = empHmTelephone;
	}

	public String getEmpLastname() {
		return this.empLastname;
	}

	public void setEmpLastname(String empLastname) {
		this.empLastname = empLastname;
	}

	public String getEmpMaritalStatus() {
		return this.empMaritalStatus;
	}

	public void setEmpMaritalStatus(String empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}

	public String getEmpMiddleName() {
		return this.empMiddleName;
	}

	public void setEmpMiddleName(String empMiddleName) {
		this.empMiddleName = empMiddleName;
	}

	public String getEmpMilitaryService() {
		return this.empMilitaryService;
	}

	public void setEmpMilitaryService(String empMilitaryService) {
		this.empMilitaryService = empMilitaryService;
	}

	public String getEmpMobile() {
		return this.empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpNickName() {
		return this.empNickName;
	}

	public void setEmpNickName(String empNickName) {
		this.empNickName = empNickName;
	}

	public String getEmpOthEmail() {
		return this.empOthEmail;
	}

	public void setEmpOthEmail(String empOthEmail) {
		this.empOthEmail = empOthEmail;
	}

	public String getEmpOtherId() {
		return this.empOtherId;
	}

	public void setEmpOtherId(String empOtherId) {
		this.empOtherId = empOtherId;
	}

	public String getEmpSinNum() {
		return this.empSinNum;
	}

	public void setEmpSinNum(String empSinNum) {
		this.empSinNum = empSinNum;
	}

	public short getEmpSmoker() {
		return this.empSmoker;
	}

	public void setEmpSmoker(short empSmoker) {
		this.empSmoker = empSmoker;
	}

	public String getEmpSsnNum() {
		return this.empSsnNum;
	}

	public void setEmpSsnNum(String empSsnNum) {
		this.empSsnNum = empSsnNum;
	}

	public String getEmpStreet1() {
		return this.empStreet1;
	}

	public void setEmpStreet1(String empStreet1) {
		this.empStreet1 = empStreet1;
	}

	public String getEmpStreet2() {
		return this.empStreet2;
	}

	public void setEmpStreet2(String empStreet2) {
		this.empStreet2 = empStreet2;
	}

	public String getEmpWorkEmail() {
		return this.empWorkEmail;
	}

	public void setEmpWorkEmail(String empWorkEmail) {
		this.empWorkEmail = empWorkEmail;
	}

	public String getEmpWorkTelephone() {
		return this.empWorkTelephone;
	}

	public void setEmpWorkTelephone(String empWorkTelephone) {
		this.empWorkTelephone = empWorkTelephone;
	}

	public String getEmpZipcode() {
		return this.empZipcode;
	}

	public void setEmpZipcode(String empZipcode) {
		this.empZipcode = empZipcode;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEthnicRaceCode() {
		return this.ethnicRaceCode;
	}

	public void setEthnicRaceCode(String ethnicRaceCode) {
		this.ethnicRaceCode = ethnicRaceCode;
	}

	public Date getJoinedDate() {
		return this.joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getProvinCode() {
		return this.provinCode;
	}

	public void setProvinCode(String provinCode) {
		this.provinCode = provinCode;
	}

	public String getSalGrdCode() {
		return this.salGrdCode;
	}

	public void setSalGrdCode(String salGrdCode) {
		this.salGrdCode = salGrdCode;
	}

	public List<HsHrEmpAttachment> getHsHrEmpAttachments() {
		return this.hsHrEmpAttachments;
	}

	public void setHsHrEmpAttachments(List<HsHrEmpAttachment> hsHrEmpAttachments) {
		this.hsHrEmpAttachments = hsHrEmpAttachments;
	}

	public HsHrEmpAttachment addHsHrEmpAttachment(HsHrEmpAttachment hsHrEmpAttachment) {
		getHsHrEmpAttachments().add(hsHrEmpAttachment);
		hsHrEmpAttachment.setHsHrEmployee(this);

		return hsHrEmpAttachment;
	}

	public HsHrEmpAttachment removeHsHrEmpAttachment(HsHrEmpAttachment hsHrEmpAttachment) {
		getHsHrEmpAttachments().remove(hsHrEmpAttachment);
		hsHrEmpAttachment.setHsHrEmployee(null);

		return hsHrEmpAttachment;
	}

	public List<HsHrEmpBasicsalary> getHsHrEmpBasicsalaries() {
		return this.hsHrEmpBasicsalaries;
	}

	public void setHsHrEmpBasicsalaries(List<HsHrEmpBasicsalary> hsHrEmpBasicsalaries) {
		this.hsHrEmpBasicsalaries = hsHrEmpBasicsalaries;
	}

	public HsHrEmpBasicsalary addHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		getHsHrEmpBasicsalaries().add(hsHrEmpBasicsalary);
		hsHrEmpBasicsalary.setHsHrEmployee(this);

		return hsHrEmpBasicsalary;
	}

	public HsHrEmpBasicsalary removeHsHrEmpBasicsalary(HsHrEmpBasicsalary hsHrEmpBasicsalary) {
		getHsHrEmpBasicsalaries().remove(hsHrEmpBasicsalary);
		hsHrEmpBasicsalary.setHsHrEmployee(null);

		return hsHrEmpBasicsalary;
	}

	public List<HsHrEmpChildren> getHsHrEmpChildrens() {
		return this.hsHrEmpChildrens;
	}

	public void setHsHrEmpChildrens(List<HsHrEmpChildren> hsHrEmpChildrens) {
		this.hsHrEmpChildrens = hsHrEmpChildrens;
	}

	public HsHrEmpChildren addHsHrEmpChildren(HsHrEmpChildren hsHrEmpChildren) {
		getHsHrEmpChildrens().add(hsHrEmpChildren);
		hsHrEmpChildren.setHsHrEmployee(this);

		return hsHrEmpChildren;
	}

	public HsHrEmpChildren removeHsHrEmpChildren(HsHrEmpChildren hsHrEmpChildren) {
		getHsHrEmpChildrens().remove(hsHrEmpChildren);
		hsHrEmpChildren.setHsHrEmployee(null);

		return hsHrEmpChildren;
	}

	public List<HsHrEmpContractExtend> getHsHrEmpContractExtends() {
		return this.hsHrEmpContractExtends;
	}

	public void setHsHrEmpContractExtends(List<HsHrEmpContractExtend> hsHrEmpContractExtends) {
		this.hsHrEmpContractExtends = hsHrEmpContractExtends;
	}

	public HsHrEmpContractExtend addHsHrEmpContractExtend(HsHrEmpContractExtend hsHrEmpContractExtend) {
		getHsHrEmpContractExtends().add(hsHrEmpContractExtend);
		hsHrEmpContractExtend.setHsHrEmployee(this);

		return hsHrEmpContractExtend;
	}

	public HsHrEmpContractExtend removeHsHrEmpContractExtend(HsHrEmpContractExtend hsHrEmpContractExtend) {
		getHsHrEmpContractExtends().remove(hsHrEmpContractExtend);
		hsHrEmpContractExtend.setHsHrEmployee(null);

		return hsHrEmpContractExtend;
	}

	public List<HsHrEmpDependent> getHsHrEmpDependents() {
		return this.hsHrEmpDependents;
	}

	public void setHsHrEmpDependents(List<HsHrEmpDependent> hsHrEmpDependents) {
		this.hsHrEmpDependents = hsHrEmpDependents;
	}

	public HsHrEmpDependent addHsHrEmpDependent(HsHrEmpDependent hsHrEmpDependent) {
		getHsHrEmpDependents().add(hsHrEmpDependent);
		hsHrEmpDependent.setHsHrEmployee(this);

		return hsHrEmpDependent;
	}

	public HsHrEmpDependent removeHsHrEmpDependent(HsHrEmpDependent hsHrEmpDependent) {
		getHsHrEmpDependents().remove(hsHrEmpDependent);
		hsHrEmpDependent.setHsHrEmployee(null);

		return hsHrEmpDependent;
	}

	public List<HsHrEmpEmergencyContact> getHsHrEmpEmergencyContacts() {
		return this.hsHrEmpEmergencyContacts;
	}

	public void setHsHrEmpEmergencyContacts(List<HsHrEmpEmergencyContact> hsHrEmpEmergencyContacts) {
		this.hsHrEmpEmergencyContacts = hsHrEmpEmergencyContacts;
	}

	public HsHrEmpEmergencyContact addHsHrEmpEmergencyContact(HsHrEmpEmergencyContact hsHrEmpEmergencyContact) {
		getHsHrEmpEmergencyContacts().add(hsHrEmpEmergencyContact);
		hsHrEmpEmergencyContact.setHsHrEmployee(this);

		return hsHrEmpEmergencyContact;
	}

	public HsHrEmpEmergencyContact removeHsHrEmpEmergencyContact(HsHrEmpEmergencyContact hsHrEmpEmergencyContact) {
		getHsHrEmpEmergencyContacts().remove(hsHrEmpEmergencyContact);
		hsHrEmpEmergencyContact.setHsHrEmployee(null);

		return hsHrEmpEmergencyContact;
	}

	public List<HsHrEmpHistoryOfEalierPo> getHsHrEmpHistoryOfEalierPos() {
		return this.hsHrEmpHistoryOfEalierPos;
	}

	public void setHsHrEmpHistoryOfEalierPos(List<HsHrEmpHistoryOfEalierPo> hsHrEmpHistoryOfEalierPos) {
		this.hsHrEmpHistoryOfEalierPos = hsHrEmpHistoryOfEalierPos;
	}

	public HsHrEmpHistoryOfEalierPo addHsHrEmpHistoryOfEalierPo(HsHrEmpHistoryOfEalierPo hsHrEmpHistoryOfEalierPo) {
		getHsHrEmpHistoryOfEalierPos().add(hsHrEmpHistoryOfEalierPo);
		hsHrEmpHistoryOfEalierPo.setHsHrEmployee(this);

		return hsHrEmpHistoryOfEalierPo;
	}

	public HsHrEmpHistoryOfEalierPo removeHsHrEmpHistoryOfEalierPo(HsHrEmpHistoryOfEalierPo hsHrEmpHistoryOfEalierPo) {
		getHsHrEmpHistoryOfEalierPos().remove(hsHrEmpHistoryOfEalierPo);
		hsHrEmpHistoryOfEalierPo.setHsHrEmployee(null);

		return hsHrEmpHistoryOfEalierPo;
	}

	public List<HsHrEmpLanguage> getHsHrEmpLanguages() {
		return this.hsHrEmpLanguages;
	}

	public void setHsHrEmpLanguages(List<HsHrEmpLanguage> hsHrEmpLanguages) {
		this.hsHrEmpLanguages = hsHrEmpLanguages;
	}

	public HsHrEmpLanguage addHsHrEmpLanguage(HsHrEmpLanguage hsHrEmpLanguage) {
		getHsHrEmpLanguages().add(hsHrEmpLanguage);
		hsHrEmpLanguage.setHsHrEmployee(this);

		return hsHrEmpLanguage;
	}

	public HsHrEmpLanguage removeHsHrEmpLanguage(HsHrEmpLanguage hsHrEmpLanguage) {
		getHsHrEmpLanguages().remove(hsHrEmpLanguage);
		hsHrEmpLanguage.setHsHrEmployee(null);

		return hsHrEmpLanguage;
	}

	public List<OhrmLocation> getOhrmLocations() {
		return this.ohrmLocations;
	}

	public void setOhrmLocations(List<OhrmLocation> ohrmLocations) {
		this.ohrmLocations = ohrmLocations;
	}

	public List<HsHrEmpMemberDetail> getHsHrEmpMemberDetails() {
		return this.hsHrEmpMemberDetails;
	}

	public void setHsHrEmpMemberDetails(List<HsHrEmpMemberDetail> hsHrEmpMemberDetails) {
		this.hsHrEmpMemberDetails = hsHrEmpMemberDetails;
	}

	public HsHrEmpMemberDetail addHsHrEmpMemberDetail(HsHrEmpMemberDetail hsHrEmpMemberDetail) {
		getHsHrEmpMemberDetails().add(hsHrEmpMemberDetail);
		hsHrEmpMemberDetail.setHsHrEmployee(this);

		return hsHrEmpMemberDetail;
	}

	public HsHrEmpMemberDetail removeHsHrEmpMemberDetail(HsHrEmpMemberDetail hsHrEmpMemberDetail) {
		getHsHrEmpMemberDetails().remove(hsHrEmpMemberDetail);
		hsHrEmpMemberDetail.setHsHrEmployee(null);

		return hsHrEmpMemberDetail;
	}

	public List<HsHrEmpPassport> getHsHrEmpPassports() {
		return this.hsHrEmpPassports;
	}

	public void setHsHrEmpPassports(List<HsHrEmpPassport> hsHrEmpPassports) {
		this.hsHrEmpPassports = hsHrEmpPassports;
	}

	public HsHrEmpPassport addHsHrEmpPassport(HsHrEmpPassport hsHrEmpPassport) {
		getHsHrEmpPassports().add(hsHrEmpPassport);
		hsHrEmpPassport.setHsHrEmployee(this);

		return hsHrEmpPassport;
	}

	public HsHrEmpPassport removeHsHrEmpPassport(HsHrEmpPassport hsHrEmpPassport) {
		getHsHrEmpPassports().remove(hsHrEmpPassport);
		hsHrEmpPassport.setHsHrEmployee(null);

		return hsHrEmpPassport;
	}

	public HsHrEmpPicture getHsHrEmpPicture() {
		return this.hsHrEmpPicture;
	}

	public void setHsHrEmpPicture(HsHrEmpPicture hsHrEmpPicture) {
		this.hsHrEmpPicture = hsHrEmpPicture;
	}

	public List<HsHrEmpReportto> getHsHrEmpReporttos1() {
		return this.hsHrEmpReporttos1;
	}

	public void setHsHrEmpReporttos1(List<HsHrEmpReportto> hsHrEmpReporttos1) {
		this.hsHrEmpReporttos1 = hsHrEmpReporttos1;
	}

	public HsHrEmpReportto addHsHrEmpReporttos1(HsHrEmpReportto hsHrEmpReporttos1) {
		getHsHrEmpReporttos1().add(hsHrEmpReporttos1);
		hsHrEmpReporttos1.setHsHrEmployee1(this);

		return hsHrEmpReporttos1;
	}

	public HsHrEmpReportto removeHsHrEmpReporttos1(HsHrEmpReportto hsHrEmpReporttos1) {
		getHsHrEmpReporttos1().remove(hsHrEmpReporttos1);
		hsHrEmpReporttos1.setHsHrEmployee1(null);

		return hsHrEmpReporttos1;
	}

	public List<HsHrEmpReportto> getHsHrEmpReporttos2() {
		return this.hsHrEmpReporttos2;
	}

	public void setHsHrEmpReporttos2(List<HsHrEmpReportto> hsHrEmpReporttos2) {
		this.hsHrEmpReporttos2 = hsHrEmpReporttos2;
	}

	public HsHrEmpReportto addHsHrEmpReporttos2(HsHrEmpReportto hsHrEmpReporttos2) {
		getHsHrEmpReporttos2().add(hsHrEmpReporttos2);
		hsHrEmpReporttos2.setHsHrEmployee2(this);

		return hsHrEmpReporttos2;
	}

	public HsHrEmpReportto removeHsHrEmpReporttos2(HsHrEmpReportto hsHrEmpReporttos2) {
		getHsHrEmpReporttos2().remove(hsHrEmpReporttos2);
		hsHrEmpReporttos2.setHsHrEmployee2(null);

		return hsHrEmpReporttos2;
	}

	public List<HsHrEmpSkill> getHsHrEmpSkills() {
		return this.hsHrEmpSkills;
	}

	public void setHsHrEmpSkills(List<HsHrEmpSkill> hsHrEmpSkills) {
		this.hsHrEmpSkills = hsHrEmpSkills;
	}

	public HsHrEmpSkill addHsHrEmpSkill(HsHrEmpSkill hsHrEmpSkill) {
		getHsHrEmpSkills().add(hsHrEmpSkill);
		hsHrEmpSkill.setHsHrEmployee(this);

		return hsHrEmpSkill;
	}

	public HsHrEmpSkill removeHsHrEmpSkill(HsHrEmpSkill hsHrEmpSkill) {
		getHsHrEmpSkills().remove(hsHrEmpSkill);
		hsHrEmpSkill.setHsHrEmployee(null);

		return hsHrEmpSkill;
	}

	public HsHrEmpUsTax getHsHrEmpUsTax() {
		return this.hsHrEmpUsTax;
	}

	public void setHsHrEmpUsTax(HsHrEmpUsTax hsHrEmpUsTax) {
		this.hsHrEmpUsTax = hsHrEmpUsTax;
	}

	public List<HsHrEmpWorkExperience> getHsHrEmpWorkExperiences() {
		return this.hsHrEmpWorkExperiences;
	}

	public void setHsHrEmpWorkExperiences(List<HsHrEmpWorkExperience> hsHrEmpWorkExperiences) {
		this.hsHrEmpWorkExperiences = hsHrEmpWorkExperiences;
	}

	public HsHrEmpWorkExperience addHsHrEmpWorkExperience(HsHrEmpWorkExperience hsHrEmpWorkExperience) {
		getHsHrEmpWorkExperiences().add(hsHrEmpWorkExperience);
		hsHrEmpWorkExperience.setHsHrEmployee(this);

		return hsHrEmpWorkExperience;
	}

	public HsHrEmpWorkExperience removeHsHrEmpWorkExperience(HsHrEmpWorkExperience hsHrEmpWorkExperience) {
		getHsHrEmpWorkExperiences().remove(hsHrEmpWorkExperience);
		hsHrEmpWorkExperience.setHsHrEmployee(null);

		return hsHrEmpWorkExperience;
	}

	public OhrmSubunit getOhrmSubunit() {
		return this.ohrmSubunit;
	}

	public void setOhrmSubunit(OhrmSubunit ohrmSubunit) {
		this.ohrmSubunit = ohrmSubunit;
	}

	public OhrmNationality getOhrmNationality() {
		return this.ohrmNationality;
	}

	public void setOhrmNationality(OhrmNationality ohrmNationality) {
		this.ohrmNationality = ohrmNationality;
	}

	public OhrmJobTitle getOhrmJobTitle() {
		return this.ohrmJobTitle;
	}

	public void setOhrmJobTitle(OhrmJobTitle ohrmJobTitle) {
		this.ohrmJobTitle = ohrmJobTitle;
	}

	public OhrmEmploymentStatus getOhrmEmploymentStatus() {
		return this.ohrmEmploymentStatus;
	}

	public void setOhrmEmploymentStatus(OhrmEmploymentStatus ohrmEmploymentStatus) {
		this.ohrmEmploymentStatus = ohrmEmploymentStatus;
	}

	public OhrmJobCategory getOhrmJobCategory() {
		return this.ohrmJobCategory;
	}

	public void setOhrmJobCategory(OhrmJobCategory ohrmJobCategory) {
		this.ohrmJobCategory = ohrmJobCategory;
	}

	public OhrmEmpTermination getOhrmEmpTermination() {
		return this.ohrmEmpTermination;
	}

	public void setOhrmEmpTermination(OhrmEmpTermination ohrmEmpTermination) {
		this.ohrmEmpTermination = ohrmEmpTermination;
	}

	public List<OhrmEmpEducation> getOhrmEmpEducations() {
		return this.ohrmEmpEducations;
	}

	public void setOhrmEmpEducations(List<OhrmEmpEducation> ohrmEmpEducations) {
		this.ohrmEmpEducations = ohrmEmpEducations;
	}

	public OhrmEmpEducation addOhrmEmpEducation(OhrmEmpEducation ohrmEmpEducation) {
		getOhrmEmpEducations().add(ohrmEmpEducation);
		ohrmEmpEducation.setHsHrEmployee(this);

		return ohrmEmpEducation;
	}

	public OhrmEmpEducation removeOhrmEmpEducation(OhrmEmpEducation ohrmEmpEducation) {
		getOhrmEmpEducations().remove(ohrmEmpEducation);
		ohrmEmpEducation.setHsHrEmployee(null);

		return ohrmEmpEducation;
	}

	public List<OhrmEmpLicense> getOhrmEmpLicenses() {
		return this.ohrmEmpLicenses;
	}

	public void setOhrmEmpLicenses(List<OhrmEmpLicense> ohrmEmpLicenses) {
		this.ohrmEmpLicenses = ohrmEmpLicenses;
	}

	public OhrmEmpLicense addOhrmEmpLicens(OhrmEmpLicense ohrmEmpLicens) {
		getOhrmEmpLicenses().add(ohrmEmpLicens);
		ohrmEmpLicens.setHsHrEmployee(this);

		return ohrmEmpLicens;
	}

	public OhrmEmpLicense removeOhrmEmpLicens(OhrmEmpLicense ohrmEmpLicens) {
		getOhrmEmpLicenses().remove(ohrmEmpLicens);
		ohrmEmpLicens.setHsHrEmployee(null);

		return ohrmEmpLicens;
	}

	public List<OhrmEmpTermination> getOhrmEmpTerminations() {
		return this.ohrmEmpTerminations;
	}

	public void setOhrmEmpTerminations(List<OhrmEmpTermination> ohrmEmpTerminations) {
		this.ohrmEmpTerminations = ohrmEmpTerminations;
	}

	public OhrmEmpTermination addOhrmEmpTermination(OhrmEmpTermination ohrmEmpTermination) {
		getOhrmEmpTerminations().add(ohrmEmpTermination);
		ohrmEmpTermination.setHsHrEmployee(this);

		return ohrmEmpTermination;
	}

	public OhrmEmpTermination removeOhrmEmpTermination(OhrmEmpTermination ohrmEmpTermination) {
		getOhrmEmpTerminations().remove(ohrmEmpTermination);
		ohrmEmpTermination.setHsHrEmployee(null);

		return ohrmEmpTermination;
	}

	public List<OhrmWorkShift> getOhrmWorkShifts() {
		return this.ohrmWorkShifts;
	}

	public void setOhrmWorkShifts(List<OhrmWorkShift> ohrmWorkShifts) {
		this.ohrmWorkShifts = ohrmWorkShifts;
	}

	public List<OhrmJobCandidate> getOhrmJobCandidates() {
		return this.ohrmJobCandidates;
	}

	public void setOhrmJobCandidates(List<OhrmJobCandidate> ohrmJobCandidates) {
		this.ohrmJobCandidates = ohrmJobCandidates;
	}

	public OhrmJobCandidate addOhrmJobCandidate(OhrmJobCandidate ohrmJobCandidate) {
		getOhrmJobCandidates().add(ohrmJobCandidate);
		ohrmJobCandidate.setHsHrEmployee(this);

		return ohrmJobCandidate;
	}

	public OhrmJobCandidate removeOhrmJobCandidate(OhrmJobCandidate ohrmJobCandidate) {
		getOhrmJobCandidates().remove(ohrmJobCandidate);
		ohrmJobCandidate.setHsHrEmployee(null);

		return ohrmJobCandidate;
	}

	public List<OhrmJobCandidateHistory> getOhrmJobCandidateHistories() {
		return this.ohrmJobCandidateHistories;
	}

	public void setOhrmJobCandidateHistories(List<OhrmJobCandidateHistory> ohrmJobCandidateHistories) {
		this.ohrmJobCandidateHistories = ohrmJobCandidateHistories;
	}

	public OhrmJobCandidateHistory addOhrmJobCandidateHistory(OhrmJobCandidateHistory ohrmJobCandidateHistory) {
		getOhrmJobCandidateHistories().add(ohrmJobCandidateHistory);
		ohrmJobCandidateHistory.setHsHrEmployee(this);

		return ohrmJobCandidateHistory;
	}

	public OhrmJobCandidateHistory removeOhrmJobCandidateHistory(OhrmJobCandidateHistory ohrmJobCandidateHistory) {
		getOhrmJobCandidateHistories().remove(ohrmJobCandidateHistory);
		ohrmJobCandidateHistory.setHsHrEmployee(null);

		return ohrmJobCandidateHistory;
	}

	public List<OhrmJobInterview> getOhrmJobInterviews() {
		return this.ohrmJobInterviews;
	}

	public void setOhrmJobInterviews(List<OhrmJobInterview> ohrmJobInterviews) {
		this.ohrmJobInterviews = ohrmJobInterviews;
	}

	public List<OhrmJobVacancy> getOhrmJobVacancies() {
		return this.ohrmJobVacancies;
	}

	public void setOhrmJobVacancies(List<OhrmJobVacancy> ohrmJobVacancies) {
		this.ohrmJobVacancies = ohrmJobVacancies;
	}

	public OhrmJobVacancy addOhrmJobVacancy(OhrmJobVacancy ohrmJobVacancy) {
		getOhrmJobVacancies().add(ohrmJobVacancy);
		ohrmJobVacancy.setHsHrEmployee(this);

		return ohrmJobVacancy;
	}

	public OhrmJobVacancy removeOhrmJobVacancy(OhrmJobVacancy ohrmJobVacancy) {
		getOhrmJobVacancies().remove(ohrmJobVacancy);
		ohrmJobVacancy.setHsHrEmployee(null);

		return ohrmJobVacancy;
	}

	public List<OhrmLeaveAdjustment> getOhrmLeaveAdjustments() {
		return this.ohrmLeaveAdjustments;
	}

	public void setOhrmLeaveAdjustments(List<OhrmLeaveAdjustment> ohrmLeaveAdjustments) {
		this.ohrmLeaveAdjustments = ohrmLeaveAdjustments;
	}

	public OhrmLeaveAdjustment addOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().add(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setHsHrEmployee(this);

		return ohrmLeaveAdjustment;
	}

	public OhrmLeaveAdjustment removeOhrmLeaveAdjustment(OhrmLeaveAdjustment ohrmLeaveAdjustment) {
		getOhrmLeaveAdjustments().remove(ohrmLeaveAdjustment);
		ohrmLeaveAdjustment.setHsHrEmployee(null);

		return ohrmLeaveAdjustment;
	}

	public List<OhrmLeaveComment> getOhrmLeaveComments() {
		return this.ohrmLeaveComments;
	}

	public void setOhrmLeaveComments(List<OhrmLeaveComment> ohrmLeaveComments) {
		this.ohrmLeaveComments = ohrmLeaveComments;
	}

	public OhrmLeaveComment addOhrmLeaveComment(OhrmLeaveComment ohrmLeaveComment) {
		getOhrmLeaveComments().add(ohrmLeaveComment);
		ohrmLeaveComment.setHsHrEmployee(this);

		return ohrmLeaveComment;
	}

	public OhrmLeaveComment removeOhrmLeaveComment(OhrmLeaveComment ohrmLeaveComment) {
		getOhrmLeaveComments().remove(ohrmLeaveComment);
		ohrmLeaveComment.setHsHrEmployee(null);

		return ohrmLeaveComment;
	}

	public List<OhrmLeaveEntitlement> getOhrmLeaveEntitlements() {
		return this.ohrmLeaveEntitlements;
	}

	public void setOhrmLeaveEntitlements(List<OhrmLeaveEntitlement> ohrmLeaveEntitlements) {
		this.ohrmLeaveEntitlements = ohrmLeaveEntitlements;
	}

	public OhrmLeaveEntitlement addOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().add(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setHsHrEmployee(this);

		return ohrmLeaveEntitlement;
	}

	public OhrmLeaveEntitlement removeOhrmLeaveEntitlement(OhrmLeaveEntitlement ohrmLeaveEntitlement) {
		getOhrmLeaveEntitlements().remove(ohrmLeaveEntitlement);
		ohrmLeaveEntitlement.setHsHrEmployee(null);

		return ohrmLeaveEntitlement;
	}

	public List<OhrmLeaveRequest> getOhrmLeaveRequests() {
		return this.ohrmLeaveRequests;
	}

	public void setOhrmLeaveRequests(List<OhrmLeaveRequest> ohrmLeaveRequests) {
		this.ohrmLeaveRequests = ohrmLeaveRequests;
	}

	public OhrmLeaveRequest addOhrmLeaveRequest(OhrmLeaveRequest ohrmLeaveRequest) {
		getOhrmLeaveRequests().add(ohrmLeaveRequest);
		ohrmLeaveRequest.setHsHrEmployee(this);

		return ohrmLeaveRequest;
	}

	public OhrmLeaveRequest removeOhrmLeaveRequest(OhrmLeaveRequest ohrmLeaveRequest) {
		getOhrmLeaveRequests().remove(ohrmLeaveRequest);
		ohrmLeaveRequest.setHsHrEmployee(null);

		return ohrmLeaveRequest;
	}

	public List<OhrmLeaveRequestComment> getOhrmLeaveRequestComments() {
		return this.ohrmLeaveRequestComments;
	}

	public void setOhrmLeaveRequestComments(List<OhrmLeaveRequestComment> ohrmLeaveRequestComments) {
		this.ohrmLeaveRequestComments = ohrmLeaveRequestComments;
	}

	public OhrmLeaveRequestComment addOhrmLeaveRequestComment(OhrmLeaveRequestComment ohrmLeaveRequestComment) {
		getOhrmLeaveRequestComments().add(ohrmLeaveRequestComment);
		ohrmLeaveRequestComment.setHsHrEmployee(this);

		return ohrmLeaveRequestComment;
	}

	public OhrmLeaveRequestComment removeOhrmLeaveRequestComment(OhrmLeaveRequestComment ohrmLeaveRequestComment) {
		getOhrmLeaveRequestComments().remove(ohrmLeaveRequestComment);
		ohrmLeaveRequestComment.setHsHrEmployee(null);

		return ohrmLeaveRequestComment;
	}

	public List<OhrmPerformanceReview> getOhrmPerformanceReviews() {
		return this.ohrmPerformanceReviews;
	}

	public void setOhrmPerformanceReviews(List<OhrmPerformanceReview> ohrmPerformanceReviews) {
		this.ohrmPerformanceReviews = ohrmPerformanceReviews;
	}

	public OhrmPerformanceReview addOhrmPerformanceReview(OhrmPerformanceReview ohrmPerformanceReview) {
		getOhrmPerformanceReviews().add(ohrmPerformanceReview);
		ohrmPerformanceReview.setHsHrEmployee(this);

		return ohrmPerformanceReview;
	}

	public OhrmPerformanceReview removeOhrmPerformanceReview(OhrmPerformanceReview ohrmPerformanceReview) {
		getOhrmPerformanceReviews().remove(ohrmPerformanceReview);
		ohrmPerformanceReview.setHsHrEmployee(null);

		return ohrmPerformanceReview;
	}

	public List<OhrmPerformanceTrack> getOhrmPerformanceTracks1() {
		return this.ohrmPerformanceTracks1;
	}

	public void setOhrmPerformanceTracks1(List<OhrmPerformanceTrack> ohrmPerformanceTracks1) {
		this.ohrmPerformanceTracks1 = ohrmPerformanceTracks1;
	}

	public OhrmPerformanceTrack addOhrmPerformanceTracks1(OhrmPerformanceTrack ohrmPerformanceTracks1) {
		getOhrmPerformanceTracks1().add(ohrmPerformanceTracks1);
		ohrmPerformanceTracks1.setHsHrEmployee1(this);

		return ohrmPerformanceTracks1;
	}

	public OhrmPerformanceTrack removeOhrmPerformanceTracks1(OhrmPerformanceTrack ohrmPerformanceTracks1) {
		getOhrmPerformanceTracks1().remove(ohrmPerformanceTracks1);
		ohrmPerformanceTracks1.setHsHrEmployee1(null);

		return ohrmPerformanceTracks1;
	}

	public List<OhrmPerformanceTrack> getOhrmPerformanceTracks2() {
		return this.ohrmPerformanceTracks2;
	}

	public void setOhrmPerformanceTracks2(List<OhrmPerformanceTrack> ohrmPerformanceTracks2) {
		this.ohrmPerformanceTracks2 = ohrmPerformanceTracks2;
	}

	public OhrmPerformanceTrack addOhrmPerformanceTracks2(OhrmPerformanceTrack ohrmPerformanceTracks2) {
		getOhrmPerformanceTracks2().add(ohrmPerformanceTracks2);
		ohrmPerformanceTracks2.setHsHrEmployee2(this);

		return ohrmPerformanceTracks2;
	}

	public OhrmPerformanceTrack removeOhrmPerformanceTracks2(OhrmPerformanceTrack ohrmPerformanceTracks2) {
		getOhrmPerformanceTracks2().remove(ohrmPerformanceTracks2);
		ohrmPerformanceTracks2.setHsHrEmployee2(null);

		return ohrmPerformanceTracks2;
	}

	public List<OhrmPerformanceTrackerLog> getOhrmPerformanceTrackerLogs() {
		return this.ohrmPerformanceTrackerLogs;
	}

	public void setOhrmPerformanceTrackerLogs(List<OhrmPerformanceTrackerLog> ohrmPerformanceTrackerLogs) {
		this.ohrmPerformanceTrackerLogs = ohrmPerformanceTrackerLogs;
	}

	public OhrmPerformanceTrackerLog addOhrmPerformanceTrackerLog(OhrmPerformanceTrackerLog ohrmPerformanceTrackerLog) {
		getOhrmPerformanceTrackerLogs().add(ohrmPerformanceTrackerLog);
		ohrmPerformanceTrackerLog.setHsHrEmployee(this);

		return ohrmPerformanceTrackerLog;
	}

	public OhrmPerformanceTrackerLog removeOhrmPerformanceTrackerLog(OhrmPerformanceTrackerLog ohrmPerformanceTrackerLog) {
		getOhrmPerformanceTrackerLogs().remove(ohrmPerformanceTrackerLog);
		ohrmPerformanceTrackerLog.setHsHrEmployee(null);

		return ohrmPerformanceTrackerLog;
	}

	public List<OhrmPerformanceTrackerReviewer> getOhrmPerformanceTrackerReviewers() {
		return this.ohrmPerformanceTrackerReviewers;
	}

	public void setOhrmPerformanceTrackerReviewers(List<OhrmPerformanceTrackerReviewer> ohrmPerformanceTrackerReviewers) {
		this.ohrmPerformanceTrackerReviewers = ohrmPerformanceTrackerReviewers;
	}

	public OhrmPerformanceTrackerReviewer addOhrmPerformanceTrackerReviewer(OhrmPerformanceTrackerReviewer ohrmPerformanceTrackerReviewer) {
		getOhrmPerformanceTrackerReviewers().add(ohrmPerformanceTrackerReviewer);
		ohrmPerformanceTrackerReviewer.setHsHrEmployee(this);

		return ohrmPerformanceTrackerReviewer;
	}

	public OhrmPerformanceTrackerReviewer removeOhrmPerformanceTrackerReviewer(OhrmPerformanceTrackerReviewer ohrmPerformanceTrackerReviewer) {
		getOhrmPerformanceTrackerReviewers().remove(ohrmPerformanceTrackerReviewer);
		ohrmPerformanceTrackerReviewer.setHsHrEmployee(null);

		return ohrmPerformanceTrackerReviewer;
	}

	public List<OhrmUser> getOhrmUsers() {
		return this.ohrmUsers;
	}

	public void setOhrmUsers(List<OhrmUser> ohrmUsers) {
		this.ohrmUsers = ohrmUsers;
	}

	public OhrmUser addOhrmUser(OhrmUser ohrmUser) {
		getOhrmUsers().add(ohrmUser);
		ohrmUser.setHsHrEmployee(this);

		return ohrmUser;
	}

	public OhrmUser removeOhrmUser(OhrmUser ohrmUser) {
		getOhrmUsers().remove(ohrmUser);
		ohrmUser.setHsHrEmployee(null);

		return ohrmUser;
	}

}