package Ejemplos;

import com.google.gson.Gson;

public class PruebaJson
{

    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson("Hola Mundo");
        System.out.println(json);
    }

}
