/**
 * 
 */
package com.spring.cloud.ratingservice.web;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.ratingservice.dao.RatingRepository;
import com.spring.cloud.ratingservice.domain.Rating;

/**
 * @author muralimanohar
 *
 */
@RestController
@RequestMapping("/RatingService")
public class RatingService {
	@Autowired
	private RatingRepository ratingRepo;
	
	@RequestMapping(value="/getRatingByPhotoId/{photoId}", method = RequestMethod.GET)
	public @ResponseBody Rating getRatingByPhotoId(@PathVariable BigInteger photoId){
		return ratingRepo.getRatingByPhotoId(photoId);
	}
	
	@RequestMapping(value="/addRatingByPhotoId/{photoId}", method = RequestMethod.POST)
	public @ResponseBody Rating addRating(@PathVariable BigInteger photoId){
		Rating rating = ratingRepo.findByPhotoId(photoId);
		if(rating == null){
			Rating newRating = new Rating(1, photoId);
			return ratingRepo.save(newRating);
		}{
			rating.setCount(rating.getCount() + 1);
			return ratingRepo.save(rating);
		}
	}
}
