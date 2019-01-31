package tlc.tracking;

import java.util.List;

public interface StoreService {

    Record insert(Record o);

    List<Record> findBetweenRect(int a, int b, int x, int y);

    void delete(long id);
    
    List<Record> findByRunId(long id);
}
