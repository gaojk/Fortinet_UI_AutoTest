package ftnt.qa.autotest.ui.testbase;

import java.lang.reflect.Method;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.XmlTest;

import ec.qa.autotest.ui.admin.portal.pageobject.AdminPortalLoginPage;
import ftnt.qa.autotest.ui.framework.constants.PropertiesKeys;
import ftnt.qa.autotest.ui.framework.utils.PropertiesUtil;

/**
 * @author xin.wang
 * 供应商后台管理网站测试基类
 */
public class AdminPortalTestBase extends TestBase {
	
	@BeforeMethod(alwaysRun = true)
	public void initDriver(ITestContext tc, Method m, XmlTest xt) throws Exception {
		ConfigDriverParameters cp = new ConfigDriverParameters();
		cp.setPageLoadTime(Long.parseLong(PropertiesUtil.getProValue(PropertiesKeys.ADMIN_PORTAL_PAGELOAD_TIME)));
		cp.setTargetWebSite(PropertiesUtil.getProValue(PropertiesKeys.ADMIN_PORTAL_AUTO_TEST_WEBSITE));
		cp.setSerachElementTime(Long.parseLong(PropertiesUtil.getProValue(PropertiesKeys.IMPLICITLYWAIT_TIME)));
		cp.setTestMethod(m);
		preCondition(cp);
	}
	
	@AfterSuite
	public void terminTestSuite(XmlTest xt, ITestContext tc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void beforeClass(XmlTest xt, ITestContext tc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterClass(XmlTest xt, ITestContext tc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void beforeTest(XmlTest xt, ITestContext tc) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterTest(XmlTest xt, ITestContext tc) throws Exception {
		// TODO Auto-generated method stub
		
	}
}