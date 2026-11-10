package patterns.adapterpattern.site;

import patterns.adapterpattern.payd.PayD;
import patterns.adapterpattern.xpay.Xpay;

public class XpayToPayDAdapter implements PayD {

	// Attributes
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer CVVNo;
	private Double totalAmount;
	
	private final Xpay xpay;
	
	// Constructor
	public XpayToPayDAdapter(Xpay objXpay) {
		this.xpay = objXpay;
		setUp();
	}
	
	
	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return CVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.CVVNo = cVVNo;
	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	// Initialize attributes
	public void setUp() {
		setCustCardNo(this.xpay.getCreditCardNo());
		setCardOwnerName(xpay.getCustomerName());
		setCardExpMonthDate(xpay.getCardExpMonth() + "/" + xpay.getCardExpYear());
		setCVVNo((int) xpay.getCardCVV());
		setTotalAmount(xpay.getAmount());
	}

}
