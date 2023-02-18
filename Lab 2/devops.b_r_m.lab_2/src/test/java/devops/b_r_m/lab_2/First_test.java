package devops.b_r_m.lab_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class First_test {

	@Test
	public void test() {
		Rev_Num r=new Rev_Num();
		assertEquals(123, r.rev_num(321));
	}

}
