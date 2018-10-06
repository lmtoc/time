
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

/** 
* TimeUtil Tester. 
* 
* @author lamic
* @since <pre>10/05/2018</pre> 
* @version 1.0 
*/ 
public class TimeUtilTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: sameDay(long time1, long time2) 
* 
*/ 
@Test
public void testSameDay() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: onTime(String cron) 
* 
*/ 
@Test
public void testOnTime() throws Exception { 
    TimeUtil util = TimeUtil.getInstance();
    util.onTime("20 28 17 02 08 ? 2016");

} 


/** 
* 
* Method: sameDayByCalendar(Calendar calendar1, Calendar calendar2) 
* 
*/ 
@Test
public void testSameDayByCalendar() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = TimeUtil.getClass().getMethod("sameDayByCalendar", Calendar.class, Calendar.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
