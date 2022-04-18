package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class TicketType {
    public static String CheckTicketType(Date d) throws ParseException
    {

        String type="";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        if(d.before(sdf.parse("9:30"))||(d.after(sdf.parse("16:00")))&&d.before(sdf.parse("19:31")))
            type="full";
        else
            type="saver";

        return type;
    }

}
