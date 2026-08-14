# Solution documentation

## Problem

Ganji-Ho is played by placing two-cell pieces on a square board. One orientation is horizontal and the other vertical. A move must fit on the board and cannot overlap an occupied cell. The implementation needed to support two human players and a computer opponent while keeping the desktop UI responsive.

## Solution overview

The application uses a Swing `JFrame` as both the presentation layer and the game coordinator:

1. `GanjiHo.main` starts the Swing event-dispatch thread.
2. `Grid` creates the 8 × 8 board and attaches a mouse handler to every cell.
3. A click is checked against orientation and occupancy rules.
4. A legal move updates two cells and advances the turn.
5. Win and draw counters are updated when no valid continuation remains.
6. In computer modes, candidate continuations are evaluated through a bounded, depth-specific game tree. `Node` carries the score and alpha/beta bounds used to discard inferior branches.

## Main components

| Component | Responsibility |
| --- | --- |
| `GanjiHo` | Starts the application on Swing's UI thread. |
| `Grid` | Builds the board, handles input, validates moves, tracks turns, and selects computer moves. |
| `Node` | Stores a search node's score and alpha/beta values. |
| `GridProduct*` | Holds state extracted during the refactoring exercise. |

## Key decisions

- **Swing for delivery:** Swing provided a dependency-free desktop UI suitable for the course environment.
- **Fixed 64-cell board:** The entry point supplies a size of 64, which the UI converts to an 8 × 8 grid.
- **Bounded search:** The computer player evaluates a limited number of plies instead of searching the full game tree.
- **State extraction:** Several values were moved into smaller `GridProduct*` classes as part of the refactoring work.

## Tradeoffs and limitations

- `Grid` combines UI, rules, state, and search, which makes isolated testing difficult.
- The search is expanded with depth-specific code rather than a reusable recursive minimax function.
- Board cells are declared as hundreds of individual fields even though an array is used at runtime.
- There is no automated test suite or build tool configuration.
- The current evaluation strategy should be treated as a prototype, not a competitive game AI.

## Recommended modernization

1. Introduce an immutable `Board` model with `legalMoves`, `apply`, and `isTerminal` operations.
2. Move minimax with alpha-beta pruning into a standalone, recursive `ComputerPlayer`.
3. Replace individual cell fields with a dynamically allocated array.
4. Add JUnit tests for boundary moves, overlap detection, terminal states, and search choices.
5. Add Gradle and a CI workflow so compilation and tests are reproducible.

## Validation

The documented commands target a standard JDK. Compilation was not executed during the documentation cleanup because the audit environment did not have a JDK installed. UI behavior also requires manual interaction because the project has no automated tests.
