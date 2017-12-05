import java.util.LinkedList;

public class Objecte {
    public String kind;
    public String etag;
    public String nextPageToken;
    public String regionCode;
    public Object pageInfo;
    public LinkedList<Video> items;

    public LinkedList<Video> getItems() {
        return items;
    }
}

