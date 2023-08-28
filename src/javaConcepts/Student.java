package javaConcepts;

import java.util.Scanner;

public class Student {

    int[] roll;
    String[] name;
    Student(int[] roll, String[] name){
        this.roll = roll;
        this.name = name;
    }
    public void details(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<2;i++) {
            System.out.println("name");
            name[i] = sc.nextLine();
            System.out.println("roll");
            roll[i]= sc.nextInt();
            sc.nextLine();
        }
        for(int i=0;i<2;i++){
            System.out.println("" + name[i]);
            System.out.println(""+ roll[i]);
        }
    }

    public static void main(String[] args){
        int[] rollarr= new int[2];
        String[] namearr = new String[2];
        Student s = new Student(rollarr,namearr);
        s.details();
    }
}
