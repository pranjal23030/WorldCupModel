package model;

public class Players {
    String Name;

    public Players(String name, int id, int age, int rating) {
        Name = name;
        this.id = id;
        this.age = age;
        this.rating = rating;
    }

    int id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    int age;
    int rating;

}
