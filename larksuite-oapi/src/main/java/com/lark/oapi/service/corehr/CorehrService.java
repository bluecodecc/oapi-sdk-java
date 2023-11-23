// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.lark.oapi.service.corehr;

import com.lark.oapi.core.Config;
import com.lark.oapi.event.IEventHandler;
import com.lark.oapi.service.corehr.v1.V1;
import com.lark.oapi.service.corehr.v1.model.*;
import com.lark.oapi.service.corehr.v1.resource.Company;
import com.lark.oapi.service.corehr.v1.resource.Contract;
import com.lark.oapi.service.corehr.v1.resource.CountryRegion;
import com.lark.oapi.service.corehr.v1.resource.Currency;
import com.lark.oapi.service.corehr.v1.resource.CustomField;
import com.lark.oapi.service.corehr.v1.resource.Department;
import com.lark.oapi.service.corehr.v1.resource.EmployeeType;
import com.lark.oapi.service.corehr.v1.resource.Employment;
import com.lark.oapi.service.corehr.v1.resource.File;
import com.lark.oapi.service.corehr.v1.resource.Job;
import com.lark.oapi.service.corehr.v1.resource.JobChange;
import com.lark.oapi.service.corehr.v1.resource.JobData;
import com.lark.oapi.service.corehr.v1.resource.JobFamily;
import com.lark.oapi.service.corehr.v1.resource.JobLevel;
import com.lark.oapi.service.corehr.v1.resource.LeaveGrantingRecord;
import com.lark.oapi.service.corehr.v1.resource.Location;
import com.lark.oapi.service.corehr.v1.resource.NationalIdType;
import com.lark.oapi.service.corehr.v1.resource.Offboarding;
import com.lark.oapi.service.corehr.v1.resource.Person;
import com.lark.oapi.service.corehr.v1.resource.PreHire;
import com.lark.oapi.service.corehr.v1.resource.SecurityGroup;
import com.lark.oapi.service.corehr.v1.resource.Subdivision;
import com.lark.oapi.service.corehr.v1.resource.Subregion;
import com.lark.oapi.service.corehr.v1.resource.TransferReason;
import com.lark.oapi.service.corehr.v1.resource.TransferType;
import com.lark.oapi.service.corehr.v1.resource.WorkingHoursType;
import com.lark.oapi.service.corehr.v1.resource.*;
import com.lark.oapi.service.corehr.v2.V2;
import com.lark.oapi.service.corehr.v2.model.P2ProbationUpdatedV2;
import com.lark.oapi.service.corehr.v2.model.P2ProcessApproverUpdatedV2;
import com.lark.oapi.service.corehr.v2.model.P2ProcessCcUpdatedV2;
import com.lark.oapi.service.corehr.v2.model.P2ProcessUpdatedV2;

public class CorehrService {
    private final V1 v1;
    private final AssignedUser assignedUser; // assigned_user
    private final Company company; // 公司
    private final CompensationStandard compensationStandard; // compensation_standard
    private final Contract contract; // 合同
    private final CountryRegion countryRegion; // 地理库信息
    private final Currency currency; // 货币信息
    private final CustomField customField; // 自定义字段
    private final Department department; // 部门
    private final EmployeeType employeeType; // 人员类型
    private final Employment employment; // 雇佣信息
    private final File file; // file
    private final Job job; // 职务
    private final JobChange jobChange; // 异动信息
    private final JobData jobData; // 任职信息
    private final JobFamily jobFamily; // 职务序列
    private final JobLevel jobLevel; // 职务级别
    private final Leave leave; // 休假管理
    private final LeaveGrantingRecord leaveGrantingRecord; // leave_granting_record
    private final Location location; // 地点
    private final NationalIdType nationalIdType; // 国家证件类型
    private final Offboarding offboarding; // 员工离职
    private final OrgRoleAuthorization orgRoleAuthorization; // org_role_authorization
    private final Person person; // 个人信息
    private final PreHire preHire; // 待入职
    private final ProcessFormVariableData processFormVariableData; // 流程管理
    private final SecurityGroup securityGroup; // security_group
    private final Subdivision subdivision; // 地理库信息
    private final Subregion subregion; // 地理库信息
    private final TransferReason transferReason; // 异动原因
    private final TransferType transferType; // 异动类型
    private final WorkingHoursType workingHoursType; // 工时制度
    private final V2 v2;

