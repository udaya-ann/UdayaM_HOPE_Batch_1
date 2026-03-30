class Library{
    int id=304;
    String name="Reading Stall";
    void showLibrary(){
        System.out.println(id+" "+name);
    }
}
class Book extends Library{
    int id=303;
    String name="Python";
    void showBook(){
        showLibrary();
        System.out.println(id+" "+name);
    }
}
class Member extends Library{
    int id=302;
    void showMember(){
        showLibrary();
        System.out.println(id);
    }
}

public class Librarymanagementsys {
    public static void main(String[] args) {
        Book b = new Book();
        b.showBook();

        Member m = new Member();
        m.showMember();
    }
}
