package com.java.gly;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int q = sc.nextInt();
            int k = sc.nextInt();
            Queue<String> queue = new LinkedList<>();
            Map<String, List<Integer>> hashMap = new HashMap<>();
            for(int i=0;i<q;i++){
                String command = sc.next();
                if(command.equals("E")){
                    String college = sc.next();
                    int roll = sc.nextInt();
                    if(hashMap.containsKey(college)){
                        List<Integer> tempList = hashMap.get(college);
                        if(tempList.size()>=k)
                            continue;
                        tempList.add(roll);
                        Collections.sort(tempList);
                        hashMap.put(college,tempList);
                    }
                    else{
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(roll);
                        queue.add(college);
                        hashMap.put(college,tempList);
                    }
                }
                else{
                    String school = queue.peek();
                    List<Integer> tempList = hashMap.get(school);
                    int roll = tempList.remove(0);
                    hashMap.put(school,tempList);
                    System.out.println(school+" "+roll);
                    if(tempList.size()==0){
                        hashMap.remove(school);
                        queue.remove();
                    }
                }

            }
        }
    }
}
