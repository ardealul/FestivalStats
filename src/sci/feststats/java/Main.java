package sci.feststats.java;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<100;i++) {
			if (Thread.activeCount()<4) {
			FestivalAttendeeThread festTh = new FestivalAttendeeThread();
			Thread d = new Thread(festTh);
			d.start();
			FestivalStatisticsThread festStats = new FestivalStatisticsThread();
			festStats.addFestQue(festTh);
			Thread f = new Thread(festStats);
			f.run();
			f.sleep(5000);
			}
		}
	}

	}