    public CorehrService(Config config) {
        this.v1 = new V1(config);
        this.assignedUser = new AssignedUser(config);
        this.company = new Company(config);
        this.compensationStandard = new CompensationStandard(config);
        this.contract = new Contract(config);
        this.countryRegion = new CountryRegion(config);
        this.currency = new Currency(config);
        this.customField = new CustomField(config);
        this.department = new Department(config);
        this.employeeType = new EmployeeType(config);
        this.employment = new Employment(config);
        this.file = new File(config);
        this.job = new Job(config);
        this.jobChange = new JobChange(config);
        this.jobData = new JobData(config);
        this.jobFamily = new JobFamily(config);
        this.jobLevel = new JobLevel(config);
        this.leave = new Leave(config);
        this.leaveGrantingRecord = new LeaveGrantingRecord(config);
        this.location = new Location(config);
        this.nationalIdType = new NationalIdType(config);
        this.offboarding = new Offboarding(config);
        this.orgRoleAuthorization = new OrgRoleAuthorization(config);
        this.person = new Person(config);
        this.preHire = new PreHire(config);
        this.processFormVariableData = new ProcessFormVariableData(config);
        this.securityGroup = new SecurityGroup(config);
        this.subdivision = new Subdivision(config);
        this.subregion = new Subregion(config);
        this.transferReason = new TransferReason(config);
        this.transferType = new TransferType(config);
        this.workingHoursType = new WorkingHoursType(config);
        this.v2 = new V2(config);
    }

    public V1 v1() {
        return v1;
    }

    public AssignedUser assignedUser() {
        return assignedUser;
    }

    public Company company() {
        return company;
    }

    public CompensationStandard compensationStandard() {
        return compensationStandard;
    }

    public Contract contract() {
        return contract;
    }

    public CountryRegion countryRegion() {
        return countryRegion;
    }

    public Currency currency() {
        return currency;
    }

    public CustomField customField() {
        return customField;
    }

    public Department department() {
        return department;
    }

    public EmployeeType employeeType() {
        return employeeType;
    }

    public Employment employment() {
        return employment;
    }

    public File file() {
        return file;
    }

    public Job job() {
        return job;
    }

    public JobChange jobChange() {
        return jobChange;
    }

    public JobData jobData() {
        return jobData;
    }

    public JobFamily jobFamily() {
        return jobFamily;
    }

    public JobLevel jobLevel() {
        return jobLevel;
    }

    public Leave leave() {
        return leave;
    }

    public LeaveGrantingRecord leaveGrantingRecord() {
        return leaveGrantingRecord;
    }

    public Location location() {
        return location;
    }

    public NationalIdType nationalIdType() {
        return nationalIdType;
    }

    public Offboarding offboarding() {
        return offboarding;
    }

    public OrgRoleAuthorization orgRoleAuthorization() {
        return orgRoleAuthorization;
    }

    public Person person() {
        return person;
    }

    public PreHire preHire() {
        return preHire;
    }

    public ProcessFormVariableData processFormVariableData() {
        return processFormVariableData;
    }

    public SecurityGroup securityGroup() {
        return securityGroup;
    }

    public Subdivision subdivision() {
        return subdivision;
    }

    public Subregion subregion() {
        return subregion;
    }

    public TransferReason transferReason() {
        return transferReason;
    }

    public TransferType transferType() {
        return transferType;
    }

    public WorkingHoursType workingHoursType() {
        return workingHoursType;
    }

    public V2 v2() {
        return v2;
    }

    public abstract static class P2ContractCreatedV1Handler implements IEventHandler<P2ContractCreatedV1> {
        @Override
        public P2ContractCreatedV1 getEvent() {
            return new P2ContractCreatedV1();
        }
    }

    public abstract static class P2ContractDeletedV1Handler implements IEventHandler<P2ContractDeletedV1> {
        @Override
        public P2ContractDeletedV1 getEvent() {
            return new P2ContractDeletedV1();
        }
    }

    public abstract static class P2ContractUpdatedV1Handler implements IEventHandler<P2ContractUpdatedV1> {
        @Override
        public P2ContractUpdatedV1 getEvent() {
            return new P2ContractUpdatedV1();
        }
    }

    public abstract static class P2DepartmentCreatedV1Handler implements IEventHandler<P2DepartmentCreatedV1> {
        @Override
        public P2DepartmentCreatedV1 getEvent() {
            return new P2DepartmentCreatedV1();
        }
    }

    public abstract static class P2DepartmentDeletedV1Handler implements IEventHandler<P2DepartmentDeletedV1> {
        @Override
        public P2DepartmentDeletedV1 getEvent() {
            return new P2DepartmentDeletedV1();
        }
    }

    public abstract static class P2DepartmentUpdatedV1Handler implements IEventHandler<P2DepartmentUpdatedV1> {
        @Override
        public P2DepartmentUpdatedV1 getEvent() {
            return new P2DepartmentUpdatedV1();
        }
    }

    public abstract static class P2EmploymentConvertedV1Handler implements IEventHandler<P2EmploymentConvertedV1> {
        @Override
        public P2EmploymentConvertedV1 getEvent() {
            return new P2EmploymentConvertedV1();
        }
    }

    public abstract static class P2EmploymentCreatedV1Handler implements IEventHandler<P2EmploymentCreatedV1> {
        @Override
        public P2EmploymentCreatedV1 getEvent() {
            return new P2EmploymentCreatedV1();
        }
    }

