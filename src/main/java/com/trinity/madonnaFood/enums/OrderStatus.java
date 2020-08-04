package com.trinity.madonnaFood.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1, "Waiting payment"),
	PAID(2, "Paid"),
	SHIPPED(3, "Shipped"),
	DELIVERED(4, "Delivered"),
	CANCELED(5, "Canceled");
	
	private Integer code;
	private String description;
	
	private OrderStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public static OrderStatus toEnum(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code:" + code);
	}
	
	

}
