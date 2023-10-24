package assignment1application;

import com.example.ui.Assignment1Console;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class assignment1application {
    public static void main(String[] args) throws IOException, SQLException, ParseException {
        Assignment1Console lc = new Assignment1Console();
        lc.start();
    }
}
