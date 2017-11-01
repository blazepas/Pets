package pl.blazej.szczypka.pets;
import java.util.Scanner;

public class Cat extends Animals{

    Cat(){};

    Cat(String petName, String colour, double weight){
        this.petName = petName;
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getpetName(){ return petName; }
    public String getColour(){ return colour; }
    public double getWeight(){ return weight;}
    public void setpetName(String petName){ this.petName = petName; }
    public void setColour(String colour){this.colour = colour;}
    public void setWeight(double weight) {this.weight = weight;}
    /*double goodWeight = 9.0;
    if (this.weight < goodWeight){
        System.out.println("Feed the cat");
        this.weight = weight + 0.4;
    }
    else{
        System.out.println("Kitty is not hungry");
    }*/


    //FileResource res = new FileResource("cat_hello.txt");
    Scanner inputKeybord = new Scanner(System.in);
    int x = 3;
    int y = x + 1;

    public void method(int x, int y) {
        if (x < y) {
            System.out.println("line");
        } else {
            System.out.println("Sorry you are not lucky");
        }

    }
}