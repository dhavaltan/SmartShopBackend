package com.cognizant.smartshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.smartshop.model.Offer;
import com.cognizant.smartshop.repository.IOfferRepository;

@Service
public class OfferService {
	
	@Autowired
	IOfferRepository offerRepository;
	
	public List<Offer> getAllOffers() {
		return offerRepository.findAll();
	}

	public void insertOffer(Offer offer) {
		offerRepository.save(offer);
		
	}

	public void updateOffer(Offer offer) {
		offerRepository.updateOffer(offer.getOfferDate(), offer.getProductCode(), 
			offer.getDiscountedRate(), offer.getOfferName(), offer.getProductCode());
		
	}

	public void deleteOffer(String productCode) {
		Offer offer = offerRepository.findByProductCode(productCode);
		offerRepository.delete(offer);
	}

}
