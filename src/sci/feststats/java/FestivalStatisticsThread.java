package sci.feststats.java;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class FestivalStatisticsThread implements Runnable {
private PriorityQueue<FestivalAttendeeThread> festQue = new PriorityQueue<FestivalAttendeeThread>();


public PriorityQueue<FestivalAttendeeThread> getFestQue() {
	return festQue;
}

public void addFestQue(FestivalAttendeeThread addAttendee) {
	this.festQue.offer(addAttendee);
}

@Override
public void run() {
	PriorityQueue<FestivalAttendeeThread> festA = this.festQue;
	List<FestivalAttendeeThread> festArray = new ArrayList<FestivalAttendeeThread>();
	while(!festA.isEmpty())
	festArray.add(festA.remove());
	List<Statistics> stats = new ArrayList<Statistics>();
	for(FestivalAttendeeThread myAttendee : festA) {
		int contor = 1;
		for(FestivalAttendeeThread myAttendee1 : festA) {
			if(myAttendee.getTicketType().equals(myAttendee1.getTicketType())) {
				contor++;
				festA.remove(myAttendee1);
			}
		}
		stats.add( new Statistics(myAttendee.getTicketType(),contor));
	}
	System.out.println(stats);
}


}
