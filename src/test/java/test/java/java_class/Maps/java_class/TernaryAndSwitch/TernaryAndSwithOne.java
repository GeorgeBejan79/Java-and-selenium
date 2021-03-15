package test.java.java_class.TernaryAndSwitch;

public class TernaryAndSwithOne {
    public static void main(String[] args) {
        String roomName="Room 1";
        switch(roomName){
        case "Room1":
            System.out.println("Science");

        case "Room2":
                System.out.println("Math");

        case "Room3":
                System.out.println("Computer");
                break;
        default:
                System.out.println("There is no room");
                break;
        }
    }
}
