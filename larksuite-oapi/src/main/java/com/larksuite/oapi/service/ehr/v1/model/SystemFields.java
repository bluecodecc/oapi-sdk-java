// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.ehr.v1.model;
import com.google.gson.annotations.SerializedName;

public class SystemFields {
    @SerializedName("name")
    private String name;
    @SerializedName("en_name")
    private String enName;
    @SerializedName("email")
    private String email;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("department_id")
    private String departmentId;
    @SerializedName("manager")
    private Manager manager;
    @SerializedName("job")
    private Job job;
    @SerializedName("job_level")
    private JobLevel jobLevel;
    @SerializedName("work_location")
    private WorkLocation workLocation;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("native_region")
    private NativeRegion nativeRegion;
    @SerializedName("ethnicity")
    private Integer ethnicity;
    @SerializedName("marital_status")
    private Integer maritalStatus;
    @SerializedName("political_status")
    private Integer politicalStatus;
    @SerializedName("entered_workforce_date")
    private String enteredWorkforceDate;
    @SerializedName("id_type")
    private Integer idType;
    @SerializedName("id_number")
    private String idNumber;
    @SerializedName("hukou_type")
    private Integer hukouType;
    @SerializedName("hukou_location")
    private String hukouLocation;
    @SerializedName("bank_account_number")
    private String bankAccountNumber;
    @SerializedName("bank_name")
    private String bankName;
    @SerializedName("social_security_account")
    private String socialSecurityAccount;
    @SerializedName("provident_fund_account")
    private String providentFundAccount;
    @SerializedName("employee_no")
    private String employeeNo;
    @SerializedName("employee_type")
    private Integer employeeType;
    @SerializedName("status")
    private Integer status;
    @SerializedName("hire_date")
    private String hireDate;
    @SerializedName("probation_months")
    private Double probationMonths;
    @SerializedName("conversion_date")
    private String conversionDate;
    @SerializedName("application")
    private Integer application;
    @SerializedName("application_status")
    private Integer applicationStatus;
    @SerializedName("last_day")
    private String lastDay;
    @SerializedName("departure_type")
    private Integer departureType;
    @SerializedName("departure_reason")
    private Integer departureReason;
    @SerializedName("departure_notes")
    private String departureNotes;
    @SerializedName("contract_company")
    private ContractCompany contractCompany;
    @SerializedName("contract_type")
    private Integer contractType;
    @SerializedName("contract_start_date")
    private String contractStartDate;
    @SerializedName("contract_expiration_date")
    private String contractExpirationDate;
    @SerializedName("contract_sign_times")
    private Integer contractSignTimes;
    @SerializedName("personal_email")
    private String personalEmail;
    @SerializedName("family_address")
    private String familyAddress;
    @SerializedName("primary_emergency_contact")
    private EmergencyContact primaryEmergencyContact;
    @SerializedName("emergency_contact")
    private EmergencyContact[] emergencyContact;
    @SerializedName("highest_level_of_edu")
    private Education highestLevelOfEdu;
    @SerializedName("education")
    private Education[] education;
    @SerializedName("former_work_exp")
    private WorkExperience formerWorkExp;
    @SerializedName("work_exp")
    private WorkExperience[] workExp;
    @SerializedName("id_photo_po_side")
    private Attachment[] idPhotoPoSide;
    @SerializedName("id_photo_em_side")
    private Attachment[] idPhotoEmSide;
    @SerializedName("id_photo")
    private Attachment[] idPhoto;
    @SerializedName("diploma_photo")
    private Attachment[] diplomaPhoto;
    @SerializedName("graduation_cert")
    private Attachment[] graduationCert;
    @SerializedName("cert_of_merit")
    private Attachment[] certOfMerit;
    @SerializedName("offboarding_file")
    private Attachment[] offboardingFile;
    @SerializedName("cancel_onboarding_reason")
    private Integer cancelOnboardingReason;
    @SerializedName("cancel_onboarding_notes")
    private String cancelOnboardingNotes;
    @SerializedName("employee_form_status")
    private Integer employeeFormStatus;
    @SerializedName("create_time")
    private Integer createTime;
    @SerializedName("update_time")
    private Integer updateTime;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Manager getManager() {
        return this.manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public JobLevel getJobLevel() {
        return this.jobLevel;
    }

    public void setJobLevel(JobLevel jobLevel) {
        this.jobLevel = jobLevel;
    }

    public WorkLocation getWorkLocation() {
        return this.workLocation;
    }

    public void setWorkLocation(WorkLocation workLocation) {
        this.workLocation = workLocation;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public NativeRegion getNativeRegion() {
        return this.nativeRegion;
    }

    public void setNativeRegion(NativeRegion nativeRegion) {
        this.nativeRegion = nativeRegion;
    }

    public Integer getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(Integer ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getPoliticalStatus() {
        return this.politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getEnteredWorkforceDate() {
        return this.enteredWorkforceDate;
    }

    public void setEnteredWorkforceDate(String enteredWorkforceDate) {
        this.enteredWorkforceDate = enteredWorkforceDate;
    }

    public Integer getIdType() {
        return this.idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getHukouType() {
        return this.hukouType;
    }

    public void setHukouType(Integer hukouType) {
        this.hukouType = hukouType;
    }

    public String getHukouLocation() {
        return this.hukouLocation;
    }

    public void setHukouLocation(String hukouLocation) {
        this.hukouLocation = hukouLocation;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getSocialSecurityAccount() {
        return this.socialSecurityAccount;
    }

    public void setSocialSecurityAccount(String socialSecurityAccount) {
        this.socialSecurityAccount = socialSecurityAccount;
    }

    public String getProvidentFundAccount() {
        return this.providentFundAccount;
    }

    public void setProvidentFundAccount(String providentFundAccount) {
        this.providentFundAccount = providentFundAccount;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Integer getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Double getProbationMonths() {
        return this.probationMonths;
    }

    public void setProbationMonths(Double probationMonths) {
        this.probationMonths = probationMonths;
    }

    public String getConversionDate() {
        return this.conversionDate;
    }

    public void setConversionDate(String conversionDate) {
        this.conversionDate = conversionDate;
    }

    public Integer getApplication() {
        return this.application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    public void setApplicationStatus(Integer applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getLastDay() {
        return this.lastDay;
    }

    public void setLastDay(String lastDay) {
        this.lastDay = lastDay;
    }

    public Integer getDepartureType() {
        return this.departureType;
    }

    public void setDepartureType(Integer departureType) {
        this.departureType = departureType;
    }

    public Integer getDepartureReason() {
        return this.departureReason;
    }

    public void setDepartureReason(Integer departureReason) {
        this.departureReason = departureReason;
    }

    public String getDepartureNotes() {
        return this.departureNotes;
    }

    public void setDepartureNotes(String departureNotes) {
        this.departureNotes = departureNotes;
    }

    public ContractCompany getContractCompany() {
        return this.contractCompany;
    }

    public void setContractCompany(ContractCompany contractCompany) {
        this.contractCompany = contractCompany;
    }

    public Integer getContractType() {
        return this.contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public String getContractStartDate() {
        return this.contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getContractExpirationDate() {
        return this.contractExpirationDate;
    }

    public void setContractExpirationDate(String contractExpirationDate) {
        this.contractExpirationDate = contractExpirationDate;
    }

    public Integer getContractSignTimes() {
        return this.contractSignTimes;
    }

    public void setContractSignTimes(Integer contractSignTimes) {
        this.contractSignTimes = contractSignTimes;
    }

    public String getPersonalEmail() {
        return this.personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getFamilyAddress() {
        return this.familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public EmergencyContact getPrimaryEmergencyContact() {
        return this.primaryEmergencyContact;
    }

    public void setPrimaryEmergencyContact(EmergencyContact primaryEmergencyContact) {
        this.primaryEmergencyContact = primaryEmergencyContact;
    }

    public EmergencyContact[] getEmergencyContact() {
        return this.emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact[] emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Education getHighestLevelOfEdu() {
        return this.highestLevelOfEdu;
    }

    public void setHighestLevelOfEdu(Education highestLevelOfEdu) {
        this.highestLevelOfEdu = highestLevelOfEdu;
    }

    public Education[] getEducation() {
        return this.education;
    }

    public void setEducation(Education[] education) {
        this.education = education;
    }

    public WorkExperience getFormerWorkExp() {
        return this.formerWorkExp;
    }

    public void setFormerWorkExp(WorkExperience formerWorkExp) {
        this.formerWorkExp = formerWorkExp;
    }

    public WorkExperience[] getWorkExp() {
        return this.workExp;
    }

    public void setWorkExp(WorkExperience[] workExp) {
        this.workExp = workExp;
    }

    public Attachment[] getIdPhotoPoSide() {
        return this.idPhotoPoSide;
    }

    public void setIdPhotoPoSide(Attachment[] idPhotoPoSide) {
        this.idPhotoPoSide = idPhotoPoSide;
    }

    public Attachment[] getIdPhotoEmSide() {
        return this.idPhotoEmSide;
    }

    public void setIdPhotoEmSide(Attachment[] idPhotoEmSide) {
        this.idPhotoEmSide = idPhotoEmSide;
    }

    public Attachment[] getIdPhoto() {
        return this.idPhoto;
    }

    public void setIdPhoto(Attachment[] idPhoto) {
        this.idPhoto = idPhoto;
    }

    public Attachment[] getDiplomaPhoto() {
        return this.diplomaPhoto;
    }

    public void setDiplomaPhoto(Attachment[] diplomaPhoto) {
        this.diplomaPhoto = diplomaPhoto;
    }

    public Attachment[] getGraduationCert() {
        return this.graduationCert;
    }

    public void setGraduationCert(Attachment[] graduationCert) {
        this.graduationCert = graduationCert;
    }

    public Attachment[] getCertOfMerit() {
        return this.certOfMerit;
    }

    public void setCertOfMerit(Attachment[] certOfMerit) {
        this.certOfMerit = certOfMerit;
    }

    public Attachment[] getOffboardingFile() {
        return this.offboardingFile;
    }

    public void setOffboardingFile(Attachment[] offboardingFile) {
        this.offboardingFile = offboardingFile;
    }

    public Integer getCancelOnboardingReason() {
        return this.cancelOnboardingReason;
    }

    public void setCancelOnboardingReason(Integer cancelOnboardingReason) {
        this.cancelOnboardingReason = cancelOnboardingReason;
    }

    public String getCancelOnboardingNotes() {
        return this.cancelOnboardingNotes;
    }

    public void setCancelOnboardingNotes(String cancelOnboardingNotes) {
        this.cancelOnboardingNotes = cancelOnboardingNotes;
    }

    public Integer getEmployeeFormStatus() {
        return this.employeeFormStatus;
    }

    public void setEmployeeFormStatus(Integer employeeFormStatus) {
        this.employeeFormStatus = employeeFormStatus;
    }

    public Integer getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

}
