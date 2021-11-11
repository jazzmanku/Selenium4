package test;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String[] strArray = new String[5];
        strArray[0] = "2323";
        strArray[1] = "232dfgd3";
        strArray[2] = "dfsg";
        strArray[3] = "232dfg3";
        strArray[4] = "564356d";

//        for(int i=0;i<strArray.length;i++){
//            System.out.println(strArray[i]);
//        }


        List<String> stringList = new ArrayList<>();
        stringList.add("32443");
        stringList.add("345");
        stringList.add("3244345343");
        stringList.add("rfegdf");
        stringList.add("dfgd");

        System.out.println("Items in the list: " + stringList.size());
        System.out.println("345 exist? : " + stringList.contains("345"));
        for(String temp : stringList){
            //if(!temp.equals("345"))
                System.out.println(temp);
        }
        System.out.println("===================================");
        stringList.remove("345");
        System.out.println("345 exist? : " + stringList.contains("345"));
        System.out.println("Items in the list: " + stringList.size());
        for(String temp : stringList){
            //if(!temp.equals("345"))
            System.out.println(temp);
        }

    }
}
