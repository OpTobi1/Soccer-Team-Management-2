package soccerteam;

public class MainSoccerTeam {

    public static void main(String[] args) {
        SoccerPlayer[] players = getPlayers();

        printPlayers(players, "Players for draft BEFORE updating statistics:");
        int p = numberOfPlayers(players);
        randomPlayerActions(players, p, 30);
        printPlayers(players, "Players for draft AFTER updating statistics:");
        sortByStatistics(players, p);
        printPlayers(players, "Players for draft AFTER SORT by statistics:");
        SoccerPlayer[] team = buildTeam(players, p, 4, 3, 3);
        printPlayers(team, "Barcelona Team Players");
    }

    public static SoccerPlayer[] getPlayers() {
        SoccerPlayer[] players = new SoccerPlayer[20];

        players[0] = new Forward("Ronaldo", 36);
        players[1] = new Forward("Lewandowski", 34);
        players[2] = new Forward("Dembélé", 25);
        players[3] = new Forward("Fati", 20);
        players[4] = new Forward("Raphinha", 26);
        players[5] = new Midfield("Busquets", 34);
        players[6] = new Midfield("Gavi", 19);
        players[7] = new Midfield("Pedri", 20);
        players[8] = new Midfield("Modric", 35);
        players[9] = new Goalkeeper("Navas", 34);
        players[10] = new Goalkeeper("ter Stegen", 31);
        players[11] = new Defence("Araujo", 24);
        players[12] = new Defence("Christensen", 27);
        players[13] = new Defence("Alonso", 32);
        players[14] = new Defence("Ramos", 35);
        players[15] = new Defence("Kounde", 24);
        players[16] = new SoccerPlayer("Isco", 29);
        players[17] = new SoccerPlayer("Nymar", 31);
        players[18] = new SoccerPlayer("Messi", 36);

        return players;
    }

    public static void printPlayers(SoccerPlayer[] players, String title) {
        System.out.println(title);
        for (int i = 0; i < players.length; i++) {
            if (players[i] != null) {
                System.out.println(players[i]);
            }
        }
    }

    public static int numberOfPlayers(SoccerPlayer[] players) {
            int count = 0;
            for (int i = 0; i < players.length; i++) {
                if (players[i] != null) {
                    count++;
                }
            }
            return count;
    }

    public static void randomPlayerActions(SoccerPlayer[] players, int numPlayers, int numActions) {
        for (int i = 0; i < numActions; i++) {
            int randomIndex = drawPlayer(numPlayers);
            if (players[randomIndex] != null) {
                players[randomIndex].addStatistics();
            }
        }
    }

    public static int drawPlayer(int n) {
        return (int) (Math.random() * n);
    }

    public static void sortByStatistics(SoccerPlayer[] players, int p) {
        for (int i = 0; i < p - 1; i++) {
            for (int j = 0; j < p - i - 1; j++) {
                if (players[j].getStatistics() < players[j + 1].getStatistics()) {
                    swapPlayers(players, j, j + 1);
                }
            }
        }
    }

    public static void swapPlayers(SoccerPlayer[] players, int i, int j) {
        SoccerPlayer temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

    public static SoccerPlayer[] buildTeam(SoccerPlayer[] players, int numPlayers, int numD, int numM, int numF) {
        SoccerPlayer[] team = new SoccerPlayer[13];
        int index = 0;

        for (int i = 0; i < numPlayers; i++) {
            if (players[i] instanceof Goalkeeper) {
                team[index++] = players[i];
                break;
            }
        }

        int countD = 0;
        for (int i = 0; i < numPlayers && countD < numD; i++) {
            if (players[i] instanceof Defence) {
                team[index++] = players[i];
                countD++;
            }
        }

        int countM = 0;
        for (int i = 0; i < numPlayers && countM < numM; i++) {
            if (players[i] instanceof Midfield) {
                team[index++] = players[i];
                countM++;
            }
        }

        int countF = 0;
        for (int i = 0; i < numPlayers && countF < numF; i++) {
            if (players[i] instanceof Forward) {
                team[index++] = players[i];
                countF++;
            }
        }

        int countGeneral = 0;

        for (int i = 0; i < numPlayers && countGeneral < 2; i++) {
            if (players[i].getClass() == SoccerPlayer.class) {
                team[index++] = players[i];
                countGeneral++;
            }
        }

        return team;
    }
}