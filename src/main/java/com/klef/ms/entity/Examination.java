package com.klef.ms.entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="examination_table")
public class Examination {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="examination_id")
	private Long examinationId;
	@Column(name="name",length=100,nullable=false)
	private String name;
	@Column(name="type",length=100,nullable = false)
	private String type;
	@Column(name="status",length=100,nullable=false)
	private String status;
	@Column(name="location",length =100,nullable = false)
	private String location;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	public Long getExaminationId() {
		return examinationId;
	}
	public void setExaminationId(Long examinationId) {
		this.examinationId = examinationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Examination [examinationId=" + examinationId + ", name=" + name + ", type=" + type + ", status="
				+ status + ", location=" + location + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
