public class Main {
    public static void main(String[] args) {

        Addable addable = (a,b)->(a+b);
        System.out.println(addable.add(5,7));

        Drawble drawble = (width, height)-> /*One statment '{}" */System.out.println("Drawing : ) width : " + width+ " Hieght : "+ height);


        /*Drawble drawble = new Drawble() {
            @Override
            public void draw() {
                System.out.println("Hello : )");
            }
        };*/
        drawble.draw(200,200);

    }
}

interface  Addable{
    int add(int a, int b);
}
interface Drawble{
    public void draw(int width,int height);
}