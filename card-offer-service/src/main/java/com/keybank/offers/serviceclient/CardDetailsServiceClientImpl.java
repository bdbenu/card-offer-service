/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.serviceclient;

import org.springframework.stereotype.Component;

import com.keybank.offers.model.CardDetailsRequest;
import com.keybank.offers.model.CardDetailsResponse;

/**
 * @author 91955 at Nov 17, 2022
 *
 *
 */
@Component
public class CardDetailsServiceClientImpl implements ICardDetailsServiceClient{

	@Override
	public CardDetailsResponse getcardDetails(CardDetailsRequest cardDetailsRequest) {
		
		return null;
	}

}
