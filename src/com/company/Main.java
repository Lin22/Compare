package com.company;



public class Main {

    public static void main(String[] args) {
	Integer inums[]={3,6,2,8,6};
        Character chs[]={'b','r','p','w'};

        MyClass<Integer> iob=new MyClass<Integer>(inums);
        MyClass<Character>cob=new MyClass<Character>(chs);

        System.out.println("max in nums "+iob.max());
        System.out.println("min in nums"+iob.min() );
        System.out.println("max in chs"+cob.max());
        System.out.println("min in chs"+cob.min());
    }
}
