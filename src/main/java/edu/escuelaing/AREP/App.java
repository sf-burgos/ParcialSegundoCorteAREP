package edu.escuelaing.AREP;

import static spark.Spark.*;
public class App
{
    public static void main( String[] args ) {
        port(getPort());
        get("/log", ((request, response) -> {
            Double num = Double.parseDouble(request.queryParams("value"));
            return Calculator.ResultLog(num);
        }));

        get("/sin", ((request, response) -> {
            Double num = Double.parseDouble(request.queryParams("value"));
            return Calculator.ResultSin(num);
        }));
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
