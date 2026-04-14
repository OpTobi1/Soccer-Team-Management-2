package soccerteam;

public class Forward extends SoccerPlayer {

    public Forward(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        String result="Player-number:\t"+super.getPlayerNumber();
        result+="\tposition: forward   ";
        result+="\tage:"+"\t"+super.age;
        result+="\tname:"+"\t"+super.name;
        result+="\t\tnumber of goals:"+statistics;
        return result;
    }
}