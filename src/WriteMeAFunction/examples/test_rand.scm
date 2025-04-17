Tell them "Testing RAND function..."?

Can you make num1 = RAND
Tell them "Random number 1: " num1?

Can you make num2 = RAND
Tell them "Random number 2: " num2?

Can you make num3 = RAND
Tell them "Random number 3: " num3?

Tell them "Testing scaled random numbers..."?

Write me a function called DICE_ROLL {
    Can you make roll = RAND
    Can you make result = 1
    Will it roll > 83? {
        Can you make result = 6
    }
    Will it roll > 66? {
        Can you make result = 5
    }
    Will it roll > 49? {
        Can you make result = 4
    }
    Will it roll > 32? {
        Can you make result = 3
    }
    Will it roll > 16? {
        Can you make result = 2
    }
    Tell them result?
}

Tell them "Rolling a dice (1-6): "?
Can it DICE_ROLL?

Tell them "Random percentage (0-99): " num1? 