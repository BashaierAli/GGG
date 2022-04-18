package program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
class TicketTypeTest {
    @Test
    public void test() throws ParseException {
        TicketType Open=new TicketType();

        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");

        String result=Open.CheckTicketType(sdf.parse("4:00"));
        assertEquals("full",result);


        result=Open.CheckTicketType(sdf.parse("11:30"));
        assertEquals("saver",result);

        result=Open.CheckTicketType(sdf.parse("18:20"));
        assertEquals("full",result);

        result=Open.CheckTicketType(sdf.parse("23:00"));
        assertEquals("saver",result);
    }}