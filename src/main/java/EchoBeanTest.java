

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bean.EchoBean;

public class EchoBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("echo.xml");

		EchoBean bean = (EchoBean)ctx.getBean("echo",EchoBean.class);
		System.out.println(bean.getName() + "\t" + bean.getNum());
		System.out.println("test");

	}

}
