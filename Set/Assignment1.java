import java.util.*;

class Country{
      
      HashSet<String> H1 = new HashSet<>();

      public HashSet<String> saveCountryNames(String CountryName){
           H1.add(CountryName);

           return H1;
      }

      public String getCountry(String CountryName){
           Iterator<String> itr = H1.iterator();

           while(itr.hasNext()){
                
                if(itr.next().equals(CountryName)){
                    return CountryName;
                }
           }

           return null;
      }
}

public class Assignment1{
     
     public static void main(String[] args){
           
           Country country = new Country();

           country.saveCountryNames("India");
           country.saveCountryNames("Japan");
           country.saveCountryNames("Canada");
           country.saveCountryNames("USA");

           System.out.println("India is: "+ country.getCountry("India"));
           System.out.println("China is: "+ country.getCountry("China"));
     }
}
