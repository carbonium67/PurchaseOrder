package com.mit.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class OrderDTO {
	private String contractNum;
	private String planNum;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date orderDate;
	private Long orderQuantity;
	private String emplNum;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date dueDate;
	
	private String partName;
	
	/* insertOrder() */
	private Long orderNum;
	
	/* getOrderByMonth() */
	private String companyName;
	private String companyCode;
	
	/* getCurrentOrder() */
	private String emplName;
	private String email;
	private Long unitPrice;
	
	/* getOrderInfo() */
	private String charge;
	private String contact;
	private String businessNumber;
	private String account;
	private String currency;
	
	/* getTotalPrice() */
	private Long totalPrice;
	private String contractCurrency;
	
	/* progress 데이터 검색 */
	private String supportNum;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date initialOrderDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date finalOrderDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date initialdueDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "Asia/Seoul")
	private Date finaldueDate;
}
