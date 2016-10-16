/**
 * 
 */
package com.spring.cloud.ratingservice.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.cloud.ratingservice.domain.Rating;

/**
 * @author muralimanohar
 *
 */
@Repository
public interface RatingRepository  extends CrudRepository<Rating, BigInteger>{
	Rating getRatingByPhotoId(BigInteger photoId);
	Rating findByRatingId(BigInteger ratingId);
	Rating findByPhotoId(BigInteger photoId);
	Rating save(Rating rating);
	void delete(Rating rating);

}
