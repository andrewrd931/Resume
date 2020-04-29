import java.io.*;
import java.util.ArrayList;

public class Reader {
    public void readFile()
    {
        ArrayList<String> listProjects = new ArrayList<>();
        File newFile = new File("Projects");
        BufferedReader br = null;
        String line = "";
        String splitVar = ",";
        try {
            br = new BufferedReader(new FileReader(newFile));
            while ((line = br.readLine()) != null)
            {
                listProjects.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for(int i = 0; i < listProjects.size(); i++)
        {
            System.out.println(listProjects.get(i));
        }
    }
}
