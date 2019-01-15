package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.exceptions.NoTracksExists;
import com.stackroute.exceptions.SameCommentExists;
import com.stackroute.exceptions.TrackAlreadyExists;
import com.stackroute.exceptions.TracksNotAvailable;

import java.util.List;

public interface TrackService {

    Track saveTrack(Track track) throws TrackAlreadyExists;

    List<Track> getAllTracks() throws TracksNotAvailable;

    Track updateTrack(int id, String comment) throws SameCommentExists;

    Track deleteTrack(int id) throws NoTracksExists;

    Track findTrackById(int id);

    Track findByName(String name) throws NoTracksExists;
}
