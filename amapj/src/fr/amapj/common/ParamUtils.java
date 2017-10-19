package fr.amapj.common;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class ParamUtils {

    public static Config config = new Config();

    public static void init(String path)
    {
        Gson gson = new Gson();
        try {
            ParamUtils.config.canConsumerChangePaymentValues = gson.fromJson(new FileReader(path), Config.class).canConsumerChangePaymentValues;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        }
    }

    
}