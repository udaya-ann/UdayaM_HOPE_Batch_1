class Name{
    String name;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}



public class GetterSetterEx {
    public static void main(String[] args) {
        Name n=new Name();
        n.setName("Ann");
        System.out.println(n.getName());
    }
}
