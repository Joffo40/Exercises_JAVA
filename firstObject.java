public class firstObject {
    public static void main(String[] args) {
    
        Cube c1 = new Cube(10,20,30);

        Prism p2 = new Prism(29,67,87);
    
        Cylender c3 = new Cylender(35,89);
    
        
        double value1 = c1.volume();
        System.out.println(value1);
        System.out.println(p2.area());
        System.out.println(c3.area());
        System.out.println(p2.volume());
    }
}
class Shape
{
    protected double longeur;

        public Shape(double longeur) {
            this.longeur = longeur;
        }
        public double perimeter(){
            System.out.println("???Donnez les dimensions???");
            return 0;
        }
        public double area(){
            System.out.println("???Donnez les dimensions???");
            return 0;
           
        }


}
class Cube extends Shape
{
    private double x;
    private double y;
    

    

    public Cube( double longeur, double x, double y){
        super(longeur);
        this.x = x;
        this.y = y;


    }
    @Override
    public double area(){
        return  x * y ;
    }
    public double volume(){
        return longeur * x * y;
    }
}
class Prism extends Shape
{
    private double h;
    private double base;
    

    public Prism(double h, double base, double longeur){
        super(longeur);
        this.h = h;
        this.base = base;


    }
    @Override
    public double area(){
        System.out.println("Non donné pour un prisme");
        return 0;
    }
    public double volume(){
        return longeur * base *h/2 ;
    }
}
class Cylender extends Shape
{
    private double rayon;
    private double longeur;

    public Cylender(double rayon, double longeur){
        super(longeur);
        this.rayon = rayon;
            }
    @Override
    public double area(){
        return 3.14 * rayon *rayon;
    }
    public double volume(){
        return 3.14 * rayon * rayon * longeur ;
    }
}

