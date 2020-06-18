package dubbospi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.wjf.service.OrderService;

public class TestMain {
    public static void main(String[] args) {
        ExtensionLoader<OrderService> extensionLoader = ExtensionLoader.getExtensionLoader(OrderService.class);
        OrderService aLiOrderService = extensionLoader.getExtension("weixinOrderservice");
        aLiOrderService.submit();
    }
}
