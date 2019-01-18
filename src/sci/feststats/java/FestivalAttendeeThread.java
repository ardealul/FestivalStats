package sci.feststats.java;

import java.util.PriorityQueue;

public class FestivalAttendeeThread implements Runnable{
private TicketType ticketType;
private FestivalGate festivalGate;
@Override
public void run() {
this.ticketType = TicketType.getRandom();
this.festivalGate = FestivalGate.getRandom();
}
public TicketType getTicketType() {
	return ticketType;
}

public FestivalGate getFestivalGate() {
	return festivalGate;
}
@Override
public String toString() {
	return "This person has " + ticketType + " and entered the gate with number " + festivalGate+".";
}



}
