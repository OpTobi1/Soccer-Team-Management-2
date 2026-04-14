package soccerteam;


public class Midfield extends SoccerPlayer {

    public Midfield(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString(){
        String result="Player-number:\t"+super.getPlayerNumber();
        result+="\tposition: midfield  ";
        result+="\tage:"+"\t"+super.age;
        result+="\tname:"+"\t"+super.name;
        result+="\t\tnumber of passes:"+statistics;
        return result;
    }
}

