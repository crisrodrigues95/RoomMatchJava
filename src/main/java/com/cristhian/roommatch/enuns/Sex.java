package com.cristhian.roommatch.enuns;

public enum Sex {
	
	MALE(1),
	FEMALE(2),
	NOBINARY(0);
	
	
	private int code;

	private Sex(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static Sex valueOf(int code) {
		for (Sex value : Sex.values()) {
			if (value.getCode() == code) {
				return value;
			}

		}
		throw new IllegalArgumentException("Invalid Order Status Code");
	}

}
