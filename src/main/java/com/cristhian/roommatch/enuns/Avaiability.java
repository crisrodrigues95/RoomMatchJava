package com.cristhian.roommatch.enuns;

public enum Avaiability {
	
	AVALIABLE(1),
	UNAVALIABLE(0);
	
	private int code;

	private Avaiability(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static Avaiability valueOf(int code) {
		for (Avaiability value : Avaiability.values()) {
			if (value.getCode() == code) {
				return value;
			}

		}
		throw new IllegalArgumentException("Invalid Order Status Code");
	}

}
