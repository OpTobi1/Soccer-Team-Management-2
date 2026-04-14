package soccerteam;


public class Goalkeeper extends SoccerPlayer {

    public Goalkeeper(String name, int age) {
        super(name, age);

    }
    @Override
    public String toString(){
        String result="Player-number:\t"+super.getPlayerNumber();
        result+="\tposition: goalkeeper";
        result+="\tage:"+"\t"+super.age;
        result+="\tname:"+"\t"+super.name;
        result+="\t\tnumber of saves:"+statistics;
        return result;
    }
}
