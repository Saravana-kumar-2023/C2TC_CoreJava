package com.Saravanakumar.InheritanceAssignment;
import java.util.Scanner;
public class MontaneBike extends Bicycle {
	Scanner scanner = new Scanner(System.in);
	public int seat_height;
	
	public MontaneBike() {
	}
	
	public MontaneBike(int seat_height) {
		this.seat_height = seat_height;
	}

	public MontaneBike(int no_of_gears, int speed_of_bicycle, int seat_height) {
		super(no_of_gears, speed_of_bicycle);
		this.seat_height = seat_height;
	}

	public int getSeat_height() {
		return seat_height;
	}

	public void setSeat_height(int seat_height) {
		this.seat_height = seat_height;
	}

	@Override
	public String toString() {
		return "No of gears are "+No_of_gears+"\nSpeed of bicycle is "+Speed_of_bicycle+"\nSeat height is "+seat_height;
	}

	
	
	
	
	

}
