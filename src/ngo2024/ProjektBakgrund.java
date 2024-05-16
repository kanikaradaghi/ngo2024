/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;
import java.util.ArrayList;

/**
 *
 * @author gylle
 */
public class ProjektBakgrund {
  private String projektNamn;
  private ArrayList<AnstallBakgrund> anstallda;
  private double startTid;
  private AnstallBakgrund projektLedare;
  
  public ProjektBakgrund(String nyttNamn, double nyStartTid,AnstallBakgrund nyLedare){
      
      projektNamn = nyttNamn;
      startTid = nyStartTid;
      projektLedare = nyLedare;
      ArrayList<AnstallBakgrund> anstallda = new ArrayList<>();
      
      
  }
  public void setNamn(String nyttNamn){
      projektNamn = nyttNamn;
  }
  public void laggTillAnstalld(AnstallBakgrund nyAnstalld){
      anstallda.add(nyAnstalld);
  }
  public void setProjektLedare(AnstallBakgrund nyLedare){
      projektLedare = nyLedare;
  }
  public void taBortAnstalld(AnstallBakgrund taBort){
      anstallda.remove(taBort);
  }
  public String getNamn(){
      return projektNamn;
  }
  public double getStartTid(){
      return startTid;
  }
    
}
