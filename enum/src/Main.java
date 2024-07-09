enum DAY{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
}
public class Main {
    public static void main(String[] args) {
      DAY day=DAY.THURSDAY;
      switch (day){
          case SUNDAY:
              System.out.println("day is sunday");
          case MONDAY:
              System.out.println("day is monday");
          case TUESDAY:
              System.out.println("day is tuesday");
          case WEDNESDAY:
              System.out.println("day is wednesday");
          case THURSDAY:
              System.out.println("day is thursday");
      }
    }
}