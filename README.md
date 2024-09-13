# Sudoku Game

A simple, interactive Sudoku game built with **HTML**, **CSS**, and **JavaScript**. This project allows users to play a Sudoku puzzle directly in the browser and check their solution for correctness.

## Features

- **Responsive Design**: The game layout is built with CSS Grid and adjusts well on various screen sizes.
- **Solution Check**: Users can input numbers and click a button to verify their solution.
- **Initial Puzzle**: Some numbers are pre-filled to get the user started on the puzzle.
- **Error Handling**: An error message is displayed if the user’s solution is incorrect.

## Technologies Used

- **HTML**: Structure of the webpage.
- **CSS**: Styling and layout for the Sudoku game.
- **JavaScript**: Logic to handle the Sudoku game behavior and solution checking.

## Getting Started

Follow these steps to get the project up and running on your local machine.

### Prerequisites

- A modern web browser such as **Google Chrome**, **Firefox**, or **Edge**.
- You can use any code editor, but **Visual Studio Code (VSCode)** is recommended.

### Running the Project

1. **Clone the repository**:

    Open your terminal or command prompt, and run the following command to clone the project to your local machine:

    ```bash
    git clone https://github.com/your-username/sudoku-game.git
    ```

2. **Open the project folder**:

    Navigate to the project directory:

    ```bash
    cd sudoku-game
    ```

3. **Run the project**:

    - If you're using **VSCode**, you can install the **Live Server** extension for real-time browser updates.
    - After installing Live Server, right-click on the `index.html` file and select **Open with Live Server** to run the project.
    
    Alternatively, you can manually open the `index.html` file in your browser by locating it in your file explorer and double-clicking.

### How to Play

1. **Start the Game**:
   - Open the game in your web browser. You will see a 9x9 Sudoku grid.
   - Some cells are pre-filled with numbers; these are part of the initial puzzle and cannot be changed.

2. **Input Numbers**:
   - Click on any empty cell in the grid (where there are no pre-filled numbers).
   - Use your keyboard to enter numbers between 1 and 9.

3. **Check Your Solution**:
   - Once you have filled in all the empty cells with your answers, click the **"Check Solution"** button.
   - If the solution is correct, you will receive a success message, and the button will turn green.
   - If there are errors, an error message will appear, and you can adjust your solution and try again.

4. **Fix Mistakes**:
   - If the solution is incorrect, revisit the cells with incorrect values, make the necessary changes, and click the **"Check Solution"** button again to verify your new solution.

5. **Complete the Puzzle**:
   - Keep playing until your solution is correct! The game will notify you once you have solved the puzzle.


### File Structure

```bash
sudoku-game/
│
├── index.html      # Main HTML file for the Sudoku game
├── style.css       # CSS file for styling the game
└── script.js       # JavaScript file containing game logic

