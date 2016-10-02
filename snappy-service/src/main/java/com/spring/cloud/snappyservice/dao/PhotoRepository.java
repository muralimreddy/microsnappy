/**
 * 
 */
package com.spring.cloud.snappyservice.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.spring.cloud.snappyservice.domain.Photo;

/**
 * @author muralimanohar
 *
 */
public interface PhotoRepository extends Repository<Photo, BigInteger>{
	List<Photo> getAllPhotosByAlbumId(BigInteger albumId);
	List<Photo> getAllPhotosByPersonId(BigInteger personId);
}
