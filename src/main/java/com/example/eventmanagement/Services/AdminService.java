package com.example.eventmanagement.Services;

import com.example.eventmanagement.Models.Venue;

import java.util.List;

public interface AdminService {

    Venue createVenue(Venue venue);


    List<Venue> getAllVenues();

    Venue getVenueById(long venueId);

    Venue updateVenue(Venue venue, long venueId);


}
