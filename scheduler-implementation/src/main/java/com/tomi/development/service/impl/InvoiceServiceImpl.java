package com.tomi.development.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomi.development.dao.InvoiceDao;
import com.tomi.development.model.Invoice;
import com.tomi.development.service.InvoiceService;

@Service("invoiceService")
@Transactional(readOnly = true)
public class InvoiceServiceImpl implements InvoiceService {
	
	@Autowired
	private InvoiceDao invoiceDao;

	public InvoiceDao getInvoiceDao() {
		return invoiceDao;
	}

	public void setInvoiceDao(InvoiceDao invoiceDao) {
		this.invoiceDao = invoiceDao;
	}

	@Override
	@Transactional(readOnly = false)
	public String save(Invoice invoice) {
		return invoiceDao.save(invoice);
	}

	@Override
	@Transactional(readOnly = false)
	public void update(Invoice invoice) {
		invoiceDao.update(invoice);
	}

}
