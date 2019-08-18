
import java.util.ArrayList;

public class Team {

    private ArrayList<Player> playerList = new ArrayList<Player>();
    private String name;
    private int maxSize = 16;

    //team name
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //adding players to the team arraylist
    public void addPlayer(Player player) {
        int size = this.size();
        if (size < this.maxSize) {
            this.playerList.add(player);
        }
    }

    public void printPlayers() {
        String existingPlayers = "";

        for (Player players : playerList) {
            existingPlayers += players + "\n";
        }
        System.out.println(existingPlayers);
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        int size = 0;
        for (Player player : playerList) {
            size++;
        }
        return size;
    }

    public int goals() {
        int goals = 0;
        for (Player player : playerList) {
            goals += player.goals();
        }
        return goals;
    }
}
