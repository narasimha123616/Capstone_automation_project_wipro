package Enum_dataType;

public class Enum_ex2 {
enum day{monday,tuesday,wednesday,thursday,friday,saturday,sunday};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
day d=day.sunday;
		if(d==day.saturday||d==d.sunday)
		{
			System.out.println("weekend Days");
		}
		else
		{
			System.out.println("working Days");
		}
		
switch(d)
{
case monday:System.out.println("today is monday");
break;
case tuesday:System.out.println("today is tuesday");
break;
case wednesday:System.out.println("today is wednesday");
break;
case thursday:System.out.println("today is thursdayday");
break;
case friday:System.out.println("today is friday");
break;
case saturday:System.out.println("today is saturday");
break;
case sunday:System.out.println("today is sunday");
break;
}


	}

}
