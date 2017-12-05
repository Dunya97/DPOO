import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Video{

    private String kind;
    private String etag;
    private id id;
    private snippet snippet;
    private String channelTitle;

    //Defineixo els new Youtube
    public Video() {
        kind= "";
        etag = "";
        id = new id();
        snippet = new snippet();
        channelTitle = "";
    }

    public Video(JsonObject object) {
        kind = object.get("kind").getAsString();
        etag = object.get("etag").getAsString();
        JsonObject aux = object.get("id").getAsJsonObject();
        id = new id(aux);
        JsonObject s = object.get("snippet").getAsJsonObject();
        snippet = new snippet(s);
        channelTitle = object.get("channelTitle").getAsString();

    }

    //Defineixo els getters
    public String getKind() {
        return kind;
    }

    public String getEtag() {
        return etag;
    }

    public id getId() {
        return id;
    }

    public snippet getSnippet() {
        return snippet;
    }
    public String getChannelTitle() {
        return channelTitle;
    }
    //Defineixo els setters

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public void setId(id id) {
        this.id = id;
    }

    public void setSnippet(snippet snippet) {
        this.snippet = snippet;
    }
}



