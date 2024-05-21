/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ngo2024;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;


/**
 *
 * @author gylle
 */
public class ProjektBakgrund {
    private static  InfDB idb;
  
  
  public ProjektBakgrund(InfDB idb){
      this.idb = idb;
      }
 
  //Döm mig inte för följade två kodblock, koden gör det den ska men det ser förjävligt ut.
  public static ArrayList konstigKod(String ePost){
    String sqlFraga = "select projekt.pid from projekt, anstalld, ngo_2024.ans_proj WHERE epost = '"+ ePost + "' and ans_proj.pid = ans_proj.aid" ;
     System.out.println(sqlFraga);
    ArrayList<String> pidLista = new ArrayList<>();
    ArrayList<String> namn = new ArrayList<>();
    try{
        pidLista = idb.fetchColumn(sqlFraga);
        if (pidLista == null || pidLista.isEmpty()) {
                System.out.println("Inga resultat hittades för den angivna e-posten.");
            }
       
        for(String pid : pidLista){
            namn.add(getProjektNamn(pid));
        }
      System.out.println(namn);
    }
        
    catch(InfException ex){
        System.out.println(ex.getMessage());
         }
    for(String test1 : pidLista){
        System.out.println(test1);
        }
    
  System.out.println(namn);
    return namn;
}
  public static String getProjektNamn(String pid){
  
      String sqlFraga = "select projektnamn from projekt where pid = '" + pid + "'";
      String projektNamn;
      try{
        projektNamn = idb.fetchSingle(sqlFraga);
          
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
         projektNamn = "kunde inte hämtas";
         
      }
      return projektNamn;
      
  }
  public static String getPid(String projektNamn){
      String sqlFraga = "select pid from projekt where projektnamn = '" + projektNamn + "'";
       String pid;
      try{
          pid = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          pid = "kunde inte hämtas";
      }
      return pid;
  }
  public static String getBeskrivning(String projektNamn){
      String sqlFraga = "select beskrivning from projekt where projektnamn = '" + projektNamn + "'";
       String beskrivning;
      try{
          beskrivning = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          beskrivning = "kunde inte hämtas";
      }
      return beskrivning;
  }
  
  public static String getStartDatum(String projektNamn){
      String sqlFraga = "select startdatum from projekt where projektnamn = '" + projektNamn + "'";
       String startdatum;
      try{
          startdatum = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          startdatum = "kunde inte hämtas";
      }
      return startdatum;
  }
  
  public static String getSlutDatum(String projektNamn){
      String sqlFraga = "select slutdatum from projekt where projektnamn = '" + projektNamn + "'";
       String slutdatum;
      try{
          slutdatum = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          slutdatum = "kunde inte hämtas";
      }
      return slutdatum;
      
  }
  public static String getKostand(String projektNamn){
      String sqlFraga = "select kostnad from projekt where projektnamn = '" + projektNamn + "'";
       String kostnad;
      try{
          kostnad = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          kostnad = "kunde inte hämtas";
      }
      return kostnad;
      
  }
  public static String getStatus(String projektNamn){
      String sqlFraga = "select status from projekt where projektnamn = '" + projektNamn + "'";
       String status;
      try{
          status = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          status = "kunde inte hämtas";
      }
      return status;
      
  }
  public static String getPrioritet(String projektNamn){
      String sqlFraga = "select prioritet from projekt where projektnamn = '" + projektNamn + "'";
       String prioritet;
      try{
          prioritet = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          prioritet = "kunde inte hämtas";
      }
      return prioritet;
      
  }
  
  public static String getProjektChef(String projektNamn){
      String sqlFraga = "select projektchef from projekt where projektnamn = '" + projektNamn + "'";
       String projektchef;
      try{
          projektchef = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          projektchef = "kunde inte hämtas";
      }
      return projektchef;
      
  }
  public static String getLand(String projektNamn){
      String sqlFraga = "select land.namn from land, projekt where projekt.projektnamn = '" + projektNamn + "' and projekt.land = land.lid";
       String land;
      try{
          land = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          land = "kunde inte hämtas";
      }
      return land;
      
  }
  
