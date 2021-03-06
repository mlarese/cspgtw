package org.saxt.cms.model;
// Generated Mar 3, 2018 2:20:56 PM by Hibernate Tools 3.6.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TransactionFlow generated by hbm2java
 */
@Entity
@Table(name = "transaction_flow", catalog = "cms")
public class TransactionFlow implements java.io.Serializable {

	private String flowId;
	private String transactionId;
	private String transactionFlowStatus;
	private String merchantId;
	private String productId;
	private String invoiceText;
	private String callbackUrl;
	private String custom;
	private Date creationDate;
	private Date lastModifiedDate;

	public TransactionFlow() {
	}

	public TransactionFlow(String flowId, Date lastModifiedDate) {
		this.flowId = flowId;
		this.lastModifiedDate = lastModifiedDate;
	}

	public TransactionFlow(String flowId, String transactionId, String transactionFlowStatus, String merchantId,
			String productId, String invoiceText, String callbackUrl, String custom, Date creationDate,
			Date lastModifiedDate) {
		this.flowId = flowId;
		this.transactionId = transactionId;
		this.transactionFlowStatus = transactionFlowStatus;
		this.merchantId = merchantId;
		this.productId = productId;
		this.invoiceText = invoiceText;
		this.callbackUrl = callbackUrl;
		this.custom = custom;
		this.creationDate = creationDate;
		this.lastModifiedDate = lastModifiedDate;
	}

	@Id

	@Column(name = "flow_id", unique = true, nullable = false, length = 50)
	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	@Column(name = "transaction_id", length = 50)
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "transaction_flow_status", length = 9)
	public String getTransactionFlowStatus() {
		return this.transactionFlowStatus;
	}

	public void setTransactionFlowStatus(String transactionFlowStatus) {
		this.transactionFlowStatus = transactionFlowStatus;
	}

	@Column(name = "merchant_id", length = 50)
	public String getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	@Column(name = "product_id", length = 50)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Column(name = "invoice_text", length = 50)
	public String getInvoiceText() {
		return this.invoiceText;
	}

	public void setInvoiceText(String invoiceText) {
		this.invoiceText = invoiceText;
	}

	@Column(name = "callback_url")
	public String getCallbackUrl() {
		return this.callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	@Column(name = "custom", length = 50)
	public String getCustom() {
		return this.custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "creation_date", length = 19)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified_date", nullable = false, length = 19)
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
