package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

import kz.wooppay.qr_pay_sdk.models.auth.BaseAccount;

/**
 *This class extended BaseAccount class
 * @see BaseAccount
 * */

public class PaymentData extends BaseAccount {
	/** payment fields*/
	private Map<String, Object> fields;
	/** qr code*/
	@SerializedName("qr_code")
	private String qrCode;
	/** payment type**/
	@SerializedName("payment_type")
	private int paymentType;
	/** card id**/
	@SerializedName("card_id")
	private long cardId;

	/** getter for payment fields*/
	public Map<String, Object> getFields() {
		return fields;
	}

	/** setter for payment fields*/
	public void setFields(Map<String, Object> fields) {
		this.fields = fields;
	}

	/** getter for qr code*/
	public String getQrCode() {
		return qrCode;
	}

	/** setter for qr code*/
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	/** getter payment type*/
	public int getPaymentType() {
		return paymentType;
	}

	/** setter payment type*/
	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	/** getter card id*/
	public long getCardId() {
		return cardId;
	}

	/** setter card id*/
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}

	/** String value of PaymentData object*/
	@Override
	public String toString() {
		return "PaymentData{" +
				"fields=" + fields +
				", qrCode='" + qrCode + '\'' +
				",partner='" + super.getPartner() + '\'' +
				",paymentType='" + paymentType + '\'' +
				",cardId='" + cardId + '\'' +
				'}';
	}
}
