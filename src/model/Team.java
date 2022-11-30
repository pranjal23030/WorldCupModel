package model;

public class Team {
    String Name;

    public Team(String name, String jersey_Color, String position) {
        Name = name;
        Jersey_Color = jersey_Color;
        this.position = position;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getJersey_Color() {
        return Jersey_Color;
    }

    public void setJersey_Color(String jersey_Color) {
        Jersey_Color = jersey_Color;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    String Jersey_Color;
    String position;
}
