package Lecs;
import java.util.*;
   public  class Map <K,V> {
   
   ArrayList<MapNode<K,V>> buckets;	   
   int size;
   int numBuckets;
  
   public Map(){
	   numBuckets=5;
	   buckets=new ArrayList<>();
	   for(int i=0;i<20;i++){
		   buckets.add(null);
	   }
   }
   
   public int getbucketIndex(K key) {
	   
   int hashcode=key.hashCode();
   return hashcode%numBuckets;	   
   }
   
	public double loadfactor() {
		return (1.0 * size)/numBuckets;
	}
   
   
   public void  insert(K key,V value) {
   	   
   int bucketIndex=getbucketIndex(key);	   
   MapNode<K,V> head=buckets.get(bucketIndex);
   
   while(head!=null) {
    if(head.key.equals(key)){
      head.value=value;
      return;
    }
    head=head.next;
   }
    head=buckets.get(bucketIndex);
    MapNode<K,V> newelementNode=new MapNode<K,V>(key,value);
    size++;
    newelementNode.next=head;
    buckets.set(bucketIndex,newelementNode);
    double loadfactor=((1.0*size)/numBuckets);
    if(loadfactor>.7) {
    rehash();	
    }
   }
   
   public void  rehash() {
   System.out.println("Rehashing: buckets"+ numBuckets+" size"+ size( ));	   
   ArrayList<MapNode<K,V>> temp=buckets;
   buckets=new ArrayList<>();
   for(int i=0;i<2*numBuckets;i++){
	   buckets.add(null);
   }
   size=0;
   numBuckets*=2;
   for(int i=0;i<temp.size();i++){	   
   MapNode<K,V> head=temp.get(i);
   while(head!=null){
   K key=head.key;
   V value=head.value;
   insert(key,value);
   head=head.next;
   }
   }
   
   
   
   
   
   }
   
   
   
   
   public  int size() {
	   return size;
   }
   
   public  V Getvalue(K key) {
   
   int bucketIndex=getbucketIndex(key);
   MapNode<K,V> head=buckets.get(bucketIndex);
   while(head!=null){
   if(head.key.equals(key)){
    return head.value;        	   
   }
   head=head.next; 
   }
   return null;
   }
  
   public  V remove(K key) {
	  int bucketIndex=getbucketIndex(key);
	   MapNode<K,V> head=buckets.get(bucketIndex);
	   MapNode<K,V> prev=null;
	   while(head!=null){
	   if(head.key.equals(key))
	       
	   {
		   size--;
		  if(prev==null){
		   	 buckets.set(bucketIndex,head.next);
		  }	 else {
		   		 prev.next=head.next;
		  }
		  return head.value;        	   
	   }
	   prev=head;
	   head=head.next; 
	   }
	   return null;
	   }	   
	   
   
   public static  void main(String[] args) {
   Map <Integer,Integer> map=new Map<>();
	for (int i = 0; i < 20; i++) { 
		map.insert(i+2,1 + i);
		System.out.println("i = " +  i + " lf = " + map.loadfactor());}
   
	for(int i=0;i<20;i++){
//    map.insert("abc"+i,1+i );	
    map.insert(i+2,1 + i);
	System.out.println(2+i +":" + map.Getvalue(i+2));	
	}
	
//	System.out.println(map.remove("abc8"));
	
	
	}
   }
   
	


