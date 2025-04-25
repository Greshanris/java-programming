package week8_assignment;

/*
3. Quiz Management System
    - Creating a small quiz system with different question types (MCQ and True/False).
    - Using interfaces, ArrayList, enum, Scanner
    - Different question types, same method names (askQuestion, checkAnswer)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

enum Difficulty {
    EASY, MEDIUM, HARD
}

interface Question {
    void askQuestion(); // Displays the question
    boolean checkAnswer(String userAnswer); // Checks if the answer is correct
    Difficulty getDifficulty(); // Returns the difficulty of the question
}

class MCQQuestion implements Question {
    String question;
    String[] options;
    private String correctAnswer;
    Difficulty level;

    MCQQuestion(String question, String[] options, String correctAnswer, Difficulty level) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.level = level;
    }

    // Methods
    @Override
    public void askQuestion() {
        System.out.println("\n " + question + "?");
        System.out.println("\nA. " + options[0]);
        System.out.println("B. " + options[1]);
        System.out.println("C. " + options[2]);
        System.out.println("D. " + options[3]);
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        if (userAnswer == null || !userAnswer.matches("[A-Da-d]")) {
            System.out.println("Invalid input. Please enter A, B, C, or D.");
            return false;
        }
        boolean answer = userAnswer.equalsIgnoreCase(correctAnswer);
        System.out.println(answer ? "Correct Answer" : "Wrong Answer");
        return answer;
    }

    @Override
    public Difficulty getDifficulty() {
        return level;
    }
}

class TrueFalseQuestion implements Question{
    String question;
    private boolean correctAnswer;
    Difficulty level;

    TrueFalseQuestion(String question, boolean correctAnswer, Difficulty level) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.level = level;
    }

    // Methods
    @Override
    public void askQuestion() {
        System.out.println("\n" + question + "? Write down \"True\" or \"False\" instead of A or B.");
        System.out.println("\nA. True");
        System.out.println("B. False");
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        if (userAnswer == null || (!userAnswer.equalsIgnoreCase("true") && !userAnswer.equalsIgnoreCase("false"))) {
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
            return false;
        }
        boolean boolValue = Boolean.parseBoolean(userAnswer);
        boolean condition = boolValue == correctAnswer;
        System.out.println(condition ? "Correct Answer" : "Wrong Answer");
        return condition;
    }

    @Override
    public Difficulty getDifficulty() {
        return level;
    }
}

public class QuizManagementSystem {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();

        // Adding Sample MCQ Questions
        String[] mcqOptions = {"C++", "Java", "Python", "Golang"};
        questions.add(new MCQQuestion("Which Programming Language are we learning?", mcqOptions, "B", Difficulty.EASY));

        // Adding sample True/False question
        questions.add(new TrueFalseQuestion("The Desert is hot at night.", false, Difficulty.HARD));

        // Now taking user input and shuffling questions
        Collections.shuffle(questions); // shuffling

        Scanner scanner = new Scanner(System.in); // taking user input
        int score = 0; // initializing score
        int totalQuestions = questions.size(); //

        // iterating through questions
        for (Question question : questions) {
            question.askQuestion();
            System.out.println("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (question.checkAnswer(userAnswer)) {
                score++;
            }
            System.out.println("Difficulty: " + question.getDifficulty());
        }

        // final score
        System.out.println("\nQuiz completed! Your score: " + score + "/" + totalQuestions);
        scanner.close();
    }
}
