/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.service;

import com.keybank.offers.model.OffersRequest;
import com.keybank.offers.model.OffersResponse;

/**
 * @author 91955 at Nov 17, 2022
 *
 *
 */
public interface IOffersDetailsService {
	
OffersResponse	getoffers(OffersRequest offersRequest);

}
