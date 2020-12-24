package com.algorithms1;

import java.util.*;


public class WeightedQuickUnion
{
private int[] id;
private int[] size;
 public WeightedQuickUnion(int n)
 {
   id = new int[n];
   size = new int[n];
   for (int i = 0; i < n; i++)
   {
     id[i] = i;
     size[i] = 1;
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
   if(size[proot] >= size[qroot])
   {
    id[qroot] = proot;
    size[proot] += size[qroot];
   }
   else
   {
    id[proot] = qroot;
    size[qroot] += size[proot];
   }
   System.out.println("Union Accomplished");

 }
 public boolean Connected(int p, int q)
 {
   return root(p) == root(q);
 }
}
