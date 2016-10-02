/**
 * 
 */
package com.spring.cloud.ratingservice.domain;

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
@Entity(name="PIC_RATING")
public class Rating implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="RATING_ID")
	private BigInteger ratingId;
	
	@Column(name="COUNT")
	private Integer count;
	
	@Column(name="PHOTO_ID")
	private BigInteger photoId;	
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public BigInteger getRatingId() {
		return ratingId;
	}

	public void setRatingId(BigInteger ratingId) {
		this.ratingId = ratingId;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public BigInteger getPhotoId() {
		return photoId;
	}

	public void setPhotoId(BigInteger photoId) {
		this.photoId = photoId;
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
