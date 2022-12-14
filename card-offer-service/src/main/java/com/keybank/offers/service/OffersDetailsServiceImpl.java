/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.keybank.offers.model.OffersRequest;
import com.keybank.offers.model.OffersResponse;
import com.keybank.offers.serviceclient.ICardDetailsServiceClient;

/**
 * @author 91955 at Nov 17, 2022
 *
 *
 */

@Component
public class OffersDetailsServiceImpl implements IOffersDetailsService {
	
	@Autowired
	ICardDetailsServiceClient cardDetailsServiceClient;
	
	@Autowired
	IOffersDetailsService offersDetailsService;

	@Override
	public OffersResponse getoffers(OffersRequest offersRequest) {

		return null;
	}

}
