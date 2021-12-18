package net.pixelplays.skypvp.utils;

import net.pixelplays.skypvp.apis.TimeBeforeAPI;
import org.bukkit.entity.Player;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeClass {

    public void getTime(Player player, String timeName, int minute) {
        if (TimeBeforeAPI.getTime(player.getUniqueId(), timeName) != null) {
            Calendar date = Calendar.getInstance();
            date.add(Calendar.MINUTE, minute);
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            TimeBeforeAPI.setTime(player.getUniqueId(), df.format(date.getTime()), timeName);
        }

        if (TimeBeforeAPI.getTime(player.getUniqueId(), timeName) != null) {
            Calendar date = Calendar.getInstance();
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            try {
                date.setTime(dateFormat.parse(TimeBeforeAPI.getTime(player.getUniqueId(), timeName)));
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }

            DateFormat dateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
            DateFormat dateFormat2 = new SimpleDateFormat("HH:mm");
            Calendar date2 = Calendar.getInstance();
            date2.setTimeInMillis(System.currentTimeMillis());

            if (date.before(date2)) {
                Calendar date3 = Calendar.getInstance();
                date3.add(Calendar.SECOND, minute);
                DateFormat dateFormat3 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

                TimeBeforeAPI.setTime(player.getUniqueId(), dateFormat3.format(date3.getTime()), timeName);
            }
        }
    }

}
