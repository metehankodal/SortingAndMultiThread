/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author meteh
 */
public class Soru2Deneme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException  {
        File matrix1Dosya = new File("matris1.txt");
        File matrix2Dosya = new File("matris2.txt");
        int[][] firstMatrix =dosyaOkuma(matrix1Dosya);
        int[][] secondMatrix=dosyaOkuma(matrix2Dosya);
        int sonucSatirSayisi=firstMatrix.length;
        int sonucSutunSayisi=secondMatrix[0].length;
        
                
       Buffer buffla = new Buffer(sonucSatirSayisi,sonucSutunSayisi);
       buffla.print();
        System.out.println("Çarpım yapıldıktan sonra.........");
        System.out.println("*******************************");
       ArrayList<Thread> threadler = new ArrayList<Thread>();
       for(int x=0;x<firstMatrix.length;x++)
       {
           threadler.add(new Thread(new MultiplyWorker(buffla,firstMatrix[x],secondMatrix,sonucSutunSayisi,x)));
           
           
       }
       
       for(Thread t : threadler)
       {
           t.start();
           t.join();  
       }
      
       
      
       
    
     buffla.print();
    }
  public static int[][] dosyaOkuma(File file) throws FileNotFoundException
  {
      Scanner scan = new Scanner(file);
      int satirSayisi=satirSayisiHesapla(scan);
      scan.close();
      scan= new Scanner(file);
      int sutunSayisi = sutunSayisiHesapla(scan);
      scan.close();
      
      //System.out.println("satirSayisi"+satirSayisi+" sutun sayisi"+sutunSayisi);
      int[][] matrixOkundu = new int[satirSayisi][sutunSayisi];
      scan = new Scanner(file);
      for(int x=0;x<satirSayisi;x++)
      {
          for(int y=0;y<sutunSayisi;y++)
          {
              matrixOkundu[x][y]=scan.nextInt();
          }
      }
      return matrixOkundu;
  }
  public static int satirSayisiHesapla(Scanner x)
  {
      int satirSayisi=0;
      while(x.hasNextLine())
      {
          satirSayisi++;
          x.nextLine();
      }
      return satirSayisi;       
  }
  public static int sutunSayisiHesapla(Scanner x)
  {
      int sutunSayisi=0;
        StringTokenizer tok = new StringTokenizer(x.nextLine()," ");
        sutunSayisi=tok.countTokens();
        return sutunSayisi; 
  }
    
}
