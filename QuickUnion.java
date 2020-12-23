package com.algorithms1;

public class QuickUnion {
private int[] id;
 public QuickUnion(int n)
 {
   id = new int[n];
   for (int i = 0; i < n; i++)
   {
     id[i] = i;
   }
 }
 public int root(int i)
 {
   while(i != id[i]) 
    i = id[i];
    
   return i;
 }
 public void Union(int p, int q)
 {
   int proot = root(p);
   int qroot = root(q);
   id[proot] = qroot;
   System.out.println("Union Accomplished");

 }
 public boolean Connected(int p, int q)
 {
   return root(p) == root(q);
 }
}
