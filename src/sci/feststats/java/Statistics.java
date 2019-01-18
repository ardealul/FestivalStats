package sci.feststats.java;

public class Statistics {
private TicketType ticketType;
private int number;
public Statistics(TicketType ticketType, int number) {
	super();
	this.ticketType = ticketType;
	this.number = number;
}
@Override
public String toString() {
	return "With " + ticketType + number + "have entered.";
}
}
