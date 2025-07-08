# S103-Patterns_1

A simple Java project with clear examples of three classic design patterns: **Singleton**, **Abstract Factory**, and **Command**. Each pattern is implemented in a dedicated exercise, with a `Main` class demonstrating its usage.  
The project uses **Java 21** and was developed with **IntelliJ IDEA**.

## Table of Contents

- [Project Structure](#project-structure)
- [Exercises Overview](#exercises-overview)
  - [Level 1: Singleton](#level-1-singleton)
  - [Level 2: Abstract Factory](#level-2-abstract-factory)
  - [Level 3: Command](#level-3-command)
- [How to Run](#how-to-run)
- [How to Contribute](#how-to-contribute)
- [License](#license)

## Project Structure

```
S103-Patterns_1/
│
├── level1/    # Singleton pattern (Undo command)
├── level2/    # Abstract Factory pattern (International Contacts)
├── level3/    # Command pattern (Parking with vehicles)
└── README.md
```

## Exercises Overview

### Level 1: Singleton

**Goal:**  
Implement a class that replicates the behavior of the `Undo` command, using the Singleton pattern.

- The `Undo` class stores the latest commands entered.
- Allows adding, removing, and listing recent commands (similar to the `history` command in Linux).
- Only one instance of `Undo` exists throughout the application.
- The `Main` class demonstrates usage via console input.

### Level 2: Abstract Factory

**Goal:**  
Create a small manager for international addresses and phone numbers.

- The application lets you add addresses and phone numbers to an agenda.
- Supports different formats for different countries.
- Uses the Abstract Factory pattern to build addresses and phone numbers according to country-specific rules.
- The `Main` class shows how to add and display contacts using different factories.

### Level 3: Command

**Goal:**  
Design a parking lot for four vehicles: car, bicycle, plane, and boat.

- Demonstrates the Command pattern by encapsulating actions (`start`, `accelerate`, `brake`) for each vehicle type.
- Each action is a separate command object.
- The `Main` class creates vehicles, commands, and executes them to show how the pattern works.

## How to Run

1. **Clone the repository:**
   ```
   git clone https://github.com/mxg952/S103-Patterns_1.git
   ```

2. **Open the project in IntelliJ IDEA (recommended) or your preferred Java IDE.**

3. **Make sure Java 21 is installed and set as the project SDK.**

4. **Navigate to the desired level (`level1`, `level2`, `level3`) and run the `Main` class.**
   - Each `Main` class demonstrates the pattern with clear output in the console.

## How to Contribute

Contributions are welcome!  
If you want to improve the code, add more patterns, fix bugs, or suggest enhancements:

1. **Fork the repository.**
2. **Create a new branch** for your feature or fix.
3. **Commit your changes** with clear messages.
4. **Open a Pull Request** describing your contribution.

**Suggestions for contributions:**
- Add more design pattern examples (Builder, Observer, etc.).
- Improve documentation and code comments.
- Add unit tests for the patterns.
- Refactor code for better readability or structure.

## License

This project is open-source and free to use for learning purposes.  
Feel free to adapt or extend it for your own studies or projects.

