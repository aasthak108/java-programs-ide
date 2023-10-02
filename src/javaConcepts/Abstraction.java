package javaConcepts;
abstract class Number{
    private int num;
    public Number(int num){
        this.num =num;
    }

    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    abstract public void getNumber();
}
class Id extends Number{
    Id(int num){
        super(num);
    }
    @Override
    public void getNumber(){
        System.out.println(""+ getNum());
    }
}
public class Abstraction {
    public static void main(String[] args){
        Id id = new Id(9);
        id.getNumber();
    }
}
