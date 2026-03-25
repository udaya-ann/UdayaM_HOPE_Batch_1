class dConst{
    dConst(){
        System.out.println("Inside dConst");
    }
    int x=10;
    dConst(int a){
        System.out.println("Inside parameterized constructor "+a);
       
    }
}

public class defaultConstructor {
    public static void main(String[] args) {
        System.out.println("Inside main method");
        
        dConst dc = new dConst();
        System.out.println(dc.x);
        dConst dc1=new dConst(20);
        System.out.println(dc1.x);
    }
}
