/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.serviceclient;

import com.keybank.offers.model.CardDetailsRequest;
import com.keybank.offers.model.CardDetailsResponse;

/**
 * @author 91955 at Nov 17, 2022
 *
 *
 */
public interface ICardDetailsServiceClient {

	CardDetailsResponse getcardDetails(CardDetailsRequest cardDetailsRequest);

}
