package javaConcepts;

    interface A2{
        void show();
    }
    interface B2{
        void show();
    }
    class MultipleInheritance2 implements A2,B2{
        public void show(){
            System.out.println("A&B");
        }
        public void showA(){
            System.out.println("A");
        }
        public static void main(String args[]){
        MultipleInheritance2 m = new MultipleInheritance2();
            m.show();
            m.showA();
        }
    }


