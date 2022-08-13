package programmerzamannow.spring.creational.factory.abstracts;

import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.creational.factory.abstracts.bcaklikpay.BcaGetBalancePaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.bcaklikpay.BcaKlikpayCancelPaymentRequest;
import programmerzamannow.spring.creational.factory.abstracts.gopay.GopayChargePaymentRequest;

@Configuration
public class GopayPaymentFactory implements PaymentFactory{

  @Override
  public ChargePaymentRequest createRequest() {
    return new GopayChargePaymentRequest();
  }

  @Override
  public CancelPaymentRequest createCancelRequest() {
    return new BcaKlikpayCancelPaymentRequest();
  }

  @Override
  public GetBalancePaymentRequest createGetBalanceRequest() {
    return new BcaGetBalancePaymentRequest();
  }
}
