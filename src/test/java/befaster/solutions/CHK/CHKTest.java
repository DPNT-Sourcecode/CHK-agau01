package befaster.solutions.CHK;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CHKTest {
	private CheckoutSolution test;

	@BeforeEach
	public void setUp() {
		test = new CheckoutSolution();
	}

	@Test
	public void compute_sum() {
		assertThat(test.checkout("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), equalTo(50 + 30 + 20 + 15 + 40));
	}
}

