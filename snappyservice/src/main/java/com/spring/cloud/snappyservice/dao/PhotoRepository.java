/**
 * 
 */
package com.spring.cloud.snappyservice.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.cloud.snappyservice.domain.Photo;

/**
 * @author muralimanohar
 *
 */
public interface PhotoRepository extends CrudRepository<Photo, BigInteger>{
	List<Photo> getAllPhotosByAlbumId(BigInteger albumId);
	List<Photo> getAllPhotosByPersonId(BigInteger personId);
	Photo findPhotoByPhotoId(BigInteger photoId);
	Photo save(Photo photo);
//	Photo update(Photo photo);
	void delete(Photo photo);
}
