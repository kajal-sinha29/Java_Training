
package assignment.utilility;


public class ConversionRate {
    
    Double rate=74.25;
    
    public Double convertRupeesToDollar(float rupee){
        
        Double dollar = rupee/rate;
        
        return dollar;
    }
}
