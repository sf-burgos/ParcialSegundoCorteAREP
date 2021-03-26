package edu.escuelaing.AREP;

import com.google.gson.Gson;

public class Calculator {
    public Calculator(){}
    public static String ResultSin (Double number){
        Double salida =0.0;
        salida = Math.sin(number);

        return escuelaSin(salida, number);
    }
    public static String ResultLog (Double number){
        Double salida =0.0;
        salida = Math.log(number);

        return escuelaLog(salida, number);
    }
    public  static String escuelaSin (double num, double input){
        Gson json = new Gson();
        String cadena = "sin ";
        String res = "{\"operation\":"+cadena+"input "+input+" output "+num+"}";
        return json.toJson(res);
    }

    public  static String escuelaLog (double num, double input){
        Gson json = new Gson();
        String cadena = "log ";
        String res = "{\"operation\":"+cadena+"input "+input+" output "+num+"}";
        return json.toJson(res);
    }
}
