import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UnitTestCalculater {

	@Test
	void testAdd() {
		calculater c1 = new calculater();
		c1.setValue(3, 4);
		c1.add();
		assertEquals(7, c1.showresult());
		c1.setValue(5, 4);
		c1.add();
		assertEquals(9, c1.showresult());
	}
	
	@Test
	void testMultiply() {
		calculater c1 = new calculater();
		c1.setValue(3, 4);
		c1.multiply();
		assertEquals(12, c1.showresult());
		c1.setValue(5, 4);
		c1.multiply();
		assertEquals(20, c1.showresult());
	}

}
