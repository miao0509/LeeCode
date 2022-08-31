package white.test;

import white.Utils.executePool;

import java.util.concurrent.ThreadPoolExecutor;

public class textExecutePool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = executePool.getExecutor();
        executor.shutdown();
    }
}
