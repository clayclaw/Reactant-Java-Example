package tech.clayclaw.reactantjavaexample.config;

import dev.reactant.reactant.core.component.Component;
import dev.reactant.reactant.core.component.lifecycle.LifeCycleHook;
import dev.reactant.reactant.core.dependency.injection.Inject;
import dev.reactant.reactant.service.spec.config.Config;

@Component
public class ConfigService implements LifeCycleHook {

    /**
     * You only have to provide a class and a path
     * Reactant will automatically generate a config file for you
     *
     * SharedConfig and MultiConfigs are also available
     */
    @Inject(name = "plugins/ReactantJavaExample/config.json")
    private Config<ExampleConfig> config;

    @Override
    public void onEnable() {
        System.out.println("Username found in config: " + config.getContent().getUsername());
        System.out.println("Count found in config: " + config.getContent().getCount());
    }

    // read from config again without saving
    private void reloadConfig() {
        config.refresh().blockingAwait();
    }

    // save to config
    private void saveConfig() {
        config.save().blockingAwait();
    }

}
