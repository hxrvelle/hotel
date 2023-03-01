package hotel;

import java.util.Scanner;
public class Hotel {
    private Room[] rooms = {
            new Room(11, 2, true, true, true),
            new Room(12, 1, false, true, false),
            new Room(13, 3, true, false, true),
            new Room(21, 2, false, true, false),
            new Room(22, 1, true, false, true),
            new Room(23, 3, false, true, false),
            new Room(31, 2, true, false, true),
            new Room(32, 1, false, true, false),
            new Room(33, 3, true, false, true)
    };
    public void getFreeRooms() {
        for (Room room : rooms) {
            if(!room.isReserved()){
                System.out.print(room.getNumber() + " ");
            }
        }
        System.out.println("");
    }

    public void reserve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер комнаты: ");
        int num = scanner.nextInt();
        for (Room room : rooms) {
            if(!room.isReserved() && num == room.getNumber()) {
                room.setReserved(true);
                System.out.println("Комната " + num + " забронирована");
            } else if (room.isReserved() && num == room.getNumber()) {
                System.out.println("Невозможно забронировать комнату " + num + ". Комната уже забронирована.");
            }
        }
    }

    public void getReservedRooms() {
        for(Room room : rooms) {
            if(room.isReserved()) {
                System.out.println(room.getNumber() + " ");
            }
        }
        System.out.println("");
    }
}
