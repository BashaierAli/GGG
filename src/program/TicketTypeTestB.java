package program;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTypeTestB {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
        TicketType op =new TicketType();
        //////
        String result= op.CheckTicketType(sdf.parse("9:29"));
        assertEquals("full",result);
        ///////

        result= op.CheckTicketType(sdf.parse("9:30"));
        assertEquals("saver",result);
        //////

        result= op.CheckTicketType(sdf.parse("16:00"));
        assertEquals("saver",result);
        ////
        result= op.CheckTicketType(sdf.parse("16:01"));
        assertEquals("full",result);
        ////
        result= op.CheckTicketType(sdf.parse("19:30"));
        assertEquals("full",result);
        ///
        result= op.CheckTicketType(sdf.parse("19:31"));
        assertEquals("saver",result);

    }}