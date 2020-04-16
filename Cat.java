import java.util.ArrayList;

public class Cat {

    private String name;
    private int age;
    private String mood;
    private String breed;

    public Cat (String name, int age, String mood, String breed){
        this.name = name;
        this.breed = breed;
        this.mood = mood;
        this.age = age;
    }



    public void Talk (){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMood() {

        if ( mood.equals("hungry")){
            mood = "RAWR";
        } else if ( mood.equals("sleepy")){
            mood = "meow";
        } else if ( mood.equals("angry")){
            mood = "hsss";
        } else if ( mood.equals("happy")){
            mood = "purrrr";
        } else if ( mood.equals("crazy")){
            mood = "sdfsghetjst";

        }
        return mood;
    }

    private String getBreed () {
        return breed;
    }
}
