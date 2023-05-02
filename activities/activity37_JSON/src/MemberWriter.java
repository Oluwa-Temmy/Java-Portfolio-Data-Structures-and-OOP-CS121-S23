import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class MemberWriter {
    public static void main(String[] args) {
        try {
            Members member = new Members("Bang PD", 1972, "GodFather of Kpop");
            Gson gson = new Gson();

            String jsonstring = gson.toJson(member);

            FileWriter fileWriter = new FileWriter("BTSmembers.json");
            fileWriter.write(jsonstring);
            fileWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
