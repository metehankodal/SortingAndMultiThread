/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

import java.util.Arrays;

/**
 *
 * @author meteh
 */
public class InsertionSort implements StrategyInterface{
    long saatBaslangici=System.nanoTime();
    int keyValue=0;
    int j;
    int a;//bunu da diğerinde yaptığım gibi geçici bir değer olsun diye tuttum.
    //bu selection stilinde sayıların sol tarafını sürekli düzenleyerek devam edicem.
    //böylelikle her bir kıyası tekrar yapmam gerek kalmayacak
    //bubbleın aksine tekrar tekrar yaptığım kıyaslamaları yapmama gerek yok.(en azından bazıları için)
    
    @Override
    public void sortArray(int[] sıralanacakListe) {
        //InsertionSort yapan algoritma.
        for(int i=1;i<sıralanacakListe.length;++i)
        {
            keyValue=sıralanacakListe[i];
            j=i-1;
            while(j>=0 && sıralanacakListe[j]>keyValue)
            {
                sıralanacakListe[j+1]=sıralanacakListe[j];
                j=j-1;
                
            }
            sıralanacakListe[j+1]=keyValue;
        } 
        System.out.println(Arrays.toString(sıralanacakListe));
        
    }
    
   
    
    
    
}
