package service;
 
import java.util.Date;
 
import dao.RecordDAO;
import enttity.Category;
import enttity.Record;
 
public class RecordService {
    RecordDAO recordDao = new RecordDAO();
    public void add(int spend, Category c, String comment,Date date){
        Record r = new Record();
        r.spend = spend;
        r.cid = c.id;
        r.comment = comment;
        r.date = date;
        recordDao.add(r);
    }
}