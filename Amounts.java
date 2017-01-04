/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amounts;

import java.math.BigDecimal;

/**
 *
 * @author piotrkowalski
 */
public class Amounts {

    private BigDecimal amount;
    private String amountString;
    private final String[] numbers = {"zero",
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
                                "złoty ",
                                "złote ",
                                "złotych ", 
                                "grosz",
                                "grosze",
                                "groszy"};
    
    public String amountToWords(BigDecimal am) {
        return "";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
