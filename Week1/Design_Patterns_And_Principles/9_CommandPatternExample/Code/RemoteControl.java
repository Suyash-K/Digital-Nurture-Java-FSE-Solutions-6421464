public class RemoteControl {
    private Command slot;

    // Set the command at this slot
    public void setCommand(Command command) {
        this.slot = command;
    }

    // Trigger the command
    public void pressButton() {
        if (slot != null) {
            slot.execute();
        }
    }
}