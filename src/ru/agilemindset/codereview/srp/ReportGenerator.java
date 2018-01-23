package ru.agilemindset.codereview.srp;

import ru.agilemindset.codereview.srp.domain.Database;
import ru.agilemindset.codereview.srp.domain.FileWriter;

import java.util.List;

/**
 * Created by sergeybaranov on 24/1/18.
 */
public class ReportGenerator {

    List data;

    void getDataForReportFromDatabase(String branch) {
        Database database = new Database();
        database.connect("root", "root");
        data = database.getData("SELECT * FROM reportData WHERE branch="+branch);
    }

    void writeReportToFile() {
        FileWriter writer = new FileWriter();
        writer.createFile("kemerovo.dbf");
        writer.write(data);
        writer.close();
    }


}
