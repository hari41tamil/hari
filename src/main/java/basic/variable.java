package basic;

public class variable {
    String  favfood="dosa";  //global variable
    static int csecount=180;  //static variable
    public void sam()
    {
        int cosmo=65;
        String name="Harini";
        System.out.println(cosmo);
        System.out.println(name);
        System.out.println(favfood);
        System.out.println(csecount);

    }
    public static void main(String[] args){
        System.out.println("Harini");
        //local variable
        //object creation
        //classname objectname=new classname();
        //calling method
        //objectname.methodname();
        variable var=new variable();
        var.sam();
        System.out.println(csecount);
        String favplace="Manali";//instance variable
        System.out.println(favplace );

    }
}
