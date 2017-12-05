import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Opcions {
    private static final String API_KEY = "AIzaSyDf2xNoDJVH3RNuVF_GeHQadktM3leyGDo";
    private static final String API_YOUTUBE = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=$cerca$&key="+API_KEY+"&maxResults=$cerca$";


    //Mètode corresponent a l'opció 1
    public static void cercaResultats()throws IOException {
        System.out.println("hey ho llegeixo");
        try {
            LinkedList<Video> video = new LinkedList<>();
            System.out.println("\nDigam que vols buscar:  \n");
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader (isr);
            String cerca = br.readLine();
            int max = 3;
            //muro aqui
            JsonObject jsonObject = Youtube.obteInformacio(cerca,max);
            for (int i = 0; i <jsonObject.get("items").getAsJsonArray().size(); i++){
                System.out.println("    Tipus de resultat: " + jsonObject.get("items").getAsJsonArray().get(i).getAsJsonObject().get("id").getAsJsonObject().get("kind").getAsString());
            }
            System.out.println("hey ho llegeixo7");
            //System.out.println("\n"+ video.get(0).getKind()+"\n");
            JSONObject json;


        }
        catch (IOException e) {
            System.out.println("S'ha produit un error de connexió");
        }

    }
}
