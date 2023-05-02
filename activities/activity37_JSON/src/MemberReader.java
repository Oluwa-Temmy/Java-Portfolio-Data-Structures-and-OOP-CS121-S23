import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MemberReader {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("BTSmembers.json"));

            Members member = gson.fromJson(reader, Members.class);

            System.out.println("****Member Details****");
            System.out.printf("Member name: %s\nMember Birth year: %d\nMember Line: %s",
                    member.name, member.dob,member.line);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
