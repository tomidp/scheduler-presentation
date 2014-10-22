package com.tomi.development.controller;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tomi.development.enumeration.InvoiceStatus;
import com.tomi.development.model.Invoice;
import com.tomi.development.service.InvoiceService;

public class InvoiceUtil {
	
	
	public static void main(String[] args) {
		System.out.println("Preparing context");
		ApplicationContext context =
		          new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Get invoice service from context");
		InvoiceService invoiceService = context.getBean("invoiceService", InvoiceService.class);
		System.out.println("Create new invoice");
		Invoice invoice = new Invoice();
		invoice.setAmount(new BigDecimal(100000));
		invoice.setStatus(InvoiceStatus.OPEN);
		System.out.println("Saving invoice to database");
		String id = invoiceService.save(invoice);
		System.out.println("Invoice with id "+id+ "saved to database");
	}

}
