/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author 405-48
 */
class rectangle
{
    protected int length;
    protected int breadth;

    public rectangle()
    {
        length = 20;
        breadth = 30;
    }

    public int area()
    {
        int area = length*breadth;
        return area;
    }
    public void show()
    {
        System.out.println("Length = "+length);
        System.out.println("Bredth = "+breadth);
        System.out.println("Area = "+area());
    }
}

class cuboid extends rectangle
{
    protected int height;

    public cuboid()
    {
        height = 10;
    }

    public int volume()
    {
        int vol = area()*height;
        return vol;
    }
    public void show()
    {
        System.out.println("Length = "+length);
        System.out.println("Bredth = "+breadth);
        System.out.println("Height = "+height);
        System.out.println("Area = "+area());
        System.out.println("Voulume = "+volume());
    }
}


public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        rectangle r1 = new rectangle();
        r1.show();
        System.out.println("/n ****** /n");
        cuboid c1 = new cuboid();
        c1.show();
        // TODO code application logic here
    }

}
