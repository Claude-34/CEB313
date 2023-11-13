import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CheckerBoard extends JFrame implements ActionListener {

    // constants for the number of rows and columns
    private static final int ROWS = 8;
    private static final int COLS = 8;

    // array of buttons to represent the cells
    private JButton[][] buttons;

    // constructor
    public CheckerBoard() {
        // set the title and layout of the frame
        super("CheckerBoard");
        setLayout(new GridLayout(ROWS, COLS));

        // create and add the buttons to the frame
        buttons = new JButton[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                // create a new button
                buttons[i][j] = new JButton();

                // set the background color to black or white alternately
                if ((i + j) % 2 == 0) {
                    buttons[i][j].setBackground(Color.WHITE);
                } else {
                    buttons[i][j].setBackground(Color.BLACK);
                }

                // add an action listener to the button
                buttons[i][j].addActionListener(this);

                // add the button to the frame
                add(buttons[i][j]);
            }
        }

        // pack and display the frame
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // handle the button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        // get the source of the event
        JButton source = (JButton) e.getSource();

        // toggle the background color of the source button
        if (source.getBackground() == Color.WHITE) {
            source.setBackground(Color.BLACK);
        } else {
            source.setBackground(Color.WHITE);
        }
    }

    // main method to test the program
    public static void main(String[] args) {
        CheckerBoard board = new CheckerBoard();
    }
}