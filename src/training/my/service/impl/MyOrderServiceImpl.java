package training.my.service.impl;

import de.hybris.platform.core.model.order.OrderModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import training.my.service.MyOrderService;

import javax.annotation.Resource;
import java.util.Collections;

public class MyOrderServiceImpl implements MyOrderService {

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public OrderModel getLastOrder() {
        String query = "select {pk} from {order} where {order.date} in ({{select max({order.date}) from {order}}})";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.setResultClassList(Collections.singletonList(OrderModel.class));
        SearchResult<OrderModel> orderList = flexibleSearchService.search(flexibleSearchQuery);
        return orderList.getResult().get(0);
    }

    public int getTotalNumberOfOrders() {
        String query = "select count({pk}) from {order}";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.setResultClassList(Collections.singletonList(Integer.class));
        SearchResult<Integer> result = flexibleSearchService.search(flexibleSearchQuery);
        return result.getResult().get(0);
    }

    @Override
    public UserModel getUserWithMostOrders() {
        String query = "select {user} from {order} group by {user} having count(*) = ({{select count(*) from {order} group by {user} order by count(*) desc limit 1}})";
        FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
        flexibleSearchQuery.setResultClassList(Collections.singletonList(UserModel.class));
        SearchResult<UserModel> result = flexibleSearchService.search(flexibleSearchQuery);
        return result.getResult().get(0);
    }
}
