package com.heidichen.mvcdemo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="trips") // sql: lower case, plural
public class Trip { // Java: Pascal case, singular

    @Id // to specify the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment for the Id
    private Long id;
    
    @NotNull
    @Size(min = 2, message="Location must be at least 2 characters")
    private String location;
    
    @NotNull
    @Min(value=1, message="Trip length must be positive")
    private Integer tripLength;
	
    @NotNull
    @Size(min = 5, max = 200)
    private String description;
    
    @NotNull
    @Size(min=2)
    private String owner;
    
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @PrePersist // execute when a record is created
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    
    @PreUpdate // execute when a record is updated
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
    
    public Trip() {}


	public Trip(String location,Integer tripLength,
			String description, String owner) {
		this.location = location;
		this.tripLength = tripLength;
		this.description = description;
		this.owner = owner;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Integer getTripLength() {
		return tripLength;
	}


	public void setTripLength(Integer tripLength) {
		this.tripLength = tripLength;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
    
    
}













