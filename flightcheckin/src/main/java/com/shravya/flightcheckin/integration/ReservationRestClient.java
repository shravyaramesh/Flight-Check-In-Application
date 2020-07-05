package com.shravya.flightcheckin.integration;

import com.shravya.flightcheckin.integration.dto.Reservation;
import com.shravya.flightcheckin.integration.dto.ReservationUpdateRequest;


public interface ReservationRestClient {
	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);
}
