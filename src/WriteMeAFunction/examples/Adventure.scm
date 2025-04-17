Tell them "Welcome to the Adventure Game!"?
Tell them "You are a brave adventurer exploring a mysterious dungeon."?
Tell them "You have 3 lives and need to find the treasure!"?

Can you make lives = 3
Can you make has_treasure = 0
Can you make current_room = 1
Can you make game_over = 0

Write me a function called MOVE {
    Tell them "Which direction would you like to go?"?
    Tell them "1. Forward"?
    Tell them "2. Left"?
    Tell them "3. Right"?
    Tell them "4. Back"?
    Ask them choice
    
    Can you make new_room = RAND
    Will it new_room > 10? {
        Can you make new_room = 10
    }
    Will it new_room < 1? {
        Can you make new_room = 1
    }
    
    Tell them "You move to room " new_room?
    Can you make current_room = new_room
}

Write me a function called ENCOUNTER {
    Can you make encounter_type = RAND
    Will it encounter_type > 80? {
        Tell them "You found a healing potion! +1 life"?
        Can you make lives = lives + 1
    }
    Will it encounter_type > 60? {
        Tell them "You found a treasure chest!"?
        Can you make has_treasure = 1
    }
    Will it encounter_type > 40? {
        Tell them "You found nothing interesting."?
    }
    Will it encounter_type > 20? {
        Tell them "A monster attacks! -1 life"?
        Can you make lives = lives - 1
    }
    Will it encounter_type > 0? {
        Tell them "You found a trap! -1 life"?
        Can you make lives = lives - 1
    }
}

Write me a function called CHECK_STATUS {
    Tell them "Current Status:"?
    Tell them "Lives: " lives?
    Tell them "Current Room: " current_room?
    Will it has_treasure == 1? {
        Tell them "You have found the treasure!"?
    }
}

Can you do until (game_over == 0) {
    Can it CHECK_STATUS?
    Can it MOVE?
    Can it ENCOUNTER?
    
    Will it lives <= 0? {
        Tell them "Game Over! You ran out of lives."?
        Can you make game_over = 1
    }
    Will it has_treasure == 1? {
        Tell them "Congratulations! You found the treasure and won the game!"?
        Can you make game_over = 1
    }
}

Tell them "Thanks for playing!"?
