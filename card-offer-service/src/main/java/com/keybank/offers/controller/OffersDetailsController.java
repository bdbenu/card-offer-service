/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.keybank.offers.model.OffersRequest;
import com.keybank.offers.model.OffersResponse;
import com.keybank.offers.service.IOffersDetailsService;

/**
 * @author 91955 at Nov 17, 2022
 *
 *
 */

@RequestMapping("/v1")
public class OffersDetailsController {
	
	@Autowired
	IOffersDetailsService offersDetailsService;

	@GetMapping("/offers/{card_number}/{cvv}/{nameoncard}/")
	// @RequestMapping(path = "/offers",method = RequestMethod.GET,produces =
	// "application/json",consumes = "application/json")
	public OffersResponse getOffers(@PathVariable("card_number") String card_number, @PathVariable("cvv") String cvv,
			@PathVariable("nameoncard") String nameoncard, @PathVariable("exparydate") String exparydate,
			@RequestHeader("client_Id") String clientId, @RequestHeader("chanel_Id") String chanelId,
			@RequestHeader("message_ts") String messageTimeStamp) {
		
		OffersRequest offersRequest = new OffersRequest();
		OffersResponse offersResponse = offersDetailsService.getoffers(offersRequest);

		return null;
	}

	public OffersResponse postOffers(@RequestBody OffersRequest offersRequest,
			@RequestHeader("client_Id") String clientId, @RequestHeader("chanel_Id") String chanelId,
			@RequestHeader("message_ts") String messageTimeStamp) {
		return null;
	}
}
