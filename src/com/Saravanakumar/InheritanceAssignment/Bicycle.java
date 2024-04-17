package com.Saravanakumar.InheritanceAssignment;
public class Bicycle {
	public int No_of_gears;
	public int Speed_of_bicycle;
	
	public Bicycle()
	{
		
	}
	public Bicycle(int no_of_gears, int speed_of_bicycle) {
		this.No_of_gears = no_of_gears;
		this.Speed_of_bicycle = speed_of_bicycle;
	}
	public int getNo_of_gears() {
		return No_of_gears;
	}
	public void setNo_of_gears(int no_of_gears) {
		No_of_gears = no_of_gears;
	}
	public int getSpeed_of_bicycle() {
		return Speed_of_bicycle;
	}
	public void setSpeed_of_bicycle(int speed_of_bicycle) {
		Speed_of_bicycle = speed_of_bicycle;
	}
	@Override
	public String toString() {
		return "Bicycle [No_of_gears=" + No_of_gears + ", Speed_of_bicycle=" + Speed_of_bicycle + "]";
	}	
}
