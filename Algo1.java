package com.algorithms1;

import com.algorithms1.QuickFind;
import com.algorithms1.QuickUnion;
import com.algorithms1.WeightedQuickUnion;


public class Algo1 {

  public static void main(String[] args) {
   System.out.println("Hello to algorithms");
   System.out.println("Quick find");
   QuickFind quick = new QuickFind(10);
   quick.Union(1,8);
   boolean hmm = quick.Connected(1,8);
   System.out.println(hmm);
   
   System.out.println("Quick Union");
   QuickUnion quicko = new QuickUnion(10);
   quicko.Union(1,8);
   boolean hmmo = quicko.Connected(1,8);
   System.out.println(hmmo);
   
   System.out.println("Weighted Quick Union");
   WeightedQuickUnion quickom = new WeightedQuickUnion(10);
   quickom.Union(1,8);
   quickom.Union(1,9);
   boolean hmmol = quickom.Connected(1,8);
   boolean check2 = quickom.Connected(1,9);
   System.out.println(hmmol);
   System.out.println(check2);
   
  }
}
