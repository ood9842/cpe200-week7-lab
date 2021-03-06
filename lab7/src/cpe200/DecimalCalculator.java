package cpe200;

import java.math.BigDecimal;

public class DecimalCalculator extends BaseCalculator{

    public String add() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else
        {
            BigDecimal sent=first.add(second);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String subtract() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else
        {
            BigDecimal sent=first.subtract(second);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String multiply() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else
        {
            BigDecimal sent=first.multiply(second);
            return sent.stripTrailingZeros().toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(first.intValue()<0||second.intValue()<0)
        {
            throw new RuntimeException("Operand is negative");
        }
        else if(second.intValue()==0)
        {
            throw new ArithmeticException("ERROR divisor is zero");
        }
        else
        {
            BigDecimal sent=first.divide(second,5,5);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String power() throws RuntimeException {
        if (first.intValue() < 0 || second.intValue() < 0) {
            throw new RuntimeException("Operand is negative");
        } else {
            double dnum1 = first.doubleValue();
            double dnum2 = second.doubleValue();
            DoubleOperand temp = new DoubleOperand(Math.pow(dnum1, dnum2));
            BigDecimal sent = new BigDecimal(temp.getOperand());
            return sent.stripTrailingZeros().toString();
        }
    }
}
