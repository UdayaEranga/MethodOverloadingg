public class Strin {
    void display (double a){
        System.out.println("Double!");
    }
    void display (String b){
        System.out.println("String!");
    }

    public static void main(String[] args) {
        Strin si = new Strin();
        si.display("gawesh");
        si.display(78.90);
    }
}
