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
public class MultiplyWorker implements Runnable {
    Buffer buffeR;
    int[] carpilacakMatriseAitBirSatirr;
    int[][] ikinciMatrisinTumuu;
    int ikinciMatrisinSutunSayisi;
    int toplam;
    int[] sonucMatrisiBirSatir;
    int   kacinciThreatt;
    public MultiplyWorker(Buffer buffer,int[] carpilacakMatriseAitBirSatir,int[][] ikinciMatrisinTumu,int ikinciMatrisinSutunSayisi,int kacinciThreat)
    {
        
        this.carpilacakMatriseAitBirSatirr=carpilacakMatriseAitBirSatir;
        this.ikinciMatrisinTumuu=ikinciMatrisinTumu;
        this.ikinciMatrisinSutunSayisi=ikinciMatrisinSutunSayisi;
        this.kacinciThreatt=kacinciThreat;
        this.buffeR=buffer;
        
    }
    public void run()
    {
        
        sonucMatrisiBirSatir=new int[ikinciMatrisinSutunSayisi];
        for(int i=0;i<ikinciMatrisinSutunSayisi;i++){
            toplam=0;
            for(int y=0;y<carpilacakMatriseAitBirSatirr.length;y++)
            {
                toplam+=(carpilacakMatriseAitBirSatirr[y]*ikinciMatrisinTumuu[y][i]);
            }
            sonucMatrisiBirSatir[i]=toplam;   
        }
        
        buffeR.put(kacinciThreatt, sonucMatrisiBirSatir);
        
        
        //içeriğindeki matrix satırın matrix ile çarpacak.
        
    }
    
}
