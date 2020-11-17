package tech.clayclaw.reactantjavaexample.config;

/**
 * Just a very simple POJO
 */
public class ExampleConfig {

    public String username = "unknown";
    public int count = 1;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
