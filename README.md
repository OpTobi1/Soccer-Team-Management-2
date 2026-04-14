# Soccer Team Management System 

A Java-based soccer team management system demonstrating Object-Oriented Programming (OOP) principles, inheritance, and polymorphism.

## Overview
This project manages a roster of soccer players with different roles (Goalkeeper, Defence, Midfield, and Forward). The system can randomly update player statistics, sort players based on their performance, and draft an optimal team based on specific tactical requirements.

## Features
- **Class Hierarchy:** Utilizes a base `SoccerPlayer` class and dedicated subclasses for each specific field role.
- **Statistics Management:** Tracks role-specific achievements (saves, tackles, passes, and goals).
- **Advanced Sorting:** Sorts players from highest to lowest statistics using a custom sorting algorithm.
- **Smart Team Drafting:** Automatically selects the best players to build a complete team based on required positions.

## Project Structure
- `SoccerPlayer`: The parent class for all players.
- `Goalkeeper`, `Defence`, `Midfield`, `Forward`: Subclasses implementing specific properties and behaviors for each role.
- `MainSoccerTeam`: The main executable class that runs the simulation, updates stats, and builds the team.

