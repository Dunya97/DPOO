import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.LinkedList;

public class Youtube {

    // Declarem les constants amb les claus i els links de l'API de Google
    private static final String API_KEY = "AIzaSyDf2xNoDJVH3RNuVF_GeHQadktM3leyGDo";
    private static final String API_YOUTUBE = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=$PARBUSC$&key="+API_KEY+"&maxResults=15";

    public static JsonObject obteInformacio(String cerca, int max) throws IOException {
        Gson gson = new Gson();

        LinkedList<Video> videos = new LinkedList<>();
        try {
            // Canviem els espais per +
            cerca = cerca.replace(" ", "+");

            String url = API_YOUTUBE.replace("$PARBUSC$", cerca);
            URL informacio = new URL(url);
            BufferedReader br = new BufferedReader(new InputStreamReader(informacio.openStream()));
            String all = "";
            String input_line;
            while ((input_line = br.readLine()) != null)
                all += input_line;
            all += "\n";
            br.close();
            System.out.println("hey ho llegeixo2");
            JsonObject jsonObject = gson.fromJson(all, JsonObject.class);
            return jsonObject;
            //Objecte objecte = gson.fromJson(all, Objecte.class);
            //videos = objecte.getItems();
        } catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("hey ho llegeixo3");
        // controlem que el servidor retorni al menys un resultat
        if (videos.size() == 0) {
            System.out.println("    No s'ha trobat cap resultat.");
            //return null;
        }

       // return videos;


        return null;
    }
}


