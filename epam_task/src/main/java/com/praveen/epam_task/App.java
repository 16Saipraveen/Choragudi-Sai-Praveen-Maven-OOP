package com.praveen.epam_task;

/**
 * Hello world!
 *
 */
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
        ArrayList<Sweet> gifts = new ArrayList<Sweet>();

        Sweet s1 = new Chocolate("Dairy Milk",85,20,100);
        gifts.add(s1);
        Sweet s2 = new Chocolate("Snickers", 50, 15,80);
        gifts.add(s2);
        Sweet s3 = new Candy("Lollypop",30,8,25);
        gifts.add(s3);
        Sweet s4 = new Candy("Medallions",95,30,30);
        gifts.add(s4);
        Sweet s5 = new Chocolate("Perk",30,10,20);
        gifts.add(s5);
        Sweet s6 = new Chocolate("BarOne",40,20,90);
        gifts.add(s6);
        Sweet s7 = new Candy("Peppermints",50,35,50);
        gifts.add(s7);
        Sweet s8 = new Jellybean("Apple Flavour",45,25,60);
        gifts.add(s8);
        Sweet s9 = new Jellybean("Mango Flavour", 55, 20,40);
        gifts.add(s9);
        Sweet s0 = new Candy("Milk Bar",60,40,35);
        gifts.add(s0);

        
        ArrayList<Sweet> chocos = new ArrayList<Sweet>();
        for(Sweet p : gifts){
            if(p instanceof Chocolate) chocos.add(p);
        }
        System.out.println("Options category");
        System.out.println("1 - Cost");
        System.out.println("2 - Weight");
        System.out.println("3 - Sweetness");
        System.out.println("Enter option to sort chocolates by ");
        int op = sc.nextInt();
        if(op == 1) {
            System.out.println("Sorted order of Chocolates by Cost");
            Collections.sort(chocos,new CostSort());
            for(Sweet p : chocos){
            	System.out.println(p.name+" cost is "+p.cost+" weigth of chocolate is "+p.weight+"gms"+" sweetness is "+p.sweetfactor);
            }
            System.out.println();
        }
        else if(op == 2) {
            System.out.println("Sorted order of Chocolates by Weight");
            Collections.sort(chocos,new WeightSort());
            for(Sweet p : chocos){
            	System.out.println(p.name+" cost is "+p.cost+" weigth of chocolate is "+p.weight+"gms"+" sweetness is "+p.sweetfactor);
            }
            System.out.println();
        }
        else if(op == 3) {
            System.out.println("Sorted order of Chocolates by Sweet Factor");
            Collections.sort(chocos,new FactorSort());
            for(Sweet p : chocos){
            	System.out.println(p.name+" cost is "+p.cost+" weigth of chocolate is "+p.weight+"gms"+" sweetness is "+p.sweetfactor);
            }
            System.out.println();
        }

        
        int TotWeight = 0;
        for(Sweet p : gifts){
        	TotWeight += p.weight;
        }
        System.out.println("Total weight of gifts is : "+TotWeight);
        System.out.println();

        
        System.out.println("Enter option to Categorize candies by");
        int cop = sc.nextInt();
        System.out.println("Enter range of values");
        int low = sc.nextInt();
        int high = sc.nextInt();
    	int CandyCount = 0;
    	ArrayList<Sweet> cd = new ArrayList<Sweet>();
    	
        if(cop == 1) {
            for(Sweet p : gifts){
            	if(p instanceof Candy && p.cost >= low && p.cost <= high) {
            		CandyCount++;
            		cd.add(p);
            	}
            }
        }
        else if(cop == 2) {
            for(Sweet p : gifts){
            	if(p instanceof Candy && p.weight >= low && p.weight <= high) {
            		CandyCount++;
            		cd.add(p);
            	}
            }
        }
        else if(cop == 3) {
            for(Sweet p : gifts){
            	if(p instanceof Candy && p.sweetfactor >= low && p.sweetfactor <= high) {
            		CandyCount++;
            		cd.add(p);
            	}
            }
        }
        System.out.println("Number of Candies is given range: "+CandyCount);
        System.out.println("Candies are");
        for(Sweet p:cd) {
        	System.out.println(p.name+" cost is "+p.cost+" weigth of chocolate is "+p.weight+"gms"+" sweetness is "+p.sweetfactor);
        }
        sc.close();
    }
}
