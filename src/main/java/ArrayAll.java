import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAll {
    public  static  void  main(String[] args){
        //declear array
       String[] a= new String[3];
        a[0]="neha";
        a[1]="love";
        a[2]="lom";
       // System.out.println(a[0]);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        String[] a1={"neha","kumari","it"};
        System.out.println(a1[2]);
        int[] g={1,6,9,0,3,5};
        for (int i=g.length-1;i>0;i--){
            System.out.println(g[i]);
        }
        String[] name={"neha","ninu","pinu","jinu"};
        for (String h:name){
            System.out.println(h);
        }
      int[] k={1,2,4,5,6,8,122,9};
        for (int i=0;i<k.length;i++){
            if (k[i]%2==0){
                System.out.println(k[i]);
            }
            else {
                System.out.println(k[i]+"it is not multiplr of 2");
            }
        }
        //array arrayList
        ArrayList<String> h=new ArrayList<String>();
        h.add("kajal");
        h.add("liptick");
        h.add("foundation");
        h.add("compact");
        h.add("hightliter");
        System.out.println(h.remove(1));
        System.out.println(h.get(3));
        for (int i=0;i<h.size();i++){
            System.out.println(h.get(i));
        }
        System.out.println("=========================================================");
        for (String j:h){
            System.out.println(j);

        }
        //item is present in arraylist??
        System.out.println(h.contains("kajal"));
        System.out.println(h.contains("pure"));
        System.out.println("----------------------------------------------");
        //array to arraylist
        String[] unique={"neha","nehu","nehaji","nehlata","namo"};
        List<String> nameArray = Arrays.asList(unique);
       System.out.println( nameArray.contains("nehaji"));
        System.out.println("----------------------------------------------");
        String s="neha";
        String s1="neha";
        String s2=new String("welcome");
        String s3=new String("Welcome");
        String f5="neha is my love one";
        for (int i=0;i<f5.length();i++){
            f5.charAt(i);
            System.out.println(f5.charAt(i));
        }
        System.out.println("----------------------------------------------");
       String[] g1= f5.split("");
        for (int i=0;i<f5.length();i++){
            System.out.println(g1[i]);
        }
        System.out.println("----------------------------------------------");
        for (int i=f5.length()-1;i>=0;i--){
            System.out.println(f5.charAt(i));
        }
        System.out.println("----------------------------------------------");
       String[] x= f5.split("is");
       System.out.println(x[0]);
       System.out.println(x[1].trim());
        System.out.println("----------------------------------------------");

       String[]  y= f5.split(" ");
       for (int i=0;i<y.length;i++){
           System.out.println(y[i]);
       }
        System.out.println("----------------------------------------------");

        System.out.println(y[0]+y[1]+y[2]+y[3]);
        //String v= Arrays.toString(f5.split(" "));







    }
}
