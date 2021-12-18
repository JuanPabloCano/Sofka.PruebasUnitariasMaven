package calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtraction(Long number1, Long number2) {
        logger.info( "Subtracting {} + {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplication(Long number1, Long number2) {
        logger.info( "Multiplying {} + {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) throws IllegalArgumentException {
        if (number2 == 0){
            throw new IllegalArgumentException("Error, no se puede dividir por cero");
        }
        logger.info( "Dividing {} + {}", number1, number2 );
        return number1 / number2;
    }
}
