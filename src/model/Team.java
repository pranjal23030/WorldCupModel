package model;

import java.util.ArrayList;

public class Team {
    public Team(ArrayList<model.Players> players, String name, String jersey_color, String position) {
        Players = players;
        Name = name;
        this.jersey_color = jersey_color;
        this.position = position;
    }

    public ArrayList<model.Players> getPlayers() {
        return Players;
    }

    public void setPlayers(ArrayList<model.Players> players) {
        Players = players;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJersey_color() {
        return jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        this.jersey_color = jersey_color;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    ArrayList<Players> Players;
    String Name;
    String jersey_color;
    String position;

}
