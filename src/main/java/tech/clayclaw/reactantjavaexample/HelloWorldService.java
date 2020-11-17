package tech.clayclaw.reactantjavaexample;

import dev.reactant.reactant.core.component.Component;
import dev.reactant.reactant.core.component.lifecycle.LifeCycleHook;
import dev.reactant.reactant.core.dependency.injection.Inject;
import tech.clayclaw.reactantjavaexample.common.IHelloWorldService;

@Component // Use this if you want to use @Inject, define this class as an component
public class HelloWorldService implements IHelloWorldService, LifeCycleHook {

    /**
     * Since the HelloWorldMessage is a component, we can call it with @Inject
     * No construction is needed, reactant will auto construct it
     */
    @Inject
    private HelloWorldMessage helloWorldMessage;

    @Override
    public void sayHello() {
        System.out.println(helloWorldMessage.message);
    }

    /**
     * onEnable, onDisable and onSave is provided by LifeCycleHook
     * You only have to implement it then it will work eventually
     */
    @Override
    public void onEnable() {
        sayHello();
    }

}
