package Auxiliar;

public class Parse {
    public double parseDouble(String n){
        return Double.parseDouble(n);
    }
    
    public double parseDoublePlus(String n, String m){
        double num1 = Double.parseDouble(n);
        double num2 = Double.parseDouble(m);
        double num = num1 + num2;
        return num;
    }
    
    public double parseDoubleMinus(String n, String m){
        double num1 = Double.parseDouble(n);
        double num2 = Double.parseDouble(m);
        double num = num1 - num2;
        return num;
    }
}
