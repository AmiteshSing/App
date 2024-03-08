abstract class dimension{
    double area;
    float length;
    float breadth;
    float base;
    abstract void Area();
}

class rectangle extends dimension{
    rectangle(float l,float b){
        length = l;
        breadth = b;
    }
    void Area(){
        area = length * breadth;
        System.out.println(area);
    }
}

class triangle extends dimension{
    triangle(float l, float bas){
        length = l;
        base = bas;
    }
    void Area(){
        area = 0.5*length*base;
        System.out.println(area);
    }
}
public class Base{
    public static void main(String args[]){
        dimension obj = new rectangle(10,10);
        dimension obj1 = new triangle(5,10);
        obj.Area();
        obj1.Area();
    }
}