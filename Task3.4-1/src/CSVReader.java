import java.io.*;
import java.net.*;
public class CSVReader {
    public static void main(String[] args) {
        String FILENAME = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        double sum = 0;
        int count = 0;
        try {URL url = new URL(FILENAME);
            InputStream stream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            String line;
            boolean header = true;
            int ulkoTaloIndex = -1;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");
                if (header) {
                    for (int i = 0; i < columns.length; i++) {
                        if (columns[i].equals("UlkoTalo")) {
                            ulkoTaloIndex = i;
                        }
                    }
                    header = false;
                }
                else {if (columns[0].startsWith("01.01.2023")) {
                        double temperature = Double.parseDouble(columns[ulkoTaloIndex].replace(",", "."));
                        sum += temperature;
                        count++;
                    }
                }
            }
            reader.close();
            double average = sum / count;
            System.out.println("Average temperature on 01.01.2023: " + average);
        }
        catch (IOException e) {
            System.out.println("Error while closing the file " + FILENAME);
        }
    }
}