# WriteMeALanguage Language Guide

## Introduction
WriteMeALanguage is a natural language-inspired programming language that uses English-like syntax to make programming more accessible and intuitive. This guide will help you understand the language's grammar and provide examples to get you started.

## Basic Syntax

### Variables and Assignment
```scheme
Can you make x = 5
Can you make y = 10
```

### Arithmetic Operations
- Addition: `+`
- Subtraction: `#`
- Multiplication: `*`
- Division: `/`
- Exponentiation: `^`

Note: Complex arithmetic expressions with multiple operations may not work as expected. It's recommended to break down complex calculations into simpler steps using intermediate variables.

Example:
```scheme
Can you make a = 5
Can you make b = 3
Can you make sum = a + b
```

### Numbers
- Integers: `5`, `-10`
- Decimals: `3.14`, `-2.5`

### String Literals
```scheme
Tell them "Hello, World!"?
```

### Boolean Operations
- AND: `&&`
- OR: `||`
- Comparisons: `>`, `<`, `>=`, `<=`, `==`, `!=`

Examples:
```scheme
Will it x > 5 && y < 10? {
    Tell them "Condition met!"?
}
```

## Control Structures

### If Statements
```scheme
Will it condition? {
    Tell them "True branch"?
}
```

### While Loops
```scheme
Can you do until (condition) {
    Tell them "Looping..."?
}
```

### Blocks
```scheme
{
    Tell them "First statement"?
    Tell them "Second statement"?
}
```

## Functions

### Function Definition
```scheme
Write me a function called GREET {
    Tell them "Hello!"?
    Tell them "Welcome to my program!"?
}
```

### Function Call
```scheme
Can it GREET?
```

## Special Features

### Random Number Generation
The RAND function generates a random integer between 0 and 99 (inclusive).
```scheme
Can you make random_num = RAND
```

To generate random numbers in different ranges, you can use conditional statements. Here are some examples:

1. Dice Roll (1-6):
```scheme
Write me a function called DICE_ROLL {
    Can you make roll = RAND
    Can you make result = 1
    Will it roll > 83? {
        Can you make result = 6
    }
    Will it roll > 66 && roll < 84? {
        Can you make result = 5
    }
    Will it roll > 49 && roll < 67? {
        Can you make result = 4
    }
    Will it roll > 32 && roll < 50? {
        Can you make result = 3
    }
    Will it roll > 16 && roll < 33? {
        Can you make result = 2
    }
    Tell them result?
}
```

2. Random Percentage (0-99):
```scheme
Can you make percentage = RAND
Tell them "Percentage: " percentage?
```

### User Input
```scheme
Ask them name
Tell them "Hello, " name?
```

## Complete Examples

### Example 1: Simple Calculator
```scheme
Write me a function called ADD {
    Ask them num1
    Ask them num2
    Can you make sum = num1 + num2
    Tell them "The sum is " sum?
}

Can it ADD?
```

### Example 2: Number Guessing Game
```scheme
Tell them "Welcome to the Number Guessing Game!"?
Tell them "I'm thinking of a number between 0 and 99"?
Tell them "You have 5 attempts to guess it"?
Tell them "Let's begin!"?

Can you make target = RAND
Can you make attempts = 5
Can you make guessed = 0

Write me a function called TOO_LOW {
    Tell them "Too low!"?
}

Can you do until (attempts > 0 && guessed == 0) {
    Tell them "Attempts remaining: " attempts?
    Ask them guess
    Can you make attempts = attempts - 1

    Will it guess > target? {
        Tell them "Too high!"?
    }

    Will it guess < target? {
        Can it TOO_LOW?
    }

    Will it guess == target? {
        Tell them "Congratulations! You guessed it!"?
        Can you make guessed = 1
    }
}

Will it guessed == 0? {
    Tell them "Game over! The number was " target?
}
```

## Best Practices

1. Always end print statements with a question mark (?)
2. Use descriptive variable names
3. Group related operations in blocks
4. Use functions to organize your code
5. Break down complex arithmetic operations into simpler steps
6. Use conditional statements for scaling random numbers
7. Add comments to explain complex logic

## Common Pitfalls

1. Forgetting the question mark after print statements
2. Using incorrect comparison operators
3. Not properly closing blocks
4. Forgetting to call functions with "Can it"
5. Using spaces in variable names
6. Using complex arithmetic expressions in a single line
7. Trying to use decimal arithmetic directly (use integers instead)

## Advanced Features

### Nested Functions
```scheme
Write me a function called OUTER {
    Write me a function called INNER {
        Tell them "Inside inner function"?
    }
    Can it INNER?
}

Can it OUTER?
```

### Multiple Conditions
```scheme
Will it x > 5 && y < 10 || z == 0? {
    Tell them "Complex condition met!"?
}
```

Remember to experiment and have fun with the language! The natural language syntax makes it easy to read and write code that almost reads like English. 
