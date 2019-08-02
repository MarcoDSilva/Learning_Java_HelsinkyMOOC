import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        //top 10 player by goals
        System.out.println("Top ten by goals\n");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //top 25 by penalty ammounts
        System.out.println("\nTop 25 by penalties\n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //sidney crosby
        System.out.println("\nSidney Crosby stats:\n");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //stats for Philadelphia Flyers
        System.out.println("\nPHI team stats:\n");
        NHLStatistics.teamStatistics("PHI");
      
        //anaheim players by points
        System.out.println("\nDucks by points:\n");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
