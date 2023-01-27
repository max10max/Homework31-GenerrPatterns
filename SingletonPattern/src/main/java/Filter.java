import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer x : source) {
            if (x >= treshold) {
                result.add(x);
                logger.log("Элемент " + x + " проходит");
            } else {
                logger.log("Элемент \"" + x + "\" не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемент(а/тов) из " + source.size());
        return result;
    }


}
