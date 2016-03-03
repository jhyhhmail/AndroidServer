package com.jhy.server.entity;

import java.io.Serializable;
 
public class SysUserEntity implements Serializable{
    
    private static final long serialVersionUID = 8718267488992421298L;
 
    private String mobile; 
    private java.util.Date createTime; 
    private String email; 
    private String profession; 
    private boolean enabled; 
    private String title; 
    private String creator; 
    private String userName; 
    private String workerNo; 
    private String keyId; 
    private String orgCode; 
    private String orgName; 
    private String userCode; 
    private String password; 
    private String passwordConfirm; 
    private String idNo; 
    private boolean onDuty; 
    private String telephone;
    private String note; 
    private String userCert;
    
    public SysUserEntity() {
    }
    

    public SysUserEntity(String userName, String orgCode, String userCode,
			String password) { 
		this.userName = userName;
		this.orgCode = orgCode;
		this.userCode = userCode;
		this.password = password;
	}


	public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean getEnabled() {
        return this.enabled;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setWorkerNo(String workerNo) {
        this.workerNo = workerNo;
    }

    public String getWorkerNo() {
        return this.workerNo;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    
    
    public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserCode() {
        return this.userCode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
    public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getIdNo() {
        return this.idNo;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public boolean getOnDuty() {
        return this.onDuty;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return this.note;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userCode != null ? userCode.hashCode() : 0);
        return hash;
    }

    public String getUserCert() {
        return userCert;
    }

    public void setUserCert(String userCert) {
        this.userCert = userCert;
    }
    
    
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof SysUserEntity)) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        SysUserEntity other = (SysUserEntity) object;
        if ((this.userCode == null && other.userCode != null) || (this.userCode != null && !this.userCode.equals(other.userCode))) {
            return false;
        }
        return true;
    }
 

}
