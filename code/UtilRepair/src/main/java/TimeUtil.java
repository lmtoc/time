import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * Created by Administrator on 2018/10/4 0004.
 */
public class TimeUtil {

    private static TimeUtil util = new TimeUtil();

    private TimeUtil() {

    }

    /**
     * 根据时间戳是否是同一天
     */
    public static boolean sameDay(long time1, long time2) {
        SimpleDateFormat format = new SimpleDateFormat();
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTimeInMillis(time1);
        calendar2.setTimeInMillis(time2);
        return util.sameDayByCalendar(calendar1, calendar2);
    }

    /**
     * 根据传进来的日期判断是否同一天
     */
    private boolean sameDayByCalendar(Calendar calendar1, Calendar calendar2) {
        boolean sameYear = calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR);
        if (!sameYear) {
            return false;
        }
        boolean sameMonth = calendar1.get(Calendar.MONTH) == calendar2.get(Calendar.MONTH);
        if (!sameMonth) {
            return false;
        }
        boolean sameDayOfMonth = calendar1.get(Calendar.DAY_OF_MONTH) == calendar2.get(Calendar.DAY_OF_MONTH);
        return sameDayOfMonth;
    }


    /**
     * 对比当前时间与cron表达式
     */
    public boolean onTime(String cron) {
        SimpleDateFormat format = new SimpleDateFormat("ss mm HH dd MM ? yyyy");
        Date temp = new Date();
        try {
            temp = format.parse(cron);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(temp);
        return false;
    }


    public static TimeUtil getInstance(){
        return util;
    }

}
