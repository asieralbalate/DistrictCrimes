import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrimeFreq {
    public static void main(String[] args) {
        Map<String, Integer> map = readCSV();
        writeObjects();
    }

    private static Map<String, Integer> readCSV() throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader("Crimes.csv"));
            input.readLine();
            String line;
            while ((line = input.readLine()) != null) {
                String[] items = line.split(",");
                String crimeDesc = items[5];
                Integer num = map.get(crimeDesc);
                map.put(crimeDesc,num == null ? 1 : num + 1);
            }
            return map;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    private static void writeObjects(Map<String, Integer> map) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Crimes.csv")));
        }finally{
            if(out != null) {
                out.close();
            }
        }
    }
}
