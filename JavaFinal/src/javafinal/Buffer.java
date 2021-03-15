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
public class Buffer {
    //buffer nesnesi içerisinde sonuc matrixinin kendisini bulunduruyor.
    //sonuc matrixini her bir threadin ilgili satırına işliyorum sonra burada o yüzden
    //put metodu içerisinde hangi matrise yazıldığını da argüman olarak almam lazım.
    int[][] sonucMatrisi;
    int sonucSatirSayisi;
    int sonucSutunSayisi;
    public Buffer(int sonucSatirSayisi,int sonucSutunSayisi)
    {
        this.sonucSatirSayisi=sonucSatirSayisi;
        this.sonucSutunSayisi=sonucSutunSayisi;
        this.sonucMatrisi=new int[sonucSatirSayisi][sonucSutunSayisi];
    }
    public synchronized void put(int hangiSatıraYazılıyor,int[] sonucMatrisininBirSatiri)
    {
        for(int i=0;i<sonucSutunSayisi;i++)
        { 
            sonucMatrisi[hangiSatıraYazılıyor][i]=sonucMatrisininBirSatiri[i];
            
        }
        
        
    }
    public  void  print()
    {
        for(int x=0;x<sonucSatirSayisi;x++)
        {
            for(int y=0;y<sonucSutunSayisi;y++)
            {
                System.out.print(this.sonucMatrisi[x][y]+" ");
            }
            System.out.println("");
        }
    }
    
    
}
