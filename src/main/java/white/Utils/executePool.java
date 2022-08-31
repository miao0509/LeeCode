package white.Utils;

import java.util.concurrent.ThreadPoolExecutor;

public class executePool {
    private static ThreadPoolExecutor executor;

    public static ThreadPoolExecutor getExecutor() {
        return executor;
    }

    public void setExecutor(ThreadPoolExecutor executor) {
        this.executor = executor;
    }
}

