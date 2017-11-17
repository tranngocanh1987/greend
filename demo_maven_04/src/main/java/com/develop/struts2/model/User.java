package com.develop.struts2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)  
	@Column(name = "id")
	private Integer id;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "enable")
	private boolean enable;
	@Column(name = "accountNonExpired")
	private boolean accountNonExpired;
	@Column(name = "accountNonLocked")
	private boolean accountNonLocked;
	@Column(name = "credentialsNonExpired")
	private boolean credentialsNonExpired;

	@Column(name = "custType")
	private String custType;
	@Column(name = "email")
	private String email;
	@Column(name = "avatar")
	private String avatar;
	@Column(name = "mobileNo")
	private String mobileNo;
	@Column(name = "address01")
	private String address01;
	@Column(name = "address02")
	private String address02;
	@Column(name = "address03")
	private String address03;
	@Column(name = "genderCode")
	private String genderCode;
	@Column(name = "birthDay")
	private String birthDay;
	@Column(name = "height")
	private int height;
	@Column(name = "weight")
	private int weight;
	@Column(name = "religion")
	private String religion;
	@Column(name = "imgFront")
	private String imgFront;
	@Column(name = "imgBehind")
	private String imgBehind;
	@Column(name = "experience")
	private String experience;
	@Column(name="status")
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress01() {
		return address01;
	}
	public void setAddress01(String address01) {
		this.address01 = address01;
	}
	public String getAddress02() {
		return address02;
	}
	public void setAddress02(String address02) {
		this.address02 = address02;
	}
	public String getAddress03() {
		return address03;
	}
	public void setAddress03(String address03) {
		this.address03 = address03;
	}
	public String getGenderCode() {
		return genderCode;
	}
	public void setGenderCode(String genderCode) {
		this.genderCode = genderCode;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getImgFront() {
		return imgFront;
	}
	public void setImgFront(String img_front) {
		this.imgFront = img_front;
	}
	public String getImgBehind() {
		return imgBehind;
	}
	public void setImgBehind(String imgBehind) {
		this.imgBehind = imgBehind;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
