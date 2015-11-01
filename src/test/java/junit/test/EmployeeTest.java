package junit.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hyman.web.bean.Worker;
import com.hyman.web.service.WorkerService;


public class EmployeeTest extends BaseJunitTest{
	@Autowired
	private WorkerService workerService;

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
