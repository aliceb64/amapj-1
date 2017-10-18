// package fr.amapj.common;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class ParamUtils {

    public static boolean canConsumerChangePaymentValues;

    public static void main (String [] args) {
        ParamUtils.init("/Users/antoine/IUT/workspace/amapj-1/amapj/src/config.json");
    }

    public static void init(String path)
    {
        Gson gson = new Gson();
        try {
            System.out.println(canConsumerChangePaymentValues);            
            canConsumerChangePaymentValues = gson.fromJson(new FileReader(path), ParamUtils.class).canConsumerChangePaymentValues;
            System.out.println(canConsumerChangePaymentValues);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        }
    }

    
}
