package kz.wooppay.qr_pay_sdk.models.payment;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

import kz.wooppay.qr_pay_sdk.models.auth.BaseAccount;

/**
 *This class extended BaseAccount class
 * @see BaseAccount
 * */

public class PayByBalance extends BaseAccount {
	/** payment fields*/
	private Map<String, Object> fields;
	/** qr code*/
	@SerializedName("qr_code")
	private String qrCode;

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

	/** String value of PayByBalance object*/
	@Override
	public String toString() {
		return "PayByBalance{" +
				"fields=" + fields +
				", qrCode='" + qrCode + '\'' +
				",partner='" + super.getPartner() + '\'' +
				'}';
	}
}
