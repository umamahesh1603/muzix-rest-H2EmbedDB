package com.stackroute.repository;

import com.stackroute.domain.Track;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrackRepository extends CrudRepository<Track, Integer> {

    Track save(Track track);

//    Track deleteById(int id);

    List<Track> findAll();

    Track findById(int id);

    boolean existsByName(String name);

    Track findByName(String name);
}
