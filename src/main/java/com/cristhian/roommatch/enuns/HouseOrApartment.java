package com.cristhian.roommatch.enuns;

public enum HouseOrApartment {
	
	HOUSE(1),
	APARTMENT(2);
	
	private int code;

	private HouseOrApartment(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static HouseOrApartment valueOf(int code) {
		for (HouseOrApartment value : HouseOrApartment.values()) {
			if (value.getCode() == code) {
				return value;
			}

		}
		throw new IllegalArgumentException("Invalid Order Status Code");
	}

}
