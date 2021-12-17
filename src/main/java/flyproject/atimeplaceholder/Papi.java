package flyproject.atimeplaceholder;

import me.albert.atime.ATime;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;

import java.util.HashMap;
import java.util.Map;

public class Papi extends PlaceholderExpansion {
    @Override
    public String getIdentifier() {
        return "atimeplace";
    }

    @Override
    public String getAuthor() {
        return "flyproject";
    }

    @Override
    public String getVersion() {
        return "1.0.1";
    }

    @Override
    public String onRequest(OfflinePlayer player,String parms){
        String path = parms;
        Map<Integer,OfflinePlayer> atime = new HashMap();
        int top = 1;
        for (OfflinePlayer ofp : ATime.getTopTen()){
            atime.put(top,ofp);
            top = top + 1;
        }
        if (path.startsWith("time_")){
            path = path.replace("time_","");
            int number = Integer.parseInt(path);
            if (number <= 10){
                OfflinePlayer op = atime.get(number);
                return ATime.getPlayTimeString(op.getName());
            }
        } else if (path.startsWith("name_")){
            path = path.replace("name_","");
            int number = Integer.parseInt(path);
            if (number <= 10){
                OfflinePlayer op = atime.get(number);
                return op.getName();
            }
        }
        return null;
    }
}
