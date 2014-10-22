package com.tomi.development.service;

import com.tomi.development.model.Invoice;

public interface InvoiceService {
	
	String save(Invoice invoice);
	
	void update(Invoice invoice);

}
