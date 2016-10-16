/**
 * 
 */
package com.spring.cloud.snappyservice.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.cloud.snappyservice.domain.Album;

/**
 * @author muralimanohar
 *
 */
public interface AlbumRepository extends CrudRepository<Album, BigInteger>{
	List<Album> findAlbumByPersonId(BigInteger personId);
	Album findAlbumByAlbumId(BigInteger albumId);
	Album save(Album album);
//	Album update(Album album);
	void delete(Album album);
}
