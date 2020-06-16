import com.wjf.service.PayService;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<PayService> services = ServiceLoader.load(PayService.class);
        for(PayService payService:services) {
            payService.pay();
        }
    }
}