  public static ArrayList getPartnersPaVarje(String ePost){
      ArrayList<String> pidLista = new ArrayList<>();
      String sqlFraga = "select projekt.pid from projekt, anstalld, ngo_2024.ans_proj WHERE epost = '"+ ePost + "' and ans_proj.pid = ans_proj.aid" ;
      ArrayList<String> partnerNamn = new ArrayList<>();
      
      
      try{
          pidLista = idb.fetchColumn(sqlFraga);
          for(String pid : pidLista){
              String sqlFraga2 = "select partner.namn from partner, projekt, projekt_partner where '" + pid + "'  = projekt_partner.pid and projekt_partner.partner_pid = partner.pid";
              partnerNamn.add(idb.fetchSingle(sqlFraga2));
          }
          
          
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return partnerNamn;
  }
  // Metoden hämtar en arraylist av partnernamn för just ett projekt.
  public static ArrayList getProjektPartners(String namn){
      ArrayList<String> namnLista = new ArrayList<>();
      String sqlFraga = " SELECT partner.namn FROM partner JOIN projekt_partner ON partner.pid = projekt_partner.partner_pid JOIN projekt ON projekt.pid = projekt_partner.pid WHERE projekt.projektnamn = '" + namn +"'";
      
      try{
          namnLista = idb.fetchColumn(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return namnLista;
      
  }
  public static String getId(String partnerNamn){
      String sqlFraga = "select pid from partner where namn = '" + partnerNamn + "'";
       String pid;
      try{
          pid = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          pid = "kunde inte hämtas";
      }
      return pid;
      
  }
  public static String getKontaktPerson(String partnerNamn){
      String sqlFraga = "select kontaktperson from partner where namn = '" + partnerNamn + "'";
       String kontaktPerson;
      try{
          kontaktPerson = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          kontaktPerson = "kunde inte hämtas";
      }
      return kontaktPerson;
      
  }
  
  public static String getKontaktEpost(String partnerNamn){
      String sqlFraga = "select kontaktepost from partner where namn = '" + partnerNamn + "'";
       String kontaktEpost;
      try{
          kontaktEpost = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          kontaktEpost = "kunde inte hämtas";
      }
      return kontaktEpost;
      
  }
  public static String gettelefon(String partnerNamn){
      String sqlFraga = "select telefon from partner where namn = '" + partnerNamn + "'";
       String telefon;
      try{
          telefon = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          telefon = "kunde inte hämtas";
      }
      return telefon;
      
  }
   public static String getAdress(String partnerNamn){
      String sqlFraga = "select adress from partner where namn = '" + partnerNamn + "'";
       String adress;
      try{
          adress = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          adress = "kunde inte hämtas";
      }
      return adress;
      
  }
   public static String getBranch(String partnerNamn){
      String sqlFraga = "select branch from partner where namn = '" + partnerNamn + "'";
       String branch;
      try{
          branch = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          branch = "kunde inte hämtas";
      }
      return branch;
      
  }
   public static String getStad(String partnerNamn){
      String sqlFraga = "select stad.namn from stad, partner where partner.namn = '" + partnerNamn + "'and partner.stad = stad.sid";
       String stad;
      try{
          stad = idb.fetchSingle(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          stad = "kunde inte hämtas";
      }
      return stad;
      
  }
   
   // Nu kommer lite kod för att hämta avdelningar och projekt releaterade till dem.
   
   public static String getAvdelning(String ePost){
    String sqlFraga1 = "SELECT avdelning FROM anstalld WHERE epost = '" + ePost + "'";
    
    String avdelningsInfo;
    try{
        String avdelning = idb.fetchSingle(sqlFraga1);
        
        avdelningsInfo = avdelning;
    }
    catch(InfException ex){
        System.out.println(ex.getMessage());
        avdelningsInfo = "Kunde inte hämtas";
         }
    
    return avdelningsInfo;
}
   public static ArrayList getProjektListaAvdelning(String avdelning){
      ArrayList<String> namnLista = new ArrayList<>();
      String sqlFraga = "select projekt.projektnamn from projekt, proj_hallbarhet, avd_hallbarhet, avdelning, hallbarhetsmal " +
        "where projekt.pid = proj_hallbarhet.pid " +
         "and proj_hallbarhet.hid = hallbarhetsmal.hid "+
        "and hallbarhetsmal.hid = avd_hallbarhet.hid " +
         "and avd_hallbarhet.avdid = avdelning.avdid " +
         "and avdelning.avdid = '"+ avdelning + "' "+
         "group by projekt.projektnamn";
      
      
      try{
          namnLista = idb.fetchColumn(sqlFraga);
          System.out.println(namnLista);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return namnLista;
   }
   //Metod för att lisa all personal på en avdelning
   public static ArrayList getPersonalForNamnPåAvdelning(String avdelning){
        ArrayList<String> forNamnAvdelning = new ArrayList<>();
      String sqlFraga = "select anstalld.fornamn from anstalld " +
                       "where anstalld.avdelning = '" + avdelning + "'";
        
      try{
          forNamnAvdelning = idb.fetchColumn(sqlFraga);
          System.out.println(forNamnAvdelning);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return forNamnAvdelning;
   }
   //Metod för att hämta namn på alla hållbarhetsmål
   public static ArrayList getHallbarHetsMal(){
      ArrayList<String> mal = new ArrayList<>();
      String sqlFraga = "select namn from hallbarhetsmal";

      
      try{
          mal = idb.fetchColumn(sqlFraga);
          System.out.println(mal);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return mal;
   }
   public static ArrayList getProjektNamnForLedarel(String aid){
      ArrayList<String> namn = new ArrayList<>();
      String sqlFraga = "select projektnamn from projekt where projektchef = '" + aid +"'";

      
      try{
          namn = idb.fetchColumn(sqlFraga);
          System.out.println(namn);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return namn;
   }
   
   // Kodför att ändra i projekt
   public static void andraPid(String nyttPid,String projektNamn){
    
   String sqlFraga = "update  projekt set projekt.pid = '" + nyttPid + "' where projektnamn = '" + projektNamn + "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
   }
   
   public static void andraProjektNamn(String pid,String nyttprojektNamn){
    
   String sqlFraga = "update  projekt set projektnamn = '" + nyttprojektNamn + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
   }
    public static void andraBeskrivning(String pid,String nyBeskrivning){
    
   String sqlFraga = "update  projekt set beskrivning = '" + nyBeskrivning + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
    
     public static void andraStartDatum(String pid,String nyStartDatum){
    
   String sqlFraga = "update  projekt set startdatum = '" + nyStartDatum + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
     
     public static void andraSlutDatum(String pid,String nySlutDatum){
    
   String sqlFraga = "update  projekt set slutdatum = '" + nySlutDatum + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
     public static void andraKostand(String pid,String nyKostand){
    
   String sqlFraga = "update  projekt set kostnad = '" + nyKostand + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
   public static void andraStatus(String pid,String nyStatus){
    
   String sqlFraga = "update  projekt set status = '" + nyStatus + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
   public static void andraPrio(String pid,String nyPrio){
    
   String sqlFraga = "update  projekt set prioritet = '" + nyPrio + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
   public static void andraChef(String pid,String nyAid){
    
   String sqlFraga = "update  projekt set projektchef = '" + nyAid + "' where projekt.pid = '" + pid +  "'";
   
   try{
        idb.update(sqlFraga);
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
   }
   // Metod för att hämta en arraylist med strängar av alla partners
   
   public static ArrayList getAllaPartnersNamn(){
      ArrayList<String> namn = new ArrayList<>();
      String sqlFraga = "select partner.namn from partner";

      
      try{
          namn = idb.fetchColumn(sqlFraga);
          System.out.println(namn);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return namn;
   }
   // Metod för att för att ista alla id i partner tabbellen
   public static ArrayList getAllaPartnerId(){
      ArrayList<String> pid = new ArrayList<>();
      String sqlFraga = "select partner.pid from partner";

      
      try{
          pid = idb.fetchColumn(sqlFraga);
          System.out.println(pid);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return pid;
      
   }
   // metod för att lägga till en partner på ett projekt
   
   public static void laggTillPartner(String pid,String partnerId){
    
   String sqlFraga = "INSERT INTO projekt_partner (pid, partner_pid) " +
                        "VALUES ('" + pid + "','" + partnerId + "')";
   
   
   try{
        idb.insert(sqlFraga);
        
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
   
   // Tar bort en partner från ett projekt.
   public static void taBortPartner(String pid,String partnerId){
    
   String sqlFraga = "DELETE FROM projekt_partner WHERE pid = '" + pid + "' AND partner_pid = '" + partnerId + "'";
   
   
   try{
        idb.delete(sqlFraga);
        
   }
   catch(InfException ex){
       System.out.println(ex.getMessage());
       
   }
    }
   
   
   // Metod för att lista alla handläggare på ett projekt
   
   public static ArrayList getAllaHandlaggare(String projektNamn){
      ArrayList<String> handlaggare = new ArrayList<>();
      String sqlFraga = "Select anstalld.fornamn from anstalld, ans_proj, projekt " +
                             "where anstalld.aid = ans_proj.aid " +
                             "and ans_proj.pid = projekt.pid " +
                             " and projekt.projektnamn = '" + projektNamn + "'";
      
      try{
          handlaggare = idb.fetchColumn(sqlFraga);
      }
      catch(InfException ex){
          System.out.println(ex.getMessage());
          
          
      }
      return handlaggare;
      
  }
   
}
   
    
    
    
    
    
    

   
   
   
   
       
   
  
  
  
  
  
  

