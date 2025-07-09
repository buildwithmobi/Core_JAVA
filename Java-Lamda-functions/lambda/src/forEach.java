import java.util.ArrayList;
import java.util.List;

public class forEach {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Mubashir");
        nameList.add("Abid");
        nameList.add("Mian");


        nameList.forEach((names)-> System.out.println(names));
        for (String names : nameList){
            System.out.println(names);
        }
    }
}
