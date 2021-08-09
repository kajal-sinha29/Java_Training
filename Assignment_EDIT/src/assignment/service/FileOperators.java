
package assignment.service;

public class FileOperators implements Comparable<FileOperators>{
    
    String country, state, city, item;
    int year;
    Double profit;

    public FileOperators(String country, String state, String city, String item, int year, Double profit) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.year = year;
        this.profit = profit;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public Double getProfit() {
        return profit;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "FileOperators{" + "country=" + country + ", state=" + state + ", city=" + city + ", year=" + year + ", profit=" + profit + '}';
    }
    
    
    public int compareTo(FileOperators operators) {          
    return (this.getProfit() < operators.getProfit() ? -1 : 
            (this.getProfit() == operators.getProfit() ? 0 : 1));     
  }   
    
}
