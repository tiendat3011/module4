package caculator.service;

import org.springframework.stereotype.Service;

@Service
public class ICalculatorServiceImpl implements CalculatorService {
    @Override
    public double calculator(double num1, double num2, char check) {
        switch (check) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                throw new RuntimeException(" Lỗi");
        }
    }
}
