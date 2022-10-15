package ex2;

public class Time {
	private int sec;
	private int min;
	private int hour;
	
	public Time(int h, int m, int s) {
		if ( h >= 1 && h <= 23)
            h = hour;
        else 
            hour = 0;
        if ( m >= 0 && m <= 59)
            m = min;
        else 
            min = 0;
        if ( s >= 0 && s <= 59)
            s = sec;
        else 
            sec = 0;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return min;
	}
	public int getSecond() {
		return sec;
	}
	
	public void setHour(int h) {
		hour = h;
	}
	public void setMinute(int m) {
		min = m;
	}
	public void setSecond(int s) {
		sec = s;
	}
	public void setTime(int h, int m, int s) {
		hour = s;
		min = m;
		sec = s;
	}
	
	  public String toString()
	   {
	      String value="0";
	      if (hour<10)
	      {
	    	  value = value+hour;
	      }
	      else
	      {
	    	 value = ""+hour;
	     }
	     value = value + ":";
	     if (min<10)
	     {
	    	 value = value + "0" + min;
	     }
	     else
	     {
	    	 value = value + min;
	     }
	     value = value + ":";
	     if (sec<10)
	     {
	    	 value = value + "0" + sec;
	     }
	     else
	     {
	    	 value = value + sec;
	     }
	     return(value);
	   }
	
	public Time nextSecond() {
		sec++;
		 if (sec==60)
	       {
	          min++;
	          sec=0;
	       }
	       if (min==60)
	       {
	         hour++;
	         min=0;
	       }
	       if (hour==24)
	       {
	           hour=0;
	       }
	       return this;
	       
	}
	
	
	public Time previousSecond() {
		sec--;
		 if (sec==1)
	       {
	          min--;
	          sec=59;
	       }
	       if (min==1)
	       {
	         hour--;
	         min=59;
	       }
	       if (hour==1)
	       {
	           hour=24;
	       }
	       return this;
	       
	}
	
}