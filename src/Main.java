import model.Players;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Players> RcbPlayers = new ArrayList<Players>();
        Players r1 = new Players("Kohli", 12,32, 799);
        RcbPlayers.add(r1);
        Players r2 = new Players("ABD", 13,35, 678);
        RcbPlayers.add(r2);
        Players r3 = new Players("Gayle", 14,37,600);
        RcbPlayers.add(r3);

        ArrayList<Players> CskPlayers = new ArrayList<Players>();
        Players c1 = new Players("Dhoni", 15,39, 800);
        CskPlayers.add(c1);
        Players c2 = new Players("Root", 16,40, 718);
        CskPlayers.add(c2);
        Players c3 = new Players("Jadeja", 17, 41, 719);
        CskPlayers.add(c3);

        ArrayList<Players> MiPlayers = new ArrayList<Players>();
        Players m1 = new Players("Babar", 19, 32, 456);
        MiPlayers.add(m1);
        Players m2 = new Players("Rohit", 20, 33,456);
        MiPlayers.add(m2);
        Players m3 = new Players("Bumrah", 21, 34, 360);
        MiPlayers.add(m3);
    }
}