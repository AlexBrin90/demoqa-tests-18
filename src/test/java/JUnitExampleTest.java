import org.junit.jupiter.api.*;

public class JUnitExampleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("My beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    My beforeEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("My afterAll()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("            My afterEach()");
    }

    @Test
    void firstTest() {
        System.out.println("        My firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("        My second simple test");
    }
}
