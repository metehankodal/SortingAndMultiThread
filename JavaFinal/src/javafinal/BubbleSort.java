/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

/**
 *
 * @author meteh
 */
public class BubbleSort implements StrategyInterface {
    //long saatBaslangici=System.nanoTime();
    int a=0;//oylesine değiştirme yapmam gereken yerlerde değiştirdiğim veriyi kaybetmeden tutmak için yazdım bunu.
    
    //ilk olarak dışarıdaki döngü arrayın sayısı kadar dönecek.
    //çünkü her bir kıyaslamanın bittiğinden emin olmak için en kötü ihtimalle sürekli değiştirme yapmam gerekebilir.
    //asıl mantık olarak sürekli array içerisindeki en büyük sayıyı arıyoruz ve onu en sağa itiyoruz.
    //artık en sağdakini kontrol etmemize gerek yok o yüzden kıyaslama yapacağımızı arrayi bir küçülterek aramaya devam ediyoruz.
    //o yüzden içerideki döngüde sondaki kıyaslamayı yapmazsan daha optimize olur diye düşündüm o yüzden iç döngüyü dışarıdaki döngü daha az dönecek şekilde azalttım.
    
    @Override
    public void sortArray(int[] sıralanacakListe) {
        for(int x=0;x<sıralanacakListe.length-1;x++)
        {
           for(int y=0;y<sıralanacakListe.length-x-1;y++)
            {
              if(sıralanacakListe[y]>sıralanacakListe[y+1])
              {
                  a=sıralanacakListe[y];
                  sıralanacakListe[y]=sıralanacakListe[y+1];
                  sıralanacakListe[y+1]=a;
              }
            } 
        }
        //long programBitisi=System.nanoTime();
      
        
        System.out.println(Arrays.toString(sıralanacakListe));
        //System.out.println("Bu bubble sort "+ (programBitisi-saatBaslangici) + " nanosaniyede çalıştı");//buraya kodun çalışma süresini yaz.
          
    }
    
    
}
