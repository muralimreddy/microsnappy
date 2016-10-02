/**
 * 
 */
package com.spring.cloud.snappyservice.web;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.cloud.snappyservice.dao.AlbumRepository;
import com.spring.cloud.snappyservice.dao.PhotoRepository;
import com.spring.cloud.snappyservice.domain.Album;
import com.spring.cloud.snappyservice.domain.Photo;

/**
 * @author muralimanohar
 *
 */
@RestController
@RequestMapping("/SnappyService")
public class SnappyService {
	@Autowired
	private AlbumRepository albumRepo;
	
	@Autowired
	private PhotoRepository photoRepo;
	/**
	 * Returns Album details by albumId
	 * @param albumId
	 * @return
	 */
	@RequestMapping(value="/getAlbumDetailsById/{albumId}", method = RequestMethod.GET)
	public @ResponseBody Album getAlbumById(@PathVariable BigInteger albumId){
		System.out.println("getAlbumDetailsById - AlbumId:"+albumId);
		return albumRepo.findAlbumByAlbumId(albumId);
	}
	/*
	 * Returns Album details by Person Id
	 * @param personId
	 * @return
	 */
	@RequestMapping(value="/getAlbumByPersonId/{personId}", method = RequestMethod.GET)
	public @ResponseBody List<Album> getAlbumByPersonId(@PathVariable BigInteger personId){
		System.out.println("getAlbumByPersonId - PersonId:"+ personId);
		return albumRepo.findAlbumByPersonId(personId);
	}
	
	@RequestMapping(value="/getPhotosByAlbumId/{albumId}", method = RequestMethod.GET)
	public @ResponseBody List<Photo> getPhotosByAlbumId(@PathVariable BigInteger albumId){
		System.out.println("getPhotosByAlbumId - AlbumId:"+ albumId);
		return photoRepo.getAllPhotosByAlbumId(albumId);
	}
	
	@RequestMapping(value="/getPhotosByPersonId/{personId}", method = RequestMethod.GET)
	public @ResponseBody List<Photo> getPhotosByPersonId(@PathVariable BigInteger personId){
		System.out.println("getPhotosByPersonId - PersonId:"+ personId);
		return photoRepo.getAllPhotosByPersonId(personId);
	}
}
