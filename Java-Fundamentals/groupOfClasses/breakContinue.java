package groupOfClasses;

public class breakContinue {
    public static void main(String[] args) {
        String [] names = {"Eren","Armin","Mikasa"};
        for (String name : names) {
            if(name.startsWith("A")){

                continue;
            }
            else{
                System.out.println("Doesn't starts with letter A");
                break;
            }

        }
    }
}