    public abstract static class P2EmploymentDeletedV1Handler implements IEventHandler<P2EmploymentDeletedV1> {
        @Override
        public P2EmploymentDeletedV1 getEvent() {
            return new P2EmploymentDeletedV1();
        }
    }

    public abstract static class P2EmploymentResignedV1Handler implements IEventHandler<P2EmploymentResignedV1> {
        @Override
        public P2EmploymentResignedV1 getEvent() {
            return new P2EmploymentResignedV1();
        }
    }

    public abstract static class P2EmploymentUpdatedV1Handler implements IEventHandler<P2EmploymentUpdatedV1> {
        @Override
        public P2EmploymentUpdatedV1 getEvent() {
            return new P2EmploymentUpdatedV1();
        }
    }

    public abstract static class P2JobCreatedV1Handler implements IEventHandler<P2JobCreatedV1> {
        @Override
        public P2JobCreatedV1 getEvent() {
            return new P2JobCreatedV1();
        }
    }

    public abstract static class P2JobDeletedV1Handler implements IEventHandler<P2JobDeletedV1> {
        @Override
        public P2JobDeletedV1 getEvent() {
            return new P2JobDeletedV1();
        }
    }

    public abstract static class P2JobUpdatedV1Handler implements IEventHandler<P2JobUpdatedV1> {
        @Override
        public P2JobUpdatedV1 getEvent() {
            return new P2JobUpdatedV1();
        }
    }

    public abstract static class P2JobChangeUpdatedV1Handler implements IEventHandler<P2JobChangeUpdatedV1> {
        @Override
        public P2JobChangeUpdatedV1 getEvent() {
            return new P2JobChangeUpdatedV1();
        }
    }

    public abstract static class P2JobDataChangedV1Handler implements IEventHandler<P2JobDataChangedV1> {
        @Override
        public P2JobDataChangedV1 getEvent() {
            return new P2JobDataChangedV1();
        }
    }

    public abstract static class P2JobDataEmployedV1Handler implements IEventHandler<P2JobDataEmployedV1> {
        @Override
        public P2JobDataEmployedV1 getEvent() {
            return new P2JobDataEmployedV1();
        }
    }

    public abstract static class P2OffboardingUpdatedV1Handler implements IEventHandler<P2OffboardingUpdatedV1> {
        @Override
        public P2OffboardingUpdatedV1 getEvent() {
            return new P2OffboardingUpdatedV1();
        }
    }

    public abstract static class P2OrgRoleAuthorizationUpdatedV1Handler implements IEventHandler<P2OrgRoleAuthorizationUpdatedV1> {
        @Override
        public P2OrgRoleAuthorizationUpdatedV1 getEvent() {
            return new P2OrgRoleAuthorizationUpdatedV1();
        }
    }

    public abstract static class P2PersonCreatedV1Handler implements IEventHandler<P2PersonCreatedV1> {
        @Override
        public P2PersonCreatedV1 getEvent() {
            return new P2PersonCreatedV1();
        }
    }

    public abstract static class P2PersonDeletedV1Handler implements IEventHandler<P2PersonDeletedV1> {
        @Override
        public P2PersonDeletedV1 getEvent() {
            return new P2PersonDeletedV1();
        }
    }

    public abstract static class P2PersonUpdatedV1Handler implements IEventHandler<P2PersonUpdatedV1> {
        @Override
        public P2PersonUpdatedV1 getEvent() {
            return new P2PersonUpdatedV1();
        }
    }

    public abstract static class P2PreHireUpdatedV1Handler implements IEventHandler<P2PreHireUpdatedV1> {
        @Override
        public P2PreHireUpdatedV1 getEvent() {
            return new P2PreHireUpdatedV1();
        }
    }

    public abstract static class P2ProbationUpdatedV2Handler implements IEventHandler<P2ProbationUpdatedV2> {
        @Override
        public P2ProbationUpdatedV2 getEvent() {
            return new P2ProbationUpdatedV2();
        }
    }

    public abstract static class P2ProcessUpdatedV2Handler implements IEventHandler<P2ProcessUpdatedV2> {
        @Override
        public P2ProcessUpdatedV2 getEvent() {
            return new P2ProcessUpdatedV2();
        }
    }

    public abstract static class P2ProcessApproverUpdatedV2Handler implements IEventHandler<P2ProcessApproverUpdatedV2> {
        @Override
        public P2ProcessApproverUpdatedV2 getEvent() {
            return new P2ProcessApproverUpdatedV2();
        }
    }

    public abstract static class P2ProcessCcUpdatedV2Handler implements IEventHandler<P2ProcessCcUpdatedV2> {
        @Override
        public P2ProcessCcUpdatedV2 getEvent() {
            return new P2ProcessCcUpdatedV2();
        }
    }
}