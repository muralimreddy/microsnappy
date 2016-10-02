/**
 * 
 */
package com.spring.cloud.ratingservice.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.cloud.ratingservice.domain.Rating;

/**
 * @author muralimanohar
 *
 */
@Repository
public interface RatingRepository  extends JpaRepository<Rating, BigInteger>{
	Rating getRatingByPhotoId(BigInteger photoId);;
//	Rating addRatingByPhotoId(BigInteger photoId, Integer rating);
	
	@Modifying(clearAutomatically = true)
	@Query("UPDATE PIC_RATING R SET R.COUNT=:count WHERE R.RATING_ID=:ratingId")
	Rating setRatingByRatingId(@Param("ratingId") BigInteger ratingId, @Param("count") Integer count);

}
