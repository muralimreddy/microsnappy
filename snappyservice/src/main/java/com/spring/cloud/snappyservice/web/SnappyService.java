/**
 * 
 */
package com.spring.cloud.snappyservice.web;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(value="/getAlbumDetailsById/{albumId}", method = RequestMethod.GET)
	public @ResponseBody Album getAlbumById(@PathVariable BigInteger albumId){
		System.out.println("getAlbumDetailsById - AlbumId:"+albumId);
		return albumRepo.findAlbumByAlbumId(albumId);
	}

	@RequestMapping(value="/getAlbumByPersonId/{personId}", method = RequestMethod.GET)
	public @ResponseBody List<Album> getAlbumByPersonId(@PathVariable BigInteger personId){
		System.out.println("getAlbumByPersonId - PersonId:"+ personId);
		return albumRepo.findAlbumByPersonId(personId);
	}

	@RequestMapping(value="/getPhotoById/{photoId}", method = RequestMethod.GET)
	public @ResponseBody Photo getPhotoByPhotoId(@PathVariable BigInteger photoId){
		System.out.println("getPhotoById - photoId:"+ photoId);
		return photoRepo.findPhotoByPhotoId(photoId);
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
	
	@RequestMapping(value="/addAlbum", method = RequestMethod.POST)
	public @ResponseBody Album addAlbum(@RequestBody Album album){
		System.out.println("addALbum method");
		return albumRepo.save(album);
	}
	
	@RequestMapping(value="/addPhoto", method = RequestMethod.POST)
	public @ResponseBody Photo addPhoto(@RequestBody Photo photo){
		System.out.println("addPhoto method");
		return photoRepo.save(photo);
	}
	
	@RequestMapping(value="/updateAlbum", method = RequestMethod.POST)
	public @ResponseBody Album updateAlbum(@RequestBody Album inAlbum){
		System.out.println("updateAlbum method");
		Album album = albumRepo.findAlbumByAlbumId(inAlbum.getAlbumId());
		album.setDescription(inAlbum.getDescription());
		return albumRepo.save(album);
	}
	
	@RequestMapping(value="/updatePhoto", method = RequestMethod.POST)
	public @ResponseBody Photo updatePhoto(@RequestBody Photo inPhoto){
		System.out.println("update photo");
		Photo photo = photoRepo.findPhotoByPhotoId(inPhoto.getPhotoId());
		photo.setDescription(inPhoto.getDescription());
		photo.setLocation(inPhoto.getLocation());
		return photoRepo.save(photo);
	}
	
	@RequestMapping(value="deleteAlbum/{albumId}", method = RequestMethod.POST)
	public @ResponseBody void deleteAlbum(@PathVariable BigInteger albumId){
		System.out.println("delete Album");
		Album album = albumRepo.findAlbumByAlbumId(albumId);
		albumRepo.delete(album);
	}
	
	@RequestMapping(value="deletePhoto/{photoId}", method = RequestMethod.POST)
	public @ResponseBody void deletePhoto(@PathVariable BigInteger photoId){
		System.out.println("delete Photo");
		Photo photo = photoRepo.findPhotoByPhotoId(photoId);
		photoRepo.delete(photo);
	}
}
