// Initial Sudoku numbers (0 represents an empty cell)
const initialNumbers = [
    [6, 4, 0, 0, 9, 0, 0, 0, 0],
    [7, 0, 0, 5, 0, 2, 0, 0, 0],
    [0, 8, 0, 0, 0, 1, 0, 7, 0],
    [8, 0, 0, 0, 7, 0, 0, 0, 5],
    [4, 0, 0, 8, 0, 5, 0, 0, 7],
    [0, 0, 7, 0, 1, 0, 0, 0, 4],
    [0, 5, 0, 0, 0, 0, 7, 3, 0],
    [0, 0, 0, 1, 3, 8, 0, 0, 2],
    [0, 0, 0, 0, 5, 0, 6, 1, 8]
];

// Sudoku solution
const solution = [
    [6, 4, 5, 3, 9, 7, 2, 8, 1],
    [7, 1, 3, 5, 8, 2, 9, 4, 6],
    [2, 8, 9, 6, 4, 1, 5, 7, 3],
    [8, 3, 2, 4, 7, 6, 1, 9, 5],
    [4, 9, 1, 8, 2, 5, 3, 6, 7],
    [5, 6, 7, 9, 1, 3, 8, 2, 4],
    [1, 5, 8, 2, 6, 4, 7, 3, 9],
    [9, 7, 6, 1, 3, 8, 4, 5, 2],
    [3, 2, 4, 7, 5, 9, 6, 1, 8]
];

// Generate the Sudoku grid
function generateGrid() {
    const grid = document.getElementById('sudoku-grid');
    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            const input = document.createElement('input');
            input.type = 'text';
            input.maxLength = 1; // Only allow one digit input
            if (initialNumbers[i][j] !== 0) {
                input.value = initialNumbers[i][j];
                input.readOnly = true; // Make initial numbers non-editable
            }
            grid.appendChild(input);
        }
    }
}

// Check if the user input matches the solution
function checkSolution() {
    const grid = document.getElementById('sudoku-grid').getElementsByTagName('input');
    let correct = true;

    for (let i = 0; i < 9; i++) {
        for (let j = 0; j < 9; j++) {
            const userInput = grid[i * 9 + j].value;
            if (userInput !== '' && parseInt(userInput) !== solution[i][j]) {
                correct = false;
                break;
            }
        }
    }

    if (correct) {
        alert('Congratulations! The solution is correct.');
        document.getElementById('check-button').style.backgroundColor = 'green';
    } else {
        alert('Oops! There is an error in the solution. Try again.');
        document.getElementById('check-button').style.backgroundColor = '';
    }
}

// Initialize the game on page load
window.onload = function() {
    generateGrid();

    // Add event listener to the Check button
    document.getElementById('check-button').addEventListener('click', checkSolution);
};
