package model;

import java.util.ArrayList;

public class Group {
    public Group(ArrayList<Team> team, String name) {
        this.team = team;
        Name = name;
    }

    public ArrayList<Team> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Team> team) {
        this.team = team;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    ArrayList<Team> team;
    String Name;
}
