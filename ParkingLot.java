import java.util.Scanner;

public class ParkingLot {
    public static int maxCarsInParkingLot(String arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length(); i++) {
            if (arr.charAt(i) == 'S') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the parking lot representation: ");
        String arr = sc.nextLine();

        System.out.println("Maximum number of cars that can park consecutively: " + maxCarsInParkingLot(arr));

        sc.close();
    }
}
