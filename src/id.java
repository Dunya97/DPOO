import com.google.gson.JsonObject;
public class id {
    private String kind;
    private String videoId;
    private String channelId;
    private String playlistId;

    //Defineixo el new id

    public id() {
        kind = "";
        videoId = "";
        channelId = "";
        playlistId = "";
    }
    public id(JsonObject object) {
        kind = object.get("kind").getAsString();
        videoId = object.get("videoId ").getAsString();
        channelId = object.get("channelId").getAsString();
        playlistId = object.get("playlistId").getAsString();
    }
    //Defineixo els getters
    public String getKind() {
        return kind;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getPlaylistId() {
        return playlistId;
    }
    //Defineixo els setters

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public void setPlaylistId(String playlistId) {
        this.playlistId = playlistId;
    }
}
