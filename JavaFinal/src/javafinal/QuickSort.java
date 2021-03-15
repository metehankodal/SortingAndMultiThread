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
public class QuickSort implements StrategyInterface {
    long saatBaslangici=System.nanoTime();
    //bu algoritma türünde pivot diye bir değişken atıyoruz öncelikle.
    //bu pivot değerini aslında referans noktası olarak tutuyoruz pivot değerlerine göre sayıları sola ve sağa ilk başta sıralama yapmam gerekiyor.
    //ondan sonra pivot değeri ortaya alırsam pivot değerin solundakiler daima kendisinden küçük olur pivota göre kıyasladım çünkü.
    //ama bu işlemi sonra pivotun solu ve sağı içinde yapmam gerek o yüzden pivotun sağı için yeni bir pivot seçim yukarıdaki işlemleri tekrar etmem gerek.
    @Override
    public void sortArray(int[] sıralanacakListe) {
        quickArray(sıralanacakListe,0,sıralanacakListe.length-1);
        
        System.out.println(Arrays.toString(sıralanacakListe));
        long programBitisi=System.nanoTime();
        
    }
    
    
    public void quickArray(int[] sıralanacakListe,int kucuk,int buyuk) {
        //quicksort yapacak algoritma.
        if(kucuk<buyuk)//indexleme olarak aldıgım yerlerde yani soldaki index sagdaki indexten kucuk oldugu surece cunku bunlar en son ortada bir yerde aynı oldugunda bitecek
        {
            int parcaIndex=bol(sıralanacakListe,kucuk,buyuk);
            quickArray(sıralanacakListe,kucuk,parcaIndex-1);
            quickArray(sıralanacakListe,parcaIndex+1,buyuk);    
        }
        
        
    }
    public int bol(int[] bolunecekListe,int kucuk,int buyuk)//burda arrayleri belirli parçalara böleyim ki küçük parçalar arasındaki pivota göre sıralama yapayım böylelikle küçük parçalar
            //kendi arasında sıralanmış olsun.
    {
        int pivot=bolunecekListe[buyuk];//yani en sondaki değeri pivot seçtim
        int f=(kucuk-1);//bunuda listenin solunu indexlemek için kullandım.
        for(int j=kucuk;j<buyuk;j++)
        {
            if(bolunecekListe[j]<pivot)//eger gelen kucuk deger pivottan daha kucuk bir deger ise
            {
                f++;
                int a=bolunecekListe[f];//gecici bir değişkende tuttum
                bolunecekListe[f]=bolunecekListe[j];//kucuk sayıyı sola aldım.
                bolunecekListe[j]=a;//buyuk sayıyı saga aldım.
                
            }
        }
        int a=bolunecekListe[f+1];
        bolunecekListe[f+1]=bolunecekListe[buyuk];
        bolunecekListe[buyuk]=a;
        //yukarıdaki 3 satır kodla da pivot değerini ortaya getirdim.
        return f+1;//bolmeyı nerden yaptıgımı tutmam lazım kı sagını solunu bolmem gerektigi yeri bileyim.
    }

    
    
    
}
