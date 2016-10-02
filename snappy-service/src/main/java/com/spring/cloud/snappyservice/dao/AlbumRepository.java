/**
 * 
 */
package com.spring.cloud.snappyservice.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.Repository;

import com.spring.cloud.snappyservice.domain.Album;

/**
 * @author muralimanohar
 *
 */
public interface AlbumRepository extends Repository<Album, BigInteger>{
	List<Album> findAlbumByPersonId(BigInteger personId);
	Album findAlbumByAlbumId(BigInteger albumId);
	
}
