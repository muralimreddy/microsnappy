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

/**
 * @author muralimanohar
 *
 */
@Entity(name="ALBUM")
public class Album implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="ALBUM_ID")
	private BigInteger albumId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="PERSON_ID")
	private BigInteger personId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public BigInteger getAlbumId() {
		return albumId;
	}

	public void setAlbumId(BigInteger albumId) {
		this.albumId = albumId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigInteger getPersonId() {
		return personId;
	}

	public void setPersonId(BigInteger personId) {
		this.personId = personId;
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
}
