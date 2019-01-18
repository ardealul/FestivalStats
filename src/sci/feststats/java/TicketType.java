package sci.feststats.java;
// full, full-vip, free-pass, one-day, one-day-vip
public enum TicketType {
FULL, FULLVIP,FREEPASS,ONEDAY,ONEDAYVIP;

public static TicketType getRandom()    
{
  return values()[(int)(Math.random() * values().length)];
}
}

