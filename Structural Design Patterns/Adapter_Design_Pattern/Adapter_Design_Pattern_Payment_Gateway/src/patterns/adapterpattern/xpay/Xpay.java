package patterns.adapterpattern.xpay;

public interface Xpay {
	
	// Getters
	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpYear();
	public String getCardExpMonth();
	public short getCardCVV();
	public Double getAmount();
	
	// Setters
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardExpYear(String cardExpYear);
	public void setCardExpMonth(String cardExpMonth);
	public void setCardCVV(short cardCVV);
	public void setAmount(Double amountDouble);

}
