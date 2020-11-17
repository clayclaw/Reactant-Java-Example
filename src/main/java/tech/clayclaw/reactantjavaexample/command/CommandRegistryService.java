package tech.clayclaw.reactantjavaexample.command;

import dev.reactant.reactant.core.component.Component;
import dev.reactant.reactant.core.component.lifecycle.LifeCycleHook;
import dev.reactant.reactant.core.dependency.injection.Inject;
import dev.reactant.reactant.extra.command.PicocliCommandService;

@Component
public class CommandRegistryService implements LifeCycleHook {

    @Inject
    private PicocliCommandService commandService;

    @Override
    public void onEnable() {

        // Honestly you will find it kinda dirty here since we are not using kotlin
        // Perhaps making a wrapper for java will be better and more elegant
        commandService.invoke(registering -> {
            registering.command(TestCommand::new, subCommands -> null);
            return null;
        });
    }
}
