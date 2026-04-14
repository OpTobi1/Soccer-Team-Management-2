package soccerteam;

public class MainSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer s1 = new SoccerPlayer("Messi", 36);
        Forward f1 = new Forward("Ronaldo", 36);
        Defence d1 = new Defence("Araujo", 24);
        Midfield m1 = new Midfield("Modric", 35);
        Goalkeeper g1 = new Goalkeeper("Navas", 34);

        System.out.println("Print all soccer players:");
        System.out.println("=========================");
        System.out.println(s1 + "\n" + f1 + "\n" + d1 + "\n" + m1 + "\n" + g1);
    }
}