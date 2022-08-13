package programmerzamannow.spring.creational.factory.abstracts;

public interface PaymentFactory {

  ChargePaymentRequest createRequest();

  CancelPaymentRequest createCancelRequest();

  GetBalancePaymentRequest createGetBalanceRequest();

}
