Tell them "Welcome to the Simple Calculator!"?
Tell them "This calculator can perform basic arithmetic operations."?

Write me a function called ADD {
    Tell them "Enter first number:"?
    Ask them num1
    Tell them "Enter second number:"?
    Ask them num2
    Can you make sum = num1 + num2
    Tell them "The sum is: " sum?
}

Write me a function called SUBTRACT {
    Tell them "Enter first number:"?
    Ask them num1
    Tell them "Enter second number:"?
    Ask them num2
    Can you make difference = num1 # num2
    Tell them "The difference is: " difference?
}

Write me a function called MULTIPLY {
    Tell them "Enter first number:"?
    Ask them num1
    Tell them "Enter second number:"?
    Ask them num2
    Can you make product = num1 * num2
    Tell them "The product is: " product?
}

Write me a function called DIVIDE {
    Tell them "Enter first number:"?
    Ask them num1
    Tell them "Enter second number:"?
    Ask them num2
    Will it num2 == 0? {
        Tell them "Error: Cannot divide by zero!"?
    }
    Will it num2 != 0? {
        Can you make quotient = num1 / num2
        Tell them "The quotient is: " quotient?
    }
}

Write me a function called POWER {
    Tell them "Enter base number:"?
    Ask them base
    Tell them "Enter exponent:"?
    Ask them exponent
    Can you make result = base ^ exponent
    Tell them "The result is: " result?
}

Tell them "Choose an operation:"?
Tell them "1. Add"?
Tell them "2. Subtract"?
Tell them "3. Multiply"?
Tell them "4. Divide"?
Tell them "5. Power"?
Ask them choice

Will it choice == 1? {
    Can it ADD?
}
Will it choice == 2? {
    Can it SUBTRACT?
}
Will it choice == 3? {
    Can it MULTIPLY?
}
Will it choice == 4? {
    Can it DIVIDE?
}
Will it choice == 5? {
    Can it POWER?
}

Tell them "Thank you for using the calculator!"?
