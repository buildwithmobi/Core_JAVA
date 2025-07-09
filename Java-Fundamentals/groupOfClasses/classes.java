package groupOfClasses;

public class classes {
    public static void main(String[] args){

        Lens lensOne =new Lens(
                "Rayben",
                "85mm",
                true);
        Lens lensTwo =new Lens(
                "Gucci",
                "85mm",
                true);
        System.out.println(lensOne.brand);
        System.out.println(lensTwo.brand);
    }
    static class Lens{
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime){
            // this.memberVariable = Argument;
            this.brand=brand;
            this.focalLength=focalLength;
            this.isPrime=isPrime;

        }
    }
}
