package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String calculator(String num1, String num2, char check) {
        String a = "";
        try{
            double input1 = Double.parseDouble(num1);
            double input2 = Double.parseDouble(num2);
            switch (check) {
                case '+':
                    a += input1 + input2;
                    break;
                case '-':
                    a += input1 - input2;
                    break;
                case '*':
                    a += input1 * input2;
                    break;
                case '/':
                    if (input2 == 0) {
                         a += "không chia duoc";
                    } else
                        a+= input1 / input2;
                    break;
            }
        }catch (NumberFormatException e){
            a += " sai format";
        }
       return a;
    }
}
