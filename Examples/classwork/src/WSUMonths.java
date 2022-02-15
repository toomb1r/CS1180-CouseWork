import java.util.Scanner;

class WSUMonths {
    public static void main(String[] args) {
        java.util.Scanner monthNumberScanner = new java.util.Scanner(System.in);
        System.out.print("Enter a month numer (1 for Jan, 2 for Feb, ... 12 for Dec) : ");
        int monthNumber =  monthNumberScanner.nextInt();
        System.out.print("Enter a number of months: ");
        int numberOfMonths = monthNumberScanner.nextInt();
        int lastMonthNumber = monthNumber + numberOfMonths;
        int totalNumberOfDays = 0; 
        while (monthNumber < lastMonthNumber) {
        monthNumber = ((monthNumber - 1) % 12) + 1;
        if (1== monthNumber || 3 == monthNumber || 5 == monthNumber || 7 == monthNumber || 8 == monthNumber || 10 == monthNumber || 12 == monthNumber){
            //System.out.println(31);
            totalNumberOfDays = totalNumberOfDays + 31;
        } else if (2 == monthNumber) {
           //System.out.println(28);
           totalNumberOfDays = totalNumberOfDays + 28;
        } else {
            //System.out.println(30);
            totalNumberOfDays = totalNumberOfDays + 30;
        }
        monthNumber = monthNumber + 1;
    }
    System.out.print("Total number of days: ");
    System.out.println(totalNumberOfDays);

}
}
