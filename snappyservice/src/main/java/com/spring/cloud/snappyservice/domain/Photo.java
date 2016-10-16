/**
 * 
 */
package com.spring.cloud.snappyservice.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author muralimanohar
 *
 */
@Entity(name="PHOTO")
public class Photo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="PHOTO_ID")
	private BigInteger photoId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="PERSON_ID")
	private BigInteger personId;
	
	@Column(name="ALBUM_ID")
	private BigInteger albumId;
	
	@Column(name="FILE_LOCATION")
	private String fileLocation;
	
	@Column(name="CREATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name="UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public BigInteger getPhotoId() {
		return photoId;
	}

	public void setPhotoId(BigInteger photoId) {
		this.photoId = photoId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BigInteger getPersonId() {
		return personId;
	}

	public void setPersonId(BigInteger personId) {
		this.personId = personId;
	}

	public BigInteger getAlbumId() {
		return albumId;
	}

	public void setAlbumId(BigInteger albumId) {
		this.albumId = albumId;
	}

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {	
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {	
		this.updateDate = updateDate;
	}	
	@PrePersist
	void createdOn(){
		this.createDate = this.updateDate = new Date();
	}
	
	@PreUpdate
	void updatedOn(){
		this.updateDate = new Date();
	}	
}
