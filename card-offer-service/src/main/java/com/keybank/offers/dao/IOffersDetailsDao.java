/**
 * Copyright 2022. Lena Bank Pvt ltd.All rights resrved.
* You should not disclose the information outside 
 */
package com.keybank.offers.dao;

import com.keybank.offers.model.OffersDaoRequest;
import com.keybank.offers.model.OffersDaoResponse;
import com.keybank.offers.model.OffersRequest;
import com.keybank.offers.model.OffersResponse;

/**
 * @author 91955 at Nov 17, 2022
 *
 *
 */
public interface IOffersDetailsDao {
	
	OffersDaoResponse	getoffers(OffersDaoRequest offersDaoRequest);

}
