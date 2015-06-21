package ba.bitcamp.homework03.task04;

public class Date {

	public static final int MAX_DAY_LONG = 31;
	public static final int MAX_DAY_SHORT = 30;
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 31 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-31");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-30");
			}
			break;
		case 2:
			if (year % 4 == 0) {
				if (day > 29 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-29");
				}
				break;
			} else {
				if (day > 28 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-28");
				}
				break;
			}
		default:
			System.out.println();
		}
	}

	public Date(int day, int month) {
		this(day, month, 1);

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 31 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-31");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-30");
			}
			break;
		case 2:
			if (year % 4 == 0) {
				if (day > 29 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-29");
				}
				break;
			} else {
				if (day > 28 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-28");
				}
				break;
			}
		default:
			System.out.println();
		}

	}

	public Date(int day) {
		this(day, 1, 1);

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 31 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-31");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-30");
			}
			break;
		case 2:
			if (year % 4 == 0) {
				if (day > 29 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-29");
				}
				break;
			} else {
				if (day > 28 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-28");
				}
				break;
			}
		default:
			System.out.println();
		}
	}

	@Override
	public String toString() {
		String date = null;
		if (day < 10) {
			date = "0" + day;
		} else {
			date = day + "";
		}

		if (month < 10) {
			date += "." + "0" + month;

		} else {
			date += "." + month;
		}

		date += "." + year;
		return date;

	}

	public void setDay(int day) {
		this.day = day;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (day > 31 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-31");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (day > 30 || day < 0) {
				throw new IllegalArgumentException("Day has to be from 1-30");
			}
			break;
		case 2:
			if (year % 4 == 0) {
				if (day > 29 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-29");
				}
				break;
			} else {
				if (day > 28 || day < 0) {
					throw new IllegalArgumentException(
							"Day has to be from 1-28");
				}
				break;
			}
		default:
			System.out.println();
		}
	}

	public void setMonth(int month) {
		this.month = month;
		if (month > 12 || month < 1) {
			throw new IllegalArgumentException("Month has to be from 1-12");
		}
	}

	public void setYear(int year) {
		this.year = year;
	}

}
