import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class testMain01 {
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void test01() throws SQLException {
        //测试数据源连接
        DataSource ds = ioc.getBean("dataSource",DataSource.class);
        Connection con= ds.getConnection();
        System.out.println(con);
    }
}
