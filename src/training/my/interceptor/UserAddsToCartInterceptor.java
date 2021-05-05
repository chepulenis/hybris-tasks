package training.my.interceptor;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;

public class UserAddsToCartInterceptor implements ValidateInterceptor {
    @Override
    public void onValidate(Object o, InterceptorContext interceptorContext) throws InterceptorException {

    }
}
