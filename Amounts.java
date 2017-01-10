/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amounts;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author piotrkowalski
 */
public class Amounts {
    
    private BigDecimal amount;
    private String amountString;
    String[] numbers = {"zero",
                                "jeden ",
                                "dwa ",
                                "trzy ",
                                "cztery ",
                                "pięć ",
                                "sześć ",
                                "siedem ",
                                "osiem ",
                                "dziewięć ",
                                "dziesięć ",
                                "jedenaście ",
                                "dwanaście ",
                                "trzynaście ",
                                "czternaście ",
                                "piętnaście ",
                                "szesnaście ",
                                "siedemnaście ",
                                "osiemnaście ",
                                "dziewiętnaście ",
                                "dwadzieścia ",
                                "trzydzieści ",
                                "czterdzieści ",
                                "pięćdziesiąt ",
                                "sześćdziesiąt ",
                                "siedemdziesiąt ",
                                "osiemdziesiąt ",
                                "dziewięćdziesiąt ", 
                                "sto ",
                                "dwieście ",
                                "trzysta ",
                                "czterysta ",
                                "pięćset ",
                                "sześćset ",
                                "siedemset ",
                                "osiemset ",
                                "dziewięćset ",
                                "tysiąc ",
                                "tysiące ",
                                "tysięcy ",
                                "milion ",
                                "miliony ",
                                "miliard ",
                                "miliardy ",
                                "złoty",
                                "złote",
                                "złotych", 
                                "złoty ",
                                "złote ",
                                "złotych ", 
                                "grosz",
                                "grosze",
                                "groszy"};
    
    private String[] ones = {"zero",
                                "jeden ",
                                "dwa ",
                                "trzy ",
                                "cztery ",
                                "pięć ",
                                "sześć ",
                                "siedem ",
                                "osiem ",
                                "dziewięć ",
                                "dziesięć ",
                                "jedenaście ",
                                "dwanaście ",
                                "trzynaście ",
                                "czternaście ",
                                "piętnaście ",
                                "szesnaście ",
                                "siedemnaście ",
                                "osiemnaście ",
                                "dziewiętnaście ",
                                "dwadzieścia "};
    
    private String[] tens = {"", "", "dwadzieścia ",
                                "trzydzieści ",
                                "czterdzieści ",
                                "pięćdziesiąt ",
                                "sześćdziesiąt ",
                                "siedemdziesiąt ",
                                "osiemdziesiąt ",
                                "dziewięćdziesiąt "};
    
    private String[] hundreds = {"", "sto ",
                                "dwieście ",
                                "trzysta ",
                                "czterysta ",
                                "pięćset ",
                                "sześćset ",
                                "siedemset ",
                                "osiemset ",
                                "dziewięćset "};
    
    private String[] thousAndMore = { "tysiąc ",
                                "tysiące ",
                                "tysięcy ",
                                "milion ",
                                "miliony ",
                                "miliard ",
                                "miliardy ",
                                "bilion", 
                                "biliony", 
                                "biliard",
                                "biliardy"};
    
    private String[] pln = {"złoty ",
                                "złote ",
                                "złotych ", 
                                "grosz",
                                "grosze",
                                "groszy"};
    
    public String amountToWords(BigDecimal am) {
        amountString = am.toString();
        if(amountString.matches("[1-9][0-9]{0-17}?([.,][0-9]{1,2})")) {  // wyrazenie regularne na kwote
        
        } else {
            System.out.println("To nie jest kwota.");
        }
        return amountString;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Amounts amounts = new Amounts();
        String inWords = amounts.threeDigits(111);           
        System.out.println(inWords);
     
        
        // if(    args.length != 1 
          //  || args[0].matches("[1-9][0-9]{0-17}?([.,][0-9]{1,2})") == false)
        /*
        if(    args.length != 1 
            || args[0].matches("[1-9][0-9]{0-2}") == false)
        {
            System.out.println("To nie jest kwota trzycyfrowa.");
        } else {
           String[] kwota = args[0].split("[.,]");  // rozbicie na zlote i grosze
           int zlote = Integer.parseInt(kwota[0]);
           
           int jednosci = zlote % 1000;
           zlote /= 1000;
           int tysiace = zlote % 1000;
           zlote /= 1000;
           int miliony = zlote % 1000;
           zlote /= 1000;
           int miliardy = zlote % 1000;
           zlote /= 1000;
           int biliony = zlote % 1000;
           zlote /= 1000;
           int biliardy = zlote % 1000;
           zlote /= 1000;
           
           Amounts amounts = new Amounts();
           String inWords = amounts.threeDigits(zlote);           
           System.out.println("Hello world");
           */
          /* 
           if(kwota.length == 2) {
               String grosze = kwota[1];
               Integer gr = Integer.parseInt(grosze);
               if (grosze.equals("01")) {
                   amStr.add("grosz");
               } else if (    (grosze.endsWith("2") || grosze.endsWith("3") || grosze.endsWith("4"))
                           && grosze.startsWith("1") == false) 
               {
                   amStr.add("grosze");
               } else {
                   amStr.add("groszy");
               }
               if(gr <= 20) {
                   
               }
           } */
        }
    
        
    private String threeDigits(int num) {
        
        int setki = num/100;
        int dziesiatki = (num % 100) / 10;
        int jednosci = num % 10;
        
        String result = "";
        if (setki > 0) {
            result += hundreds[setki];
        }
        if (num%100 > 0 && num%100 <= 20) {
            result += ones[num%100];
        } else {
            result += tens[dziesiatki];
            result += ones[jednosci];
        }
        return result;
       } 
          
        
    }

