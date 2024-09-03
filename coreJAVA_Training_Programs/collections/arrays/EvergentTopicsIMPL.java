package com.evergent.corejava.collections.arrays;

import java.util.Arrays;
import java.util.List;

//import com.evergent.corejava.string.immutable.MainPerson;

public class EvergentTopicsIMPL {
public static void main(String[] args) {
   List topics=Arrays.asList(new EvergentTopics("durga","software engineer trainee" , "443"),new EvergentTopics("vaishnav", "develper", "44"),new EvergentTopics("prasad", "tester", "45455"));
   System.out.println(topics);
}
}
