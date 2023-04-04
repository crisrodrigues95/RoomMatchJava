package com.cristhian.roommatch.enuns;

public enum YesNo {

	YES(1), NO(0);

	private int code;

	private YesNo(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static YesNo valueOf(int code) {
		for (YesNo value : YesNo.values()) {
			if (value.getCode() == code) {
				return value;
			}

		}
		throw new IllegalArgumentException("Invalid Order Status Code");
	}

}
