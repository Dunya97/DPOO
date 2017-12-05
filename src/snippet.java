import java.time.format.DateTimeFormatter;
import com.google.gson.JsonObject;

public class snippet {
    private String publishedAt;
    private String channelId;
    private String title;
    private String description;
    private Object thumbnails;

    //Defineixo el new Snippet

    public snippet() {
        publishedAt = "";
        channelId = "";
        title = "";
        description = "";
        thumbnails = "";
    }
    public snippet(JsonObject object) {
        publishedAt = object.get("publishedAt").getAsString();
        channelId = object.get("channelId").getAsString();
        title = object.get("title").getAsString();
        description = object.get("description").getAsString();
        thumbnails = object.get("thumbnails").getAsString();

    }

    //Defineixo els getters
    public String getPublishedAt() {
        return publishedAt;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    //Defineixo els setters

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
