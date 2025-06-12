package runner;

import org.testng.annotations.*;
import pages.HomePage;
import pages.SalesPage;
import pages.SearchPage;
import utils.Base;


public class TestRunner extends Base {

        @BeforeMethod
        void open() {
            openBrowser();
        }

        @Test(priority = -1)
        void testCase1(){
            HomePage p1= new HomePage();
            p1.testCase01();
        }

        @Test(priority = 1)
        void testCase2(){
            SearchPage p2= new SearchPage();
            p2.testCase02();
        }

        @Test(priority = -2)
        void testCase3(){
            SalesPage s= new SalesPage();
            s.testCase03();
        }

        @AfterMethod
        void tearDown(){
            driver.quit();
        }

}
