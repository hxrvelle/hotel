package hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        String command;
        while (true){
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
            if (command.equals("/getFreeRooms")) {
                hotel.getFreeRooms();
            } else if (command.equals("/reserve")) {
                hotel.reserve();
            } else if (command.equals("/getReservedRooms")) {
                hotel.getReservedRooms();
            }
        }
    }
}
