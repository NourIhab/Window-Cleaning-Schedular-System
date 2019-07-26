
package WindowCleaningService;


public class Date {
        public final int Day;
        public final int Month;
        private  final int year;

    public Date(int Day, int Month, int year) {
        this.Day = Day;
        this.Month = Month;
        this.year = year;
    }    
  public int getDay() {
        return Day;
    }

    public int getMonth() {
        return Month;
    }

    public int getYear() {
        return year;
    }
    
}
