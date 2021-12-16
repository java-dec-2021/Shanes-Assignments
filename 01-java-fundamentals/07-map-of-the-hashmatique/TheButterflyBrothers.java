import java.util.HashMap;
import java.util.Set;
public class TheButterflyBrothers {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("One Ugly Duckling",
                "I'm an ugly duckling, yeah. He's an ugly duckling, yeah. We're all ugly ducklings, yeah! Ugly, ugly, ugly ducklings!");
        trackList.put("Juicy Juice",
                "I love me some juicy juice. It's the juiciest juice there is. Ain't nothing juicier, except your lips.");
        trackList.put("Hellfire", "Beata Maria, you know I am a righteous man.");
        trackList.put("Fireman", "I am a fireman. I put out fire like you.");
        String name = trackList.get("Hellfire");
        System.out.println(name);
        Set<String> lists = trackList.keySet();
        for(String track : lists) {
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
    }
}
