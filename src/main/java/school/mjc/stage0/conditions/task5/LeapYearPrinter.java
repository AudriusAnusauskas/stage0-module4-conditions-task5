package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        switch (year % 4){
            default:
                System.out.println("not leap");
                break;
            case  0:
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println("leap");
                } else {
                    System.out.println("not leap");
                }
                break;
            }
    }

    public static void main(String[] args) {
        LeapYearPrinter leapPrinter = new LeapYearPrinter();

        leapPrinter.isLeapYear(1900);
    }
}
