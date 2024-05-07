import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SudokuGame extends JFrame {

    private JTextField[][] grid;
    private JButton checkButton;

    public SudokuGame() {
        super("Sudoku Game");

        grid = new JTextField[9][9];
        initializeUI();
        initializeNumbers();  // Initialize Sudoku numbers
    }

    private void initializeUI() {
        JPanel sudokuPanel = new JPanel(new GridLayout(9, 9, 2, 2));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = new JTextField();
                grid[i][j].setHorizontalAlignment(JTextField.CENTER);
                sudokuPanel.add(grid[i][j]);

                // Set increased size for rows and columns
                if (i % 3 == 0) {
                    grid[i][j].setFont(new Font("Arial", Font.BOLD, 14));
                }
                if (j % 3 == 0) {
                    grid[i][j].setFont(new Font("Arial", Font.BOLD, 14));
                }
            }
        }

        checkButton = new JButton("Check Solution");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkSolution();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(checkButton);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(sudokuPanel, BorderLayout.CENTER);
        container.add(buttonPanel, BorderLayout.SOUTH);

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initializeNumbers() {
        // Sudoku puzzle with solution (user can modify these initial values)
        int[][] initialNumbers = {
                {9, 5, 0, 0, 2, 0, 0, 0, 0},
                {1, 0, 0, 7, 5, 9, 0, 0, 0},
                {0, 7, 6, 0, 0, 0, 0, 5, 0},
                {3, 0, 0, 0, 7, 0, 0, 0, 8},
                {4, 0, 0, 9, 0, 6, 0, 0, 2},
                {7, 0, 0, 0, 4, 0, 0, 0, 5},
                {6, 3, 0, 0, 0, 2, 5, 4, 0},
                {0, 0, 0, 4, 9, 7, 0, 0, 6},
                {0, 0, 0, 0, 6, 0, 0, 2, 7}
        };

        // Display initial numbers in the grid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (initialNumbers[i][j] != 0) {
                    grid[i][j].setText(String.valueOf(initialNumbers[i][j]));
                    grid[i][j].setEditable(false);  // Disable editing for initial numbers
                }
            }
        }
    }

    private void checkSolution() {
        int[][] solution = {
                
                {9, 5, 3, 6, 2, 1, 7, 8, 4},
                {1, 4, 8, 7, 5, 9, 2, 6, 3},
                {2, 7, 6, 8, 3, 4, 9, 5, 1},
                {3, 6, 9, 2, 7, 5, 4, 1, 8},
                {4, 8, 5, 9, 1, 6, 3, 7, 2},
                {7, 1, 2, 3, 4, 8, 6, 9, 5},
                {6, 3, 7, 1, 8, 2, 5, 4, 9},
                {5, 2, 1, 4, 9, 7, 8, 3, 6},
                {8, 9, 4, 5, 6, 3, 1, 2, 7}
        };

        boolean correct = true;

        // Check if the user input matches the solution
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String userInput = grid[i][j].getText();
                if (!userInput.isEmpty()) {
                    int userValue = Integer.parseInt(userInput);
                    if (userValue != solution[i][j]) {
                        correct = false;
                        break;
                    }
                }
            }
        }

        // Display a message and change the button color
        if (correct) {
            JOptionPane.showMessageDialog(this, "Congratulations! The solution is correct");
            checkButton.setBackground(Color.GREEN);
        } else {
            JOptionPane.showMessageDialog(this, "Oops! There is an error in the solution. Try again.");
            // Set the button color back to the default color (you can customize this if needed)
            checkButton.setBackground(UIManager.getColor("Button.background"));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SudokuGame().setVisible(true);
            }
        });
    }
}