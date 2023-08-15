package javaConcepts;

interface A{
    void show();
}
interface B{
    void show();
}
 class MultipleInheritance implements A,B{
    public void show() {
        System.out.println("A&B");
    }
    public static void main(String args[]){
        MultipleInheritance m = new MultipleInheritance();
        m.show();
     }
}
