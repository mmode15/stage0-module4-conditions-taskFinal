package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        switch (month) {
            case (1), (3), (5), (7), (8), (10), (12) -> System.out.println(31);
            case (2) -> {
                if (year % 4 != 0 || year == 1900) {
                    System.out.println(28);
                } else if (year % 4 == 0) {
                    System.out.println(29);
                }
            }
            default -> System.out.println(30);
        }
    }
}
