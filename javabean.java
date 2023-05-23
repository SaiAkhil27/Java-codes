
class A implements java.io.Serializable{
    private int id;
    A(){

    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
}
public class javabean {
    public static void main(String[] args) {
        A obj=new A();
        obj.setId(11016);
        int a=obj.getId();
        System.out.println(a);
    }   
}