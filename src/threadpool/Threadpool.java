/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class Threadpool {
  public String angka;

  
  public void setName(String newName){
    angka = newName;
  }
 
 
  public String getName(){
    return angka;
  }


    public static void main(String[] args) {
        
        ExecutorService service=Executors.newFixedThreadPool(6);
        for (int i = 1; i < 6; i++) {
           service.submit(new kelaspemroses(i));    
           Threadpool testangka=new Threadpool();
        testangka.setName(" adalah bilangan ganjil");
        for (int angka = 1; angka <100; angka=angka+2) {
           System.out.println(angka+testangka.getName());          
        }
        }
       
        
        System.out.println("==================  Semua task telah disubmit  ==================");
          service.shutdown();
          
          try{
          service.awaitTermination(1, TimeUnit.DAYS);
          }catch(InterruptedException e){
          e.printStackTrace();
          }
          System.out.println("==================  Semua task telah selesai  ===================");
        }
         
 }


