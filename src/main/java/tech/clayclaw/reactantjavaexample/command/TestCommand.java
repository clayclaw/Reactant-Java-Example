package tech.clayclaw.reactantjavaexample.command;

import dev.reactant.reactant.extra.command.ReactantCommand;
import org.bukkit.Bukkit;
import picocli.CommandLine;

@CommandLine.Command(
        name = "test",
        mixinStandardHelpOptions = true, // come with default --help option
        description = {
                "Just a test command"
        }
)
public class TestCommand extends ReactantCommand {

    @CommandLine.Option(names = {"-a", "--anonymous"}, description = "Hide your name from the test message")
    boolean anonymous = false;

    @CommandLine.Parameters(arity = "1", paramLabel = "MESSAGE", description = { "Message to be sent" })
    String message = "";

    @Override
    public void execute() {
        Bukkit.broadcastMessage((anonymous ? "" : sender.getName()) + " > " + message);
    }

}
