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