# WriteMeAFunction Language Guide

## Introduction
WriteMeAFunction is a natural language-inspired programming language that uses English-like syntax to make programming more accessible and intuitive. This guide will help you understand the language's grammar and provide examples to get you started.

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

Examples:
```scheme
Can you make result = 5 + 3 * 2
Can you make power = 2 ^ 3
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
```scheme
Can you make roll = ROLL
```

### User Input
```scheme
Ask them name
Tell them "Hello, " name?
```

## Complete Examples

### Example 1: Simple Calculator
```scheme
Write me a function called CALCULATE {
    Ask them num1
    Ask them num2
    Can you make sum = num1 + num2
    Tell them "The sum is " sum?
}

Can it CALCULATE?
```

### Example 2: Number Guessing Game
```scheme
Tell them "Welcome to the Number Guessing Game!"?
Tell them "I'm thinking of a number between 1 and 100"?
Tell them "You have 5 attempts to guess it"?
Tell them "Let's begin!"?

Can you make target = ROLL * 17
Can you make attempts = 5
Can you make guessed = 0

Write me a function called TEST {
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
        Can it TEST?
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
5. Add comments to explain complex logic

## Common Pitfalls

1. Forgetting the question mark after print statements
2. Using incorrect comparison operators
3. Not properly closing blocks
4. Forgetting to call functions with "Can it"
5. Using spaces in variable names

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

### Complex Expressions
```scheme
Can you make result = (5 + 3) * (2 ^ 3) / 4
```

### Multiple Conditions
```scheme
Will it x > 5 && y < 10 || z == 0? {
    Tell them "Complex condition met!"?
}
```

Remember to experiment and have fun with the language! The natural language syntax makes it easy to read and write code that almost reads like English.
