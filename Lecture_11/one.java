package Lecture_11;

import java.util.*;
public class one {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("neer");
        sb.append(" khandor");
        System.out.println(sb);
        sb.insert(4, " B");
        System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        // sb.replace(2, 4,"hello");
        // System.out.println(sb);
        System.out.println(sb.capacity());
        StringBuffer s=new StringBuffer("hello");
        System.out.println(s.capacity());//16+no of char


    }
}
