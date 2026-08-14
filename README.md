# GanjiHo

A Java Swing implementation of the Ganji-Ho board game with local multiplayer and computer-opponent modes. The project was developed as a team coursework exercise in game search and later refactored to reduce several code smells.

## What it demonstrates

- Event-driven desktop UI development with Java Swing
- Board-state validation for horizontal and vertical moves
- A bounded game-tree evaluation that carries alpha and beta values
- Multiple play modes: player vs. player, player vs. computer, and computer vs. player
- Refactoring of a legacy, state-heavy codebase

## Technology

- Java
- Swing/AWT
- No external runtime dependencies

## Run locally

From the repository root:

```bash
mkdir -p out
javac -d out GanjiHo-master/src/*.java
java -cp out GanjiHo
```

The application opens an 8 × 8 board. Select a play mode, then click board cells to place pieces.

## Repository structure

```text
GanjiHo-master/
└── src/
    ├── GanjiHo.java       # Application entry point
    ├── Grid.java          # UI, rules, game state, and computer turns
    ├── Node.java          # Search-node values and alpha/beta bounds
    └── GridProduct*.java  # Extracted state/value objects
```

See [docs/SOLUTION.md](docs/SOLUTION.md) for the design, decision flow, and technical-debt assessment.

## Project status

This is a preserved 2016 coursework project. It is useful as a refactoring and search-algorithm case study, but it is not presented as production-ready game-engine architecture. The solution document identifies the clearest modernization path.

## Team project

The Git history records contributions from multiple collaborators. Commit history remains the source of truth for individual changes.
