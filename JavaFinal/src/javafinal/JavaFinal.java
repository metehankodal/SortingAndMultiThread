/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author meteh
 */
public class JavaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //****************************************************************************************************************************
        //CLASSIN ADINI DEGISTIRMEYI UNUTMUSUM BURADA IKINCI SORUNUN DENEME CLASSI VAR.............................................***
        //IKINCI SORU DENEME............................................................**********************************************
       //*****************************************************************************************************************************
        Random rastgele = new Random();
        int[] randomListe= new int[100];
        
        
        
        for(int i=0;i<100;i++)
        {
            randomListe[i]=rastgele.nextInt(1000);
        }
        int[] randomListeKopya1=randomListe.clone();//burada aynı arraylere çalışmak istediğim için arrayleri sortladığımdan aynı array içeriklerini insertionSortta kullanmak için kopyaladım
        int[] randomListeKopya2=randomListe.clone();//gene aynı arrayı kıyaslamak istediğim içim quicksort içinde bunu kullandım.
        System.out.println("Sıralama yapılmadan önce listenin ilk hali........");
        System.out.println(Arrays.toString(randomListe));
        
        Context context =new Context(new BubbleSort());
        long bubbleYapmadanOnce=System.nanoTime();
        context.sortla(randomListe);
        long bubbleYapdıktanSonra=System.nanoTime();
        System.out.println("Bubble yapma süresi "+(bubbleYapdıktanSonra-bubbleYapmadanOnce));
        
        context=new Context(new QuickSort());
        long quickSortYapmadanOnce=System.nanoTime();
        context.sortla(randomListeKopya1);
        long quickSortYaptıktanSonra=System.nanoTime();
        System.out.println("Quick yapma süresi "+(quickSortYaptıktanSonra-quickSortYapmadanOnce));
        context=new Context(new InsertionSort());
        long insertionSortYapmadanOnce=System.nanoTime();
        context.sortla(randomListeKopya2);
        long insertionSortYaptıktanSonra=System.nanoTime();
        System.out.println("Insertion yapma süresi "+(insertionSortYaptıktanSonra-insertionSortYapmadanOnce));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
