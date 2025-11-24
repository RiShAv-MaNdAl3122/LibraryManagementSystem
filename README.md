🚌 Blue Bus - Reservation System

A smart, console-based Java application for managing bus reservations with a visual seat selection interface.

🌟 Project Overview

Blue Bus is a project built to demonstrate Object-Oriented Programming (OOP) and File Handling concepts in Java. It solves the problem of "blind booking" by offering a visual map of the bus, allowing passengers to pick their specific seats (Window/Aisle) before confirming a ticket.

✨ Key Features

Visual Seat Map: A dynamic grid display allowing users to see the bus layout (Rows/Columns) and identify free seats instantly.

Real-time Booking: Prevents duplicate bookings for the same seat through robust validation logic.

Data Persistence: All bookings and bus data are saved to local .dat files automatically using Java Serialization.

Admin Dashboard: Functionality to view all buses in the fleet and the complete booking history.

🛠️ Technology Stack

Language: Java (JDK 17+)

Concepts Used: * Object-Oriented Programming (Encapsulation, Classes, Objects)

Collections Framework (ArrayList, List)

File I/O (Object Serialization for data storage)

Exception Handling

Tools: Git, IntelliJ IDEA / Eclipse / VS Code

🚀 How to Run

Clone the repository:

git clone [https://github.com/your-username/Blue-Bus-System.git](https://github.com/your-username/Blue-Bus-System.git)


Compile the code:
Navigate to the project root and run:

javac src/*.java -d out


Run the application:

java -cp out Main


📸 Usage Guide

Start the App: Run the Main class.

Book a Ticket: Select Option 2 from the main menu.

Choose a Bus: Enter a Bus ID (e.g., B-101).

Pick a Seat: The system will display a map ([ ] = Empty, [X] = Booked). Enter your desired Row and Column.

Confirmation: Enter passenger details to receive your unique Ticket ID.

📂 Project Structure

Blue-Bus-System/
├── src/
│   ├── Main.java          # Entry point and UI logic
│   ├── Bus.java           # Data model for Bus (contains 2D seat array)
│   ├── Passenger.java     # Data model for Passenger details
│   ├── Booking.java       # Data model for Ticket transactions
│   ├── BusService.java    # Business logic and operations
│   └── DataManager.java   # File I/O handling
├── data/                  # Stores .dat files (generated after first run)
├── statement.md           # Problem statement and scope
└── README.md              # Project documentation
