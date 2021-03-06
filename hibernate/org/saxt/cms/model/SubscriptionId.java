package org.saxt.cms.model;
// Generated Mar 3, 2018 2:20:56 PM by Hibernate Tools 3.6.0.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SubscriptionId generated by hbm2java
 */
@Embeddable
public class SubscriptionId implements java.io.Serializable {

	private String serviceId;
	private String msisdn;

	public SubscriptionId() {
	}

	public SubscriptionId(String serviceId, String msisdn) {
		this.serviceId = serviceId;
		this.msisdn = msisdn;
	}

	@Column(name = "service_id", nullable = false, length = 50)
	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	@Column(name = "msisdn", nullable = false, length = 50)
	public String getMsisdn() {
		return this.msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SubscriptionId))
			return false;
		SubscriptionId castOther = (SubscriptionId) other;

		return ((this.getServiceId() == castOther.getServiceId()) || (this.getServiceId() != null
				&& castOther.getServiceId() != null && this.getServiceId().equals(castOther.getServiceId())))
				&& ((this.getMsisdn() == castOther.getMsisdn()) || (this.getMsisdn() != null
						&& castOther.getMsisdn() != null && this.getMsisdn().equals(castOther.getMsisdn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getServiceId() == null ? 0 : this.getServiceId().hashCode());
		result = 37 * result + (getMsisdn() == null ? 0 : this.getMsisdn().hashCode());
		return result;
	}

}
