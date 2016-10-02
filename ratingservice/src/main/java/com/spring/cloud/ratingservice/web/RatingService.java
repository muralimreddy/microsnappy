/**
 * 
 */
package com.spring.cloud.ratingservice.web;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/getRatingByPhotoId/{ratingId}", method = RequestMethod.GET)
	public @ResponseBody Rating getAlbumById(@PathVariable BigInteger ratingId){
		return ratingRepo.getRatingByPhotoId(ratingId);
	}
	
//	@RequestMapping(value="/updateRatingByRatingId/{ratingId}/{rating}", method = RequestMethod.POST)
//	public @ResponseBody Rating updateRatingByRatingId(@PathVariable BigInteger ratingId, @PathVariable Integer count){
//		return ratingRepo.setRatingByRatingId(ratingId, count);
//	}
	
//	@RequestMapping(value="/addRatingByRatingId/{photoId}/{rating}", method=RequestMethod.POST)
//	public @ResponseBody Rating addRatingByRatingId(@PathVariable BigInteger photoId, @PathVariable Integer rating){
//		return ratingRepo.addRatingByPhotoId(photoId, rating);
//	}
}
