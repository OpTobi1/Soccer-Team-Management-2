package soccerteam;

public class Defence extends SoccerPlayer {


    public Defence(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString(){
        String result="Player-number:\t"+super.getPlayerNumber();
        result+="\tposition: defence   ";
        result+="\tage:"+"\t"+super.age;
        result+="\tname:"+"\t"+super.name;
        result+="\t\tnumber of tackles:"+statistics;
        return result;
    }
}

