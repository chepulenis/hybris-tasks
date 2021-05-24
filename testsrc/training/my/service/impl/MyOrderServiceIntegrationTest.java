package training.my.service.impl;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.impex.jalo.ImpExException;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.servicelayer.ServicelayerTest;
import de.hybris.platform.servicelayer.ServicelayerTransactionalTest;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;

import static org.junit.Assert.*;
import org.junit.Before;

import org.junit.Test;
import training.my.service.impl.MyOrderServiceImpl;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Qualifier;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@IntegrationTest
public class MyOrderServiceIntegrationTest extends ServicelayerTest{

    @Resource
    private MyOrderServiceImpl myOrderService;

    @Before
    public void setUp(){
        try {
            importCsv("/impex/second_module_tests.impex","utf-8");
        } catch (ImpExException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getTotalNumberOfOrdersTest(){
        int actual = myOrderService.getTotalNumberOfOrders();
        assertEquals(5, actual);
    }

    @Test
    public void getLastOrderTest() throws ParseException {
        OrderModel actual = myOrderService.getLastOrder();
        Date expected = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2006-09-17 10:58:00");
        assertEquals(expected, actual.getDate());
    }

    @Test
    public void getUserWithMostOrdersTest(){
        UserModel actual = myOrderService.getUserWithMostOrders();
        assertEquals("user1", actual.getUid());
    }

}
