import java.util.ArrayList;
import java.util.Collections;

public class Education {
    private ArrayList<String> schools;

    public Education(){
        schools = new ArrayList<>();
    }

    public void setSchools(){
        Collections.addAll(schools, "Howard", "Georgetown", "Georgia Tech", "Emory", "Brwn Mayr", "UMD", "Johns Hopkins", "American", "Catholic", "GW");
    }

    public ArrayList<String> getSchools(){
        return schools;
    }

    @Override
    public String toString(){
        String str = "";
        for (String s:schools){
            str += s + " University, ";
        }
        return str;
    }


}
