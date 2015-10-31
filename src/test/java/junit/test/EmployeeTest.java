package junit.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyman.web.bean.Worker;
import com.hyman.web.service.WorkerService;

public class EmployeeTest {
	private WorkerService workerService;
	@Before
	public void  setUpBeforeClass() throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		workerService=(WorkerService)ctx.getBean("workerService");
		 
	}

	@Test
	public void testSave() {
		Worker employee=new Worker();
		employee.setName("xxx");
		workerService.save(employee);
	}

	@Test
	public void testFind() {
		Worker worker=workerService.find(1);
		System.out.println(worker.getName());
	}
	
	
}
