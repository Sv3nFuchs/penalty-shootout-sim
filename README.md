# Penalty Shootout Simulator:

Console-based penalty shootout simulation written in Java.

## How it works:

The user picks a team and an opponent, then takes a series of five penalty shots. To win, the user must score all five. The goal is represented as a 3x4 grid, and the user describes where they'd like to shoot by naming a position, such as "bottom right" or "top left". The user's score is tracked across shots, the result is revealed at the end of the program.

## Concepts used:

- 2D arrays to represent the goal.
- Random number generation for shot outcomes.
- User input with `Scanner`.
- Loops and methods for the game flow.
- Separate classes (`MyProgram` runs the game, `GamePen` holds the game logic).

## Running it:

Requires Java 17 or newer.

```
javac *.java
java MyProgram
```

Follow the prompts in the terminal.

## Possible improvements:

- Adding a traditional shootout with multiple users and lower requirements to win.
- Increasing the likelihood that the goal saves a shot.
- Adding a graphical interface.
- Letting the player choose a difficulty level.
