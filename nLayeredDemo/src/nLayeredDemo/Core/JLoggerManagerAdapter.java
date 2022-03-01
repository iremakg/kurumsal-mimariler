package nLayeredDemo.Core;

import nLayeredDemo.JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystrem(String message) {
        JLoggerManager manager= new JLoggerManager();
        manager.log(message);
    }
}
