package com.daniellogerstedt.Lab11Application;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, Long> {
    List<Song> findByAlbumId(long albumId);
}
