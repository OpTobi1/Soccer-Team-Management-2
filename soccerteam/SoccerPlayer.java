package soccerteam;


import java.util.Objects;

/**Parent soccer player
 */
public class SoccerPlayer {

    private static int playerCounter=100;//counter for indexing the players
    private final int playerNumber;//number on player shirt
    protected String name;
    protected int age;
    protected int statistics;

    /**constructor
     * @param name String
     * @param age integer
     */
    public SoccerPlayer(String name, int age) {
        setName(name);
        setAge(age);
        playerNumber=playerCounter;
        playerCounter++;
        statistics=0;
    }

    /**Set soccer player name
     * @param name String      */
    public void setName(String name) {
        if (name.length()>0)  this.name = name;
        else this.name="invalid name";
    }
    /**Get soccer player name
     * @return name String      */
    public String getName() {  return name;    }

    /**Set soccer player id
     * @param age int      */
    public void setAge(int age) {
        if (age>0)  this.age = age;
    }

    /**Get: number of the player
     * @return playerNumber
     */
    public int getPlayerNumber() {
        return playerNumber;
    }

    /**Get: returns the largest number of an player
     * @return playerCounter
     */
    public static int getPlayerCounter() {
        return playerCounter;
    }

    /**Increase statistics by one
     */
    public void addStatistics() {  statistics++;  }

    /**Get statistics
     * @return the number of statistics
     */
    public int getStatistics() { return statistics;   }

    /**Override toString
     * @return String
     */
    @Override
    public String toString(){
        String result="Player-number:\t"+playerNumber;
        result+="\tposition: general   ";
        result+="\tage:"+"\t"+age;
        result+="\tname:"+"\t"+name;
        result+="\t\tgeneral statistics:"+statistics;
        return result;
    }

    /**equals: overriding the method
     * @param o object we are comparing to
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SoccerPlayer)) return false;
        SoccerPlayer player = (SoccerPlayer) o;
        System.out.println("in equals - player name "+name);
        return playerNumber == player.playerNumber
                && this.name.equals(player.name)
                && this.age==player.age;
    }

}




