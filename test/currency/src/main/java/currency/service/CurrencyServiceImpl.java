package currency.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements ICurrencyService{
    @Override
    public double curent(String usd) {
        double vnd = Double.parseDouble(usd)*23000 ;
        return vnd;
    }
}
