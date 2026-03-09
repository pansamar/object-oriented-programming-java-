package week3_ex2;

public class TimeStamp {
	//Συμόρφωση με την αρχή της ενσωμάτωσης
	
	private int hour;
	private int minute;
	private int second;
	
	public TimeStamp(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void increaseHour() {
		hour++;
		if(hour == 24)
			hour = 0;
	}
	public void printTime() {
		System.out.println(hour + ":" + minute + ":" + second);
	}
	
	
}
