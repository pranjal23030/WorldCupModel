import model.Group;
import model.Players;
import model.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //RCB
        ArrayList<Players> RcbPlayers = new ArrayList<Players>();
        Players r1 = new Players("Kohli", 12,32, 799);
        RcbPlayers.add(r1);
        Players r2 = new Players("ABD", 13,35, 678);
        RcbPlayers.add(r2);
        Players r3 = new Players("Gayle", 14,37,600);
        RcbPlayers.add(r3);

        //CSK
        ArrayList<Players> CskPlayers = new ArrayList<Players>();
        Players c1 = new Players("Dhoni", 15,39, 800);
        CskPlayers.add(c1);
        Players c2 = new Players("Root", 16,40, 718);
        CskPlayers.add(c2);
        Players c3 = new Players("Jadeja", 17, 41, 719);
        CskPlayers.add(c3);

        //MI
        ArrayList<Players> MiPlayers = new ArrayList<Players>();
        Players m1 = new Players("Babar", 19, 32, 456);
        MiPlayers.add(m1);
        Players m2 = new Players("Rohit", 20, 33,456);
        MiPlayers.add(m2);
        Players m3 = new Players("Bumrah", 21, 34, 360);
        MiPlayers.add(m3);

        //DC
        ArrayList<Players> DcPlayers = new ArrayList<Players>();
        Players d1 = new Players("Pant", 20, 33,459);
        DcPlayers.add(d1);
        Players d2 = new Players("Hetmeyer", 21,34,567);
        DcPlayers.add(d2);
        Players d3 = new Players("Iyer", 22, 35,897);
        DcPlayers.add(d3);


        //Team List and players added ==>> team bhitra player list
        ArrayList<Team> TeamRCB = new ArrayList<Team>();
        Team t1 = new Team(RcbPlayers, "RCB", "Red", "Top");
        TeamRCB.add(t1);

        ArrayList<Team> TeamCSK = new ArrayList<Team>();
        Team t2 = new Team(CskPlayers, "CSK", "Yellow", "Mid");
        TeamCSK.add(t2);

        ArrayList<Team> TeamMI = new ArrayList<Team>();
        Team t3 = new Team(DcPlayers, "DC", "Blue", "Second");
        TeamMI.add(t3);

        ArrayList<Team> TeamDC = new ArrayList<Team>();
        Team t4 = new Team(MiPlayers, "MI", "Light Blue", "Bottom");
        TeamDC.add(t4);


        //Group List   ==>> group bhitra team list
        Group g1 = new Group(TeamRCB, "A");
        Group g2 = new Group(TeamCSK, "A");
        Group g3 = new Group(TeamDC, "B");
        Group g4 = new Group(TeamMI, "B");

    }
}