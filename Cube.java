import javax.swing.plaf.synth.SynthPanelUI;

public class Shape
{
    private int longeur;

        Shape(int longeur) {
            this.longeur = longeur;
        }
        int perimeter(){
            System.out.println("???Donnez les dimensions???");
        }
        int area(){
            System.out.println("???Donnez les dimensions???");
        }


}
public class Cube extends Shape
{
    private int x;
    private int y;
    private int longeur;

    Cube(int x, int y, int longeur){
        super(longeur);
        this.x = x;
        this.y = y;


    }
    @Override
    int perimeter(){
        return 2 * x *y ;
    }
    int area(){
        return longeur * x *y ;;
    }
}
public class Prism extends Shape
{
    private int h;
    private int base;
    private int longeur;

    Prism(int h, int base, int longeur){
        super(longeur);
        this.h = h;
        this.base = base;


    }
    @Override
    int perimeter(){
        System.out.println("Non donné pour un prisme");
        return 0;
    }
    int area(){
        return longeur * base *h/2 ;
    }
}
public class Cylender extends Shape
{
    private int rayon;
    private int longeur;

    Cylender(int rayon, int longeur){
        super(longeur);
        this.rayon = rayon;
            }
    @Override
    int perimeter(){
        return 2 * 3.14 * rayon ;
    }
    int area(){
        return 3.14 * rayon * rayon *longeur ;
    }
}
public class firstObject {
    public static void main(String[] args) {
    
        Cube c1 = new Cube(10,20,30);

        Prism p2 = new Prism(29,67,87);
    
        Cylender C3 = new Cylender(35,89);
    
        System.out.println(c1.area());
        System.out.println(p21.perimeter());
        System.out.println(c3.perimeter());
        System.out.println(p2.area());
    }
}