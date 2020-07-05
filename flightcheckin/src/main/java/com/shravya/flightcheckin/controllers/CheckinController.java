package com.shravya.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shravya.flightcheckin.integration.ReservationRestClient;
import com.shravya.flightcheckin.integration.dto.Reservation;
import com.shravya.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckinController {
	
	@Autowired
	ReservationRestClient restClient;
	
	@RequestMapping("/showStartCheckin")
	public String showStartCheckin() {
		return "startCheckin";
	}
	
	@RequestMapping("/startCheckin")
	public String showStartCheckin(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		Reservation reservation = restClient.findReservation(reservationId);
		modelMap.addAttribute("reservation",reservation);
		return "displayReservationDetails";
	}
	
	@RequestMapping("/completeCheckin")
	public String completeCheckin(@RequestParam("reservationId") Long reservationId, @RequestParam("numberOfBags") int numberOfBags, ModelMap modelMap) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(reservationId);
		request.setCheckedin(true);
		request.setNumberOfBags(numberOfBags);
		restClient.updateReservation(request);
		return "checkinConfirmation";
	}
}
