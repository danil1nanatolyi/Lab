package com.company;
enum Season{
    Winter(-24), Summer(30),Spring(18), Autumn(9);
}
public  String getDescription(){
    return "Теплое время года";
}
}


public class Main {

    public static void main(String[] args) {
        Season season = Season.Summer;
        System.out.println(season);
        print(Season.Autumn);
        printAllValues();

    }

    public static void print(Season season) {
        switch (season) {
            case Winter:
                System.out.print("Я люблю зиму");
                break;
            case Spring:
                System.out.print("Я люблю весну");
                break;
            case Summer:
                System.out.print("Я люблю лето");
                break;
            case Autumn:
                System.out.print("Я люблю осень");
                break;
        }
    }

    public static void printAllValues() {
        for (Season s : Season.values()) {

        }
    }
}