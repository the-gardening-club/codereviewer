package ca.earthgrazer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ca.earthgrazer.codereviewer.CodeReviewer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CodeReviewer.class)
@WebAppConfiguration
public class CodereviewerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
