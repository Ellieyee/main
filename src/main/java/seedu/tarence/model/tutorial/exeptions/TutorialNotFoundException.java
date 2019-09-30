package seedu.tarence.model.tutorial.exeptions;

/**
 * Signals that the operation is unable to find the specified Tutorial.
 */
public class TutorialNotFoundException extends RuntimeException {
    public TutorialNotFoundException() {
        super ("Operation is unable to find the specified Tutorial.");
    }
}