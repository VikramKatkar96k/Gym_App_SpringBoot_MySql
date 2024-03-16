package com.Gym.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="GymMembers_Data")
public class GymEntity 
{
	@Id
	@Column(name ="GymId")
	private Integer id;
	
	
	private String memberName;
	@CreationTimestamp
	@Column(name="commingTime",updatable = false)
	private LocalDateTime commingTime;
	
	@UpdateTimestamp
	@Column(name="outTime",insertable = false)
	private LocalDateTime outTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public LocalDateTime getCommingTime() {
		return commingTime;
	}

	public void setCommingTime(LocalDateTime commingTime) {
		this.commingTime = commingTime;
	}

	public LocalDateTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalDateTime outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "GymEntity [id=" + id + ", memberName=" + memberName + ", commingTime=" + commingTime + ", outTime="
				+ outTime + "]";
	}

	
}
