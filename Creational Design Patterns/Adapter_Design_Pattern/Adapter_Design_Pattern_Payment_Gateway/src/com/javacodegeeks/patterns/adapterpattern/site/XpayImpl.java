package com.javacodegeeks.patterns.adapterpattern.site;

import com.javacodegeeks.patterns.adapterpattern.xpay.Xpay;

public class XpayImpl implements Xpay {
	
	// Attributes
	private String creditCardNo;
	private String customerName;
	private String cardExpYear;
	private String cardExpMonth;
	private short cardCVV;
	private Double amount;
	
	@Override
	public String getCreditCardNo() {
		return creditCardNo;
	}

	@Override
	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String getCardExpYear() {
		return cardExpYear;
	}

	@Override
	public String getCardExpMonth() {
		return cardExpMonth;
	}

	@Override
	public short getCardCVV() {
		return cardCVV;
	}

	@Override
	public Double getAmount() {
		return amount;
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo= creditCardNo;
	}

	@Override
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		this.cardExpYear = cardExpYear;
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		this.cardExpMonth = cardExpMonth;
	}

	@Override
	public void setCardCVV(short cardCVV) {
		this.cardCVV = cardCVV;
	}

	@Override
	public void setAmount(Double amountDouble) {
		this.amount = amountDouble;
	}

}
