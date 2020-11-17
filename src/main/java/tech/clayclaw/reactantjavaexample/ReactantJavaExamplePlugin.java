package tech.clayclaw.reactantjavaexample;

import dev.reactant.reactant.core.ReactantPlugin;
import org.bukkit.plugin.java.JavaPlugin;

@ReactantPlugin(servicePackages = {
        "tech.clayclaw.reactantjavaexample" // All class under this package will be scanned
})
public class ReactantJavaExamplePlugin extends JavaPlugin {
    // add a get instance method if you wish to
}
