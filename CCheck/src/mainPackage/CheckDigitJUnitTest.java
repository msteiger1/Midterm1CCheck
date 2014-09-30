package mainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckDigitJUnitTest extends CheckDigit{

	@Test
	public void testisValid() {
		assertEquals("This is a valid card", true, isValid(4121410013632325L));
	}

	
		
	}


