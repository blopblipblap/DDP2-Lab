import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Simulator {
    public static void main(String[] args) {
        MiddleEarth middleEarth = new MiddleEarth();
        try {
            //TODO: Implement this try block
            List<String> input = readFile("input1.txt");
            for (String line : input) {
                String[] split = line.split("\\s+");
                middleEarth.addCreature(split[0], split[1], split[2]);
            }
            
            System.out.println("THE WAR BEGIN");
            List<String> war = readFile("War1.txt");
            for (String line : war) {
                String[] split = line.split(";");
                middleEarth.doFight(split[0], split[1]);
            }
        }
        catch (CivilWarOccuredException e){
            //TODO: Implement this exception block
            System.out.println(e.toString());
        }
        catch (CantCreateException e) {
            System.out.println(e.toString());
        }
        finally {
                //TODO: Implement this finally block
            System.out.println("MIDDLE EART DESTROYED");
        }
    }

    public static List<String> readFile(String filename) {
        //TODO: Implement this to read input file
        try {
            List<String> content = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                content.add(line);
            }
            br.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
